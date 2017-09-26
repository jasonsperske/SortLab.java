package sortlab.models;

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
