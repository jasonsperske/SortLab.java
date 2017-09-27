package sortlab.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import sortlab.models.Record;
import sortlab.utils.DataGenerator;
import sortlab.utils.TrackingComparator;

class FatefulSortTests {
  SortAlgorithmInterface<Record> engine = new FatefulSort<Record>();

  //FatefulSort only operates over a VERY specific range of input values
  @Test
  void shouldSortListsThatAlreadySorted() {
    TrackingComparator<Record> comparator = new TrackingComparator<Record>();

    Record[] unsorted = DataGenerator.alreadySorted();
    Record[] sorted = engine.sort(unsorted, comparator);

    for(int i = 0; i < unsorted.length; i++) {
      assertEquals(unsorted[i].toString(), sorted[i].toString());
    }

    //assert that no comparisons where made
    assertEquals(comparator.comparisons, 0);
  }
}
