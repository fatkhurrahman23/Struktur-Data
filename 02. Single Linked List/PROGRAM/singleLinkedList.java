/*
AUTHOR: 
Nama	: Moh Fatkhur Rahman
Kelas	: TI-1B
NIM		: 4.33.22.1.15
*/

public class singleLinkedList{
	static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}

	Node head;

	public static singleLinkedList insert(singleLinkedList list, int data){
		Node new_node = new Node(data);

		if (list.head == null){
			list.head = new_node;
		} else {
			Node last = list.head;

			while (last.next != null){
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	public static void printList(singleLinkedList list){
		Node currentNode = list.head;

		System.out.print("[HEAD] => ");

		while (currentNode != null) {
			System.out.print(currentNode.data + " => ");
			currentNode = currentNode.next;
		}
		System.out.println(" [NULL]"); 
	}

	public static singleLinkedList deleteByKey(singleLinkedList list, int key){
		Node currentNode = list.head, prev = null;

		if (currentNode != null && currentNode.data == key) {
			list.head = currentNode.next;
			System.out.println(key + " found and deleted ");
			return list;
		}

		while (currentNode != null && currentNode.data != key){
			prev = currentNode;
			currentNode = currentNode.next;
		}

		if (currentNode != null) {
			prev.next = currentNode.next;

			System.out.println(key + " found and deleted");
		}


		if (currentNode == null ) {
			System.out.println(key + " not found");
		}

		return list;
	}

	public void insertFirst(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void printList(){
		Node currNode = head;
		while (currNode != null) {
			System.out.println(currNode.data + " ");
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		singleLinkedList list = new singleLinkedList();

		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);

		deleteByKey(list, 4);
		deleteByKey(list, 9);

		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);

		printList(list);
	}
}