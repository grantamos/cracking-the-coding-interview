public class DeleteNodeWithoutHead {
  public static void deleteNode(Node n) {
    if (n == null)
      return;

    n.val = n.next.val;
    n.next = n.next.next;
  }
}