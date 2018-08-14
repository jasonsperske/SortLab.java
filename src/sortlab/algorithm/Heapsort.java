package sortlab.algorithm;

import sortlab.algorithm.util.Helper;
import java.util.Comparator;

public final class Heapsort<T> implements SortAlgorithmInterface<T> {
  private final Comparator<T> comparator;
  private Helper<T> helper;

  public Heapsort(Class<T> of, Comparator<T> comparator) {
    //This sorting algorithm works by first re-ordering the input array so that
    //it has the heap property then traverses this new array to produce an
    //ordered array.  The heap property involved two concepts, a binary tree and
    //then a predictable ordering based on that tree.

    //[THE BINARY TREE]
    //A binary tree involves building a tree from left to right such that every
    //parent node is a numeric value that is always greater than or equal to the
    //numeric values of both of the child nodes (called a max-heap).

    //An example of a such a tree would look like this:
    //     42
    //    /  \
    //   19   36
    //  /  \
    // 17   1

    //[ARRAY FLATTENING]
    //Because the definition of a binary tree with heap property covers a strict
    //shape, you can flatten into array with a predictable traversal strategy.
    //To flatten simply order the elements in the same way you build the tree,
    //starting at the root, then the left node, then the right right.
    //Starting with our tree example this becomes:
    // [42, 19, 36, 17, 1]

    //These two steps can be completed at the same time and in-place on the
    //input array through a series of "fixes" (swaps).

    //Source - https://en.wikipedia.org/wiki/Heapsort
    this.comparator = comparator;
    this.helper = new Helper<T>(of);
  }

  public T[] sort(T[] input) {
    T[] heap = max_heapify(input);
    return heap;
  }

  private Node<T> max_heapify(T[] input) {
    T[] heapified = helper.copyOf(input);
    int index = heapified.length;
    if (index > 1) {
      // Something to actually sort
      if (index % 2 == 0) {
        // Special case, a left only node at the end
        T parent = parent(index - 1, heapified);
        T left = input[index - 1];
        int comparson = comparator.compare()
      }
    }


    return heapified;
  }

  private int getLeftChildIndex(int parentIndex) {
    return (2 * parentIndex) + 1;
  }

  private int getRightChildIndex(int parentIndex) {
    return (2 * parentIndex) + 2;
  }

  private int getParentIndex(int childIndex) {
    return (childIndex - 1) / 2;
  }

  private boolean hasLeftChild(int index, int size) {
    return getLeftChildIndex(index) < size;
  }

  private boolean hasRightChild(int index, int size) {
    return getRightChildIndex(index) < size;
  }

  private boolean hasParent(int index) {
    return getParentIndex(index) >= 0;
  }

  private T leftChild(int index, T[] items) {
    return items[getLeftChildIndex(index)];
  }

  private T rightChild(int index, T[] items) {
    return items[getRightChildIndex(index)];
  }

  private T parent(int index, T[] items) {
    return items[getParentIndex(index)];
  }
}
