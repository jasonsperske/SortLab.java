package sortlab.models;

import java.util.Comparator;

public final class RecordValueASC implements Comparator<Record> {
  public RecordValueASC() {}

  public int compare(Record a, Record b) {
    return a.compareTo(b);
  }
}
