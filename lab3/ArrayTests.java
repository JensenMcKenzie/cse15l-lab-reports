import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReverseInPlaceLength5() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedLength5() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowestLength5() {
    double[] input = { 0, 1, 2, 3, 4, 5 };
    double[] input2 = { -1, 1, 2, 3, 4, 5 };
    assertEquals(3, ArrayExamples.averageWithoutLowest(input), 0);
    assertEquals(3, ArrayExamples.averageWithoutLowest(input2), 0);
  }
}
