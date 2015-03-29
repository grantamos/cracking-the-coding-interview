import org.junit.*;

public class DeleteNodeWithoutHeadTests {
  @Test
  public void test() {
    testRemoval(5, 3);
    testRemoval(6, 3);
    testRemoval(10, 5);
  }

  public void testRemoval(int size, int index) {
    Node n = createLL(size);
    DeleteNodeWithoutHead.deleteNode(ithElement(n, index));
    org.junit.Assert.assertEquals("Fail", createLL(size).deleteNode(index).toString(), n.toString());
  }

  public Node ithElement(Node n, int index) {
    while (index-- > 1 && n.next != null) {
      n = n.next;
    }

    return n;
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