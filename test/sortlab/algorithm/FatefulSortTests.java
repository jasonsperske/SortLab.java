package sortlab.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import sortlab.models.Record;

class FatefulSortTests {
  SortAlgorithmInterface engine = new FatefulSort();

  //FatefulSort only operates over a VERY specific range of input values

  @Test
  void shouldSortListsThatAlreadySorted() {
    Record[] unsorted = new Record[3];
    unsorted[0] = new Record(1, 10, "A");
    unsorted[1] = new Record(2, 20, "B");
    unsorted[2] = new Record(3, 30, "C");

    Record[] sorted = engine.sort(unsorted);
    for(int i = 0; i < unsorted.length; i++) {
      assertEquals(unsorted[i].toString(), sorted[i].toString());
    }
  }
}
