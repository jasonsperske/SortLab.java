package sortlab.models;

public final class IntegerRecord implements Comparable<IntegerRecord> {
  private final int value;
  public IntegerRecord(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public int compareTo(IntegerRecord that) {
    return this.value - that.value;
  }

  public String toString() {
    return this.value+" ";
  }
}
