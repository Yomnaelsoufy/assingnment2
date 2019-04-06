package assignment_2;

public class LinkedListNode {
	 int data;
	LinkedListNode next;
	LinkedListNode head=null;
	
	public int getValue() {
		return data;
	}
	public LinkedListNode getNext() {
		return next;
	}
public void insert(int data) {
	
	LinkedListNode  node=new LinkedListNode ();
	node.data=data;
	node.next=null;
	if(head==null) {
		head=node;
		
		
	}
	else {
		LinkedListNode  n=head;
		while (n.next!=null) {
			n=n.next;
		}
		int s = node.data;
		n.next=node;
		

	}
	
}


}
