package sortlab.algorithm;

import java.util.Comparator;

public interface SortAlgorithmInterface<T> {
  public T[] sort(T[] input, Comparator<T> comparator);
}
