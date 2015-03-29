import org.junit.*;

public class KthFromLastTests {

  @Test
  public void testValid() {
    org.junit.Assert.assertEquals("Fail", -1, KthFromLast.kthFromLast(null, 10));
    org.junit.Assert.assertEquals("Fail", 1, KthFromLast.kthFromLast(createLL(1), 0));
    org.junit.Assert.assertEquals("Fail", -1, KthFromLast.kthFromLast(createLL(5), 10));
    org.junit.Assert.assertEquals("Fail", -1, KthFromLast.kthFromLast(createLL(5), 5));
    org.junit.Assert.assertEquals("Fail", 1, KthFromLast.kthFromLast(createLL(5), 4));
    org.junit.Assert.assertEquals("Fail", 90, KthFromLast.kthFromLast(createLL(100), 10));
    org.junit.Assert.assertEquals("Fail", 70, KthFromLast.kthFromLast(createLL(75), 5));
  }

  public Node createLL(int size) {
    if (size <= 0)
      return null;

    Node head = new Node(1);
    Node current = head;

    for (int i = 2; i <= size; i++) {
      current.next = new Node(i);
      current = current.next;
    }

    return head;
  }
}