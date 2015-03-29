public class AddLinkedLists {
	public static Node addLinkedLists(Node oneHead, Node twoHead) {
		Node one = oneHead;
		Node two = twoHead;
		while (one != null && two != null) {
			int added = one.val + two.val;
			int currentPlace = added % 10;
			int nextPlace = added / 10;

			one.val = currentPlace;
			if (nextPlace != 0) {
				if (one.next == null)
					one.next = new Node(0);
				one.next.val += nextPlace;
			}

			if (one.next == null && two.next != null)
				one.next = new Node(0);
			else if (two.next == null && one.next != null)
				two.next = new Node(0);

			one = one.next;
			two = two.next;
		}

		return oneHead;
	}
}