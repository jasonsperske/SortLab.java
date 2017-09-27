package sortlab.utils;

import sortlab.models.Record;

public final class DataGenerator {
  public static Record[] alreadySorted() {
    Record[] data = new Record[3];

    data[0] = new Record(1, 10, "A");
    data[1] = new Record(2, 20, "B");
    data[2] = new Record(3, 30, "C");

    return data;
  }
}
