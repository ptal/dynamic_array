package ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {

  private  DynamicArray array;

  @BeforeEach
  void init() {
    array = new DynamicArray();
  }

  void populate() {
    array.add(4);
    array.add(5);
    array.add(6);
  }

  @Test
  @DisplayName("Clear elements in DynamicArray")
  void testClear() {
    testArrayContent(0, "");
    populate();
    array.clear();
    testArrayContent(0, "");
  }

  @Test
  @DisplayName("Search for an element in DynamicArray")
  void testIndexOf() {
    populate();
    assertEquals(array.indexOf(5), 1);
    assertEquals(array.indexOf(10), -1);
  }

  void testArrayContent(int size, String content) {
    assertEquals(array.toString(), content);
    assertEquals(array.size(), size);
    assertEquals(array.isEmpty(), size == 0);
  }

  @Test
  @DisplayName("Add elements in DynamicArray")
  void testAdd() {
    populate();
    testArrayContent(3, "4, 5, 6");
  }

  @Test
  @DisplayName("Remove elements in DynamicArray")
  void testRemove() {
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
   *
  @Test
  @DisplayName("Sort values in DynamicArray")
  void testSort() {
    array.add(2);
    array.add(1);
    array.add(3);
    array.add(6);
    array.add(5);
    array.add(4);
    Algorithm.sort(array);
    testArrayContent(6, "1, 2, 3, 4, 5, 6");
  }
  */

  /*
   * Uncomment for Exercise 5
   *
  @Test
  @DisplayName("Search a value in DynamicArray")
  void testSearch() {
    array.add(2);
    array.add(1);
    array.add(3);
    array.add(6);
    array.add(5);
    array.add(4);
    Algorithm.sort(array);
    assertEquals(Algorithm.search(array, 3), 2);
  }*/

}
