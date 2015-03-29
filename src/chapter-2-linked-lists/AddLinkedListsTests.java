import org.junit.*;

public class AddLinkedListsTests {
	@Test
	public void testAddLL() {
		testAdd(999, 999);
		testAdd(999, 1000);
		testAdd(10, 1111);
		testAdd(0, 143);
		testAdd(1034, 19);
	}

	public void testAdd(int a, int b) {
		Node aNode = linkedListFromInt(a);
		Node bNode = linkedListFromInt(b);
		Node result = AddLinkedLists.addLinkedLists(aNode, bNode);
		Node expect = linkedListFromInt(a+b);
		org.junit.Assert.assertEquals("Fail", expect.toString(), result.toString());

		System.out.println(expect);
		System.out.println(result);
	}

	public Node linkedListFromInt(int num) {
		Node head = new Node(num % 10);
		num /= 10;

		Node current = head;

		while (num > 0) {
			current.next = new Node(num % 10);
			current = current.next;
			num /= 10;
		}

		return head;
	}
}