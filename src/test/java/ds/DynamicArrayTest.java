package ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {
  private DynamicArray array;

  @BeforeEach
  private void init() {
    array = new DynamicArray();
  }

  private void populate() {
    array.add(4);
    array.add(5);
    array.add(6);
  }

  private void populateAsExample() {
    array.add(2);
    array.add(1);
    array.add(3);
    array.add(6);
    array.add(5);
    array.add(4);
  }

  private void testArrayContent(int size, String content) {
    assertEquals(content, array.toString());
    assertEquals(size, array.size());
    assertEquals(size == 0, array.isEmpty());
  }

  @Test
  @DisplayName("Clear elements in DynamicArray")
  public void testClear() {
    testArrayContent(0, "");
    populate();
    array.clear();
    testArrayContent(0, "");
  }

  @Test
  @DisplayName("Search for an element in DynamicArray")
  public void testIndexOf() {
    populate();
    assertEquals(1, array.indexOf(5));
    assertEquals(-1, array.indexOf(10));
  }

  @Test
  @DisplayName("Add elements in DynamicArray")
  public void testAdd() {
    populate();
    testArrayContent(3, "4, 5, 6");
    array.add(10, 2);
    testArrayContent(4, "4, 5, 10, 6");
  }

  @Test
  @DisplayName("Remove elements in DynamicArray")
  public void testRemove() {
    populate();
    array.remove(1);
    testArrayContent(2, "4, 6");
    array.remove(1);
    testArrayContent(1, "4");
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(1));
    array.remove(0);
    testArrayContent(0, "");
  }

  /*
   * Uncomment for Exercise 4
   */
  @Test
  @DisplayName("Sort values in DynamicArray")
  public void testSort() {
    populateAsExample();
    Algorithm.sort(array);
    // testArrayContent(6, "1, 2, 3, 4, 5, 6");
  }

  /*
   * Uncomment for Exercise 5
   */
  @Test
  @DisplayName("Search a value in DynamicArray")
  void testSearch() {
    populateAsExample();
    Algorithm.sort(array);
    // assertEquals(Algorithm.search(array, 3), 2);
  }
}
