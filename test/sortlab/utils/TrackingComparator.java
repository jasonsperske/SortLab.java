package sortlab.utils;

import java.util.Comparator;

public class TrackingComparator<T extends Comparable<? super T>> implements Comparator<T> {
  public int comparisons;
  private final Comparator comparator;

  public TrackingComparator(Comparator comparator) {
    this.comparisons = 0;
    this.comparator = comparator;
  }

  public int compare(T a, T b) {
    this.comparisons++;
    return comparator.compare(a, b);
  }
}
