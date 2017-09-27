package sortlab.utils;

import java.util.Comparator;

public class TrackingComparator<T extends Comparable<? super T>> implements Comparator<T> {
  public int comparisons;

  public TrackingComparator() {
    this.comparisons = 0;
  }

  public int compare(T a, T b) {
    this.comparisons++;
    return a.compareTo(b);
  }
}
