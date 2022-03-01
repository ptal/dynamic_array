package ds;

/**
 * Implementation of a random-access resizable array.
 */
public class DynamicArray {
  private static int INITIAL_CAPACITY = 5;
  private int[] data;
  private int size;

  public DynamicArray() {
    data = new int[INITIAL_CAPACITY];
    size = 0;
  }

  private void checkIndex(int idx) {
    if (idx >= size) {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  /*
   * If the array `data` is full, then
   * 1. Create a new array `data2` doubling the size of `data`
   * 2. Copy the elements of `data` into `data2`
   * 3. Assign `data2` to `data`
   */
  private void realloc() {
  }

  /**
   * Return the value at the given index.
   * @param idx index of the value to return
   * @return the value at the given index
   * @throws ArrayIndexOutOfBoundsException
   *      if the index is not in the range <code>0</code> to <code>size()-1</code>
   */
  public int get(int idx) {
    return 0;
  }

  /**
   * Replace the value at the given index by the given value.
   * @param idx index at which the value is to be replaced
   * @param x value to store at the given index
   * @throws ArrayIndexOutOfBoundsException
   *      if the index is not in the range <code>0</code> to <code>size()-1</code>
   */
  public void set(int idx, int x) {
  }

  /**
   * Return the index of the first element equaling the given value.
   * @param x value to search for
   * @return the index of the first element equaling the given value, or -1 if no such element exists
   */
  public int indexOf(int x) {
    return -1;
  }

  /**
   * Add a value at the end of the array.
   * @param x value to add at the end of the array
   */
  public void add(int x) {
  }

  /**
   * Add a value at given position in the array.
   * @param x value to add at the end of the array
   * @param idx position at which the value is to be added
   */
  public void add(int x, int idx) {
  }

  /**
   * Remove the value at the given index.
   * @param idx index of the value to be removed
   * @throws ArrayIndexOutOfBoundsException
   *      if the index is not in the range <code>0</code> to <code>size()-1</code>
   */
  public void remove(int idx) {
  }

  /**
   * Return true if the array contains no value, false otherwise.
   * @return true if the array contains no value, false otherwise
   */
  public boolean isEmpty() {
    return true;
  }

  /**
   * Return the number of values in the array.
   * @return the number of values in the array
   */
  public int size() {
    return 0;
  }

  /**
   * Remove all of the values from the array.
   */
  public void clear() {
  }

  /**
   * Return a Java array containing all of the values in this array.
   * This method must allocate a new array. The caller is thus free to modify the returned array.
   * @return a Java array containing all of the values in this array
   */
  public int[] toArray() {
    return new int[0];
  }

  /**
   * Create a string with the values of the array separated by comma, without a new line character at the end.
   * For instance: 4, 5, 6
   */
  public String toString() {
    return "";
  }
}
