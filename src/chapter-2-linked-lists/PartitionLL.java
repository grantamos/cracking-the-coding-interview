public class PartitionLL {
  public static Node partitionLL(Node head, int val) {
    Node left = null;
    Node leftStart = null;
    Node right = null;
    Node rightStart = null;
    Node equal = null;
    Node equalStart = null;
    Node node = head;

    while (node.next != null) {
      Node next = node.next;

      if (node.val < val) {
        if (left == null) { left = node; leftStart = left; }
        else { left.next = node; left = node; }
      } else if (node.val > val) {
        if (right == null) { right = node; rightStart = node; }
        else { right.next = node; right = node; }
      } else {
        if (equal == null) { equal = node; equalStart = node; }
        else { equal.next = node; equal = node; }
      }

      node = next;
    }

    left.next = equalStart;
    equal.next = rightStart;

    return leftStart;
  }
}