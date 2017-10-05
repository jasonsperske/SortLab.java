package sortlab.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import sortlab.models.Record;
import sortlab.utils.DataGenerator;
import sortlab.utils.TrackingComparator;

import java.util.Arrays;

class BubbleSortTests {
  @Test
  void shouldSortListsThatAlreadySorted() {
    //BubbleSort performs best with an input array that are already sorted
    TrackingComparator<Record> comparator = new TrackingComparator<Record>();
    BubbleSort<Record> engine = new BubbleSort<Record>(Record.class, comparator);

    Record[] unsorted = DataGenerator.alreadySorted();
    Record[] sorted = engine.sort(unsorted);

    //It should have looked at every element except the last
    assertEquals(unsorted.length - 1, comparator.comparisons, "comparisons made");

    for(int i = 0; i < unsorted.length; i++) {
      //Testing that the two arrays are in the correct order
      assertEquals(0, comparator.compare(unsorted[i], sorted[i]));
    }
    //By starting with a sorted array it should have only passed over the array
    //once
    assertEquals(1, engine.passes, "passes");
    //and there should be no swaps
    assertEquals(0, engine.swaps, "swaps");
  }

  @Test
  void shouldSortListsThatReversed() {
    //BubbleSort performs worst with an input array that is completly reversed.
    TrackingComparator<Record> comparator = new TrackingComparator<Record>();
    BubbleSort<Record> engine = new BubbleSort<Record>(Record.class, comparator);

    Record[] unsorted = DataGenerator.reverseSortedNoDuplicates();
    Record[] sorted = engine.sort(unsorted);

    //It should have looked at every element minus 1 for every pass minus the last
    assertEquals((unsorted.length - 1) * unsorted.length, comparator.comparisons, "comparisons made");

    Record[] sorted_reference = DataGenerator.alreadySortedNoDuplicates();
    for(int i = 0; i < sorted_reference.length; i++) {
      //Testing that the two arrays are in the correct order
      assertEquals(0, comparator.compare(sorted_reference[i], sorted[i]));
    }
    //By starting with a reversed array it should have passed over the array
    //for every element in the array
    assertEquals(unsorted.length, engine.passes, "passes");
    //and beucase there are no duplicate values in the array it shold have
    //swapped them 1 less than the length times length/2 (each swap brings the
    //overall array closer to order)
    assertEquals((unsorted.length - 1) * (unsorted.length / 2), engine.swaps, "swaps");
  }
}
