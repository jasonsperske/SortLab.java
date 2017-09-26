package sortlab.models;

/*
 * A simple Record to be sorted.
 * This object has a value that a colleciton can be sorted by, a unique ID (to
 * test if a sort is stable) and a label to make it easier to reason about the
 * output.
 */

public final class Record {
  public final int id;
  public final int value;
  public final String label;

  public Record(int id, int value, String label) {
    this.id = id;
    this.value = value;
    this.label = label;
  }

  public String toString() {
    return this.id+":"+this.value+" ("+this.label+")";
  }
}
