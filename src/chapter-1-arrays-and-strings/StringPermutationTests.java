import org.junit.*;

public class StringPermutationTests {
  @Test
  public void testPermutations() {
    assertPermutations("abc", "bca", true);
    assertPermutations("abc", "cab", true);
    assertPermutations("racecar", "racecar", true);
    assertPermutations("llohe", "hello", true);
  }

  @Test
  public void testNonPermutations() {
    assertPermutations("abca", "bca", false);
    assertPermutations("abca", "bcaf", false);
    assertPermutations("aaaaa", "bbbbbbbb", false);
    assertPermutations("", "a", false);
    assertPermutations("abb", "aba", false);
  }

  public void assertPermutations(String a, String b, boolean val) {
    org.junit.Assert.assertEquals("Failure, String '" + a + "' and string '" + b + "' should be " + val,
      StringPermutation.isPermutation(a, b), val);
  }
}