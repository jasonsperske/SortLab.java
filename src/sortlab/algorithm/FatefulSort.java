package sortlab.algorithm;

import java.util.Comparator;

public final class FatefulSort<T> implements SortAlgorithmInterface<T> {
  public FatefulSort() {
    //This is not a valid sorting algorithm. It was inspired by
    //https://xkcd.com/1185/ and will only work on data sets that (is if by fate)
    //are already sorted. Becuase it relies so much on fate it does not include
    //any error checking (if you can't trust fate then what good is error
    //checking)
  }

  public T[] sort(T[] input, Comparator<T> comparator) {
    //Behold the fastest sort (for already sorted sets)
    return input;
  }
}
