package sortlab.models;

/*
 * A simple Record to be sorted.
 * This object has a value that a colleciton can be sorted by, a unique ID (to
 * test if a sort is stable) and a label to make it easier to reason about the
 * output.
 */

public final class Record implements Comparable<Record> {
  private final int id;
  private final int value;
  private final String label;

  public Record(int id, int value, String label) {
    this.id = id;
    this.value = value;
    this.label = label;
  }

  public int getId() {
    return this.id;
  }

  public int getValue() {
    return this.value;
  }

  public String getLabel() {
    return this.label;
  }

  public int compareTo(Record other) {
    return this.value - other.value;
  }

  public String toString() {
    return this.id+":"+this.value+" ("+this.label+")";
  }
}
