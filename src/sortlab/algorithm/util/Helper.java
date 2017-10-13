package sortlab.algorithm.util;

import java.lang.reflect.Array;

public final class Helper<T> {
  private final Class<T> of;

  public Helper(Class<T> of) {
    this.of = of;
  }

  public T[] copyOf(T[] input) {
    @SuppressWarnings("unchecked")
    T[] copy = (T[]) Array.newInstance(this.of, input.length);
    System.arraycopy(input, 0, copy, 0, input.length);
    return copy;
  }
}
