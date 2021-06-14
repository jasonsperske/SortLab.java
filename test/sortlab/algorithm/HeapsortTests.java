package sortlab.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import sortlab.models.IntegerRecord;
import sortlab.models.IntegerRecordASC;
import sortlab.utils.DataGenerator;
import sortlab.utils.TrackingComparator;

import java.util.Arrays;

class HeapsortTests {
  @Test
  void shouldSortExampleSet() {
    TrackingComparator<IntegerRecord> comparator = new TrackingComparator<IntegerRecord>(new IntegerRecordASC());
    Heapsort<IntegerRecord> engine = new Heapsort<IntegerRecord>(IntegerRecord.class, comparator);

    IntegerRecord[] unsorted = DataGenerator.exampleIntegers();
    IntegerRecord[] sorted = engine.sort(unsorted);
    IntegerRecord[] reference = DataGenerator.sortedASCIntegers();

    for(int i = 0; i < reference.length; i++) {
      //Testing that the two arrays are in the correct order
      assertEquals(0, comparator.compare(reference[i], sorted[i]));
    }
    //The example dataset should require log(base 2)N + N + (N * log(base 2)N)
    //comparisons (for an array with 8 elements this should result in 35
    //comparisons however the intial array isn't heapified so an extra 2
    //comparisons are required)
    assertEquals(37, engine.comparisons, "comparisons");
    //and require 20 swaps
    assertEquals(20, engine.swaps, "swaps");
  }

  @Test
  void shouldSortPreHeapified() {
    TrackingComparator<IntegerRecord> comparator = new TrackingComparator<IntegerRecord>(new IntegerRecordASC());
    Heapsort<IntegerRecord> engine = new Heapsort<IntegerRecord>(IntegerRecord.class, comparator);

    IntegerRecord[] preheapified = DataGenerator.exampleIntegerHeap();
    IntegerRecord[] sorted = engine.sort(preheapified);
    IntegerRecord[] reference = DataGenerator.sortedASCIntegers();

    for(int i = 0; i < reference.length; i++) {
      //Testing that the two arrays are in the correct order
      assertEquals(0, comparator.compare(reference[i], sorted[i]));
    }
    //The example dataset should require log(base 2)N + N + (N * log(base 2)N)
    //(for an array with 8 elements that is already in man_heap order this
    //should result in 35 comparisons.
    assertEquals(35, engine.comparisons, "comparisons");
    //and require 16 swaps
    assertEquals(16, engine.swaps, "swaps");
  }
}
