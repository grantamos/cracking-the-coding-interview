public class KthFromLast {
  public static int kthFromLast(Node head, int k) {
    if (head == null)
      return -1;
    
    Node p1 = head;
    Node p2 = head;
    while (k-- > 0 && p2.next != null) {
      p2 = p2.next;
    }

    if (p2.next == null && k >= 0)
      return -1;

    while (p2.next != null) {
      p2 = p2.next;
      p1 = p1.next;
    }

    return p1.val;
  }
}