public class Node {
  int val;
  public Node next;

  public Node (int val) {
    this.val = val;
  }

  public void appendToEnd(int i) {
    Node a = this;

    while (a.next != null)
      a = a.next;

    a.next = new Node(i);
  }

  public Node deleteNode(int i) {
    Node a = this;

    while (a.next != null && a.next.val != i)
      a = a.next;

    if (a.next != null && a.next.val == i)
      a.next = a.next.next;

    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    Node n = this;
    builder.append(n.val + "");
    while (n.next != null) {
      n = n.next;
      builder.append("->" + n.val);
    }
    return builder.toString();
  }
}