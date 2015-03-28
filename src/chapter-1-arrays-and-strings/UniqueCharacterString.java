import java.util.*;

public class UniqueCharacterString {
  public static boolean isAllUnique(String input) {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    for (char c : input.toCharArray()) {
      if (map.containsKey(c)) {
        return false;
      } else {
        map.put(c, 1);
      }
    }

    return true;
  }
}