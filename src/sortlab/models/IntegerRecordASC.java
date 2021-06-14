package sortlab.models;

import java.util.Comparator;

/*
 * A simple Record comparator that sorts by it's value property and in ascending
 * order
 */

public final class IntegerRecordASC implements Comparator<IntegerRecord> {
  public IntegerRecordASC() {}

  public int compare(IntegerRecord a, IntegerRecord b) {
    return a.compareTo(b);
  }
}
