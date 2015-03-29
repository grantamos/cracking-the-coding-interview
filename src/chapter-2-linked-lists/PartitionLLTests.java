import org.junit.*;
import java.util.*;

public class PartitionLLTests {
  @Test
  public void testPartition() {
    System.out.println(PartitionLL.partitionLL(createLL(100), 50));
  }

  public Node createLL(int size) {
    if (size <= 0)
      return null;

    Node head = new Node(1);
    Node current = head;

    for (int i = 2; i <= size; i++) {
      current.next = new Node((int)(Math.random() * size));
      current = current.next;
    }

    return head;
  }
}