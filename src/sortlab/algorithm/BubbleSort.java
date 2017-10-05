package sortlab.algorithm;

import java.util.Comparator;
import java.lang.reflect.Array;

public final class BubbleSort<T> implements SortAlgorithmInterface<T> {
  public int passes = 0; //An array can't have more than Integer.MAX_VALUE-1
                         //(2^31 - 1) elements.  Theoretically there can be
                         //Integer.MAX_VALUE as the last pass (confirming
                         //sortedness) will take one final pass.

  public long swaps = 0; //In the worst case there will be n^2 swaps so this
                         //value can easily exceed Integer.MAX_VALUE
  private final Comparator<T> comparator;
  private final Class<T> of;

  public BubbleSort(Class<T> of, Comparator<T> comparator) {
    //A simple sorting algorithm that repeatedly steps through the list to be
    //sorted, compares each pair of adjacent items and swaps them if they are in
    //the wrong order. The pass through the list is repeated until no swaps are
    //needed, which indicates that the list is sorted.

    //Although the algorithm is simple, it is too slow and impractical for most
    //problems even when compared to insertion sort.[2] It can be practical if
    //the input is usually in sorted order but may occasionally have some
    //out-of-order elements nearly in position.

    //Source - https://en.wikipedia.org/wiki/Bubble_sort
    this.comparator = comparator;

    this.of = of;
  }

  public T[] sort(T[] input) {
    //Create a copy of the input array (we will be modifying it, this can occure
    //in place, but a copy is cleaner to trace when debugging)
    int size = input.length;

    @SuppressWarnings("unchecked")
    T[] sorted = (T[]) Array.newInstance(of, size);
    System.arraycopy(input, 0, sorted, 0, size);

    //This sort will be compled by sweeping over the array until it can get
    //through a full pass without swapping
    boolean swapped;
    do {
      //Start with the assumption that nothting needs to be swapped
      swapped = false;
      for(int n = 0; n < (size-1); n++) {
        int comparison = comparator.compare(sorted[n], sorted[n+1]);
        if(comparison > 0) { //the order should be swapped
          T temp_left = sorted[n];
          T temp_right = sorted[n+1];
          sorted[n] = temp_right;
          sorted[n+1] = temp_left;
          swapped = true; //repeat the loop at least one more time
          this.swaps += 1;
        }
      }
      //However if any swapping took place then the order has changed and the
      //sweep should be repeated

      this.passes += 1; //Record a single pass
    } while(swapped);

    return sorted;
  }
}
