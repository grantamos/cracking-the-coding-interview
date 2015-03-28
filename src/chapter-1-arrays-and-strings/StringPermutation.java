public class StringPermutation {
  public static boolean isPermutation(String a, String b) {
    if (a.length() != b.length())
      return false;
    
    int[] charMap = new int[52];

    for (char c : a.toCharArray()) {
      charMap[c - 'a']++;
    }

    for (char c : b.toCharArray()) {
      charMap[c - 'a']--;
      if (charMap[c - 'a'] < 0)
        return false;
    }

    return true;
  }
}