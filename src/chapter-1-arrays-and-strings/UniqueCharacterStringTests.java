import org.junit.*;

public class UniqueCharacterStringTests {
  
  @Test
  public void testSingleCharacter() {
    org.junit.Assert.assertEquals("Single character is always true.", UniqueCharacterString.isAllUnique("a"), true);
    org.junit.Assert.assertEquals("Single character is always true.", UniqueCharacterString.isAllUnique("b"), true);
    org.junit.Assert.assertEquals("Single character is always true.", UniqueCharacterString.isAllUnique("c"), true);
  }

  @Test
  public void testNonUniqueStrings() {
    org.junit.Assert.assertEquals("Failed.", UniqueCharacterString.isAllUnique("aaaaaaaa"), false);
    org.junit.Assert.assertEquals("Failed.", UniqueCharacterString.isAllUnique("bbbbb"), false);
    org.junit.Assert.assertEquals("Failed.", UniqueCharacterString.isAllUnique("abba"), false);
    org.junit.Assert.assertEquals("Failed.", UniqueCharacterString.isAllUnique("abcdea"), false);
    org.junit.Assert.assertEquals("Failed.", UniqueCharacterString.isAllUnique("uioo"), false);
    org.junit.Assert.assertEquals("Failed.", UniqueCharacterString.isAllUnique("a;slkdjf;"), false);
  }

  @Test
  public void testUniqueStrings() {
    org.junit.Assert.assertEquals("Failed.", UniqueCharacterString.isAllUnique("abcdefg"), true);
    org.junit.Assert.assertEquals("Failed.", UniqueCharacterString.isAllUnique("xyz"), true);
    org.junit.Assert.assertEquals("Failed.", UniqueCharacterString.isAllUnique("zyx"), true);
    org.junit.Assert.assertEquals("Failed.", UniqueCharacterString.isAllUnique("qwertyuiop"), true);
    org.junit.Assert.assertEquals("Failed.", UniqueCharacterString.isAllUnique("Special 128*(&$"), true);
  }
}