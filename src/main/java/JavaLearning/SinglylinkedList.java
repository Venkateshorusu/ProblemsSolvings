package JavaLearning;

public class SinglylinkedList {
	private Node head;
	public static class Node
	{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			}
	}
	public static void main(String args[]) {
		SinglylinkedList s1=new SinglylinkedList();
		s1.head=new Node(10);
		Node sec=new Node(1);
		Node third=new Node(21);
		Node four=new Node(12);
		s1.head.next=sec;
		sec.next=third;
		third.next=four;
		s1.disp();
		
		}
	public  void disp() {
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+"-->");
			cur=cur.next;
		}
		System.out.print("null");
		}
	
}
