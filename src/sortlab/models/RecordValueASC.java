package sortlab.models;

import java.util.Comparator;

/*
 * A simple Record comparator that sorts by it's value property and in ascending
 * order
 */

public final class RecordValueASC implements Comparator<Record> {
  public RecordValueASC() {}

  public int compare(Record a, Record b) {
    return a.compareTo(b);
  }
}
