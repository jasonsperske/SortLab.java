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
    //The example dataset should require N + N ln N comparisons (for an array
    //with 8 elements this should result in 32 comparison however the intial
    //arrayisn't heapified so an extra 5 comparisons are required)
    assertEquals(37, engine.comparisons, "comparisons");
    //and require 20 swaps
    assertEquals(20, engine.swaps, "swaps");
  }
}
