package sortlab.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import sortlab.models.Record;
import sortlab.models.RecordValueASC;
import sortlab.utils.DataGenerator;
import sortlab.utils.TrackingComparator;

class FatefulSortTests {
  //FatefulSort only operates over a VERY specific range of input values
  @Test
  void shouldSortListsThatAlreadySorted() {
    TrackingComparator<Record> comparator = new TrackingComparator<Record>(new RecordValueASC());
    SortAlgorithmInterface<Record> engine = new FatefulSort<Record>(comparator);

    Record[] unsorted = DataGenerator.alreadySorted();
    Record[] sorted = engine.sort(unsorted);

    for(int i = 0; i < unsorted.length; i++) {
      //Testing that not only are the values equal but that they are the exact same Record
      assertEquals(unsorted[i].toString(), sorted[i].toString());
    }

    //assert that no comparisons where made (as my son calls it, the only "O(0)"
    //algorithm)
    assertEquals(comparator.comparisons, 0);
  }
}
