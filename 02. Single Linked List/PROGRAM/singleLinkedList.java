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

		//If the Linked List is empty, then make the new node as head
		if (list.head == null){
			list.head = new_node;
		} else {
			//Else traverse till the last node and insert the new_node there
			Node last = list.head;

			while (last.next != null){
				last = last.next;
			}
			//Insert the new_node at last node
			last.next = new_node;
		}
		//return the list by head
		return list;
	}

	//Method untuk mencetak LinkedList
	public static void printList(singleLinkedList list){
		Node currentNode = list.head;

		System.out.print("[HEAD] => ");

		//Traverse through the LinkedList
		while (currentNode != null) {
			//Print the data at current node
			System.out.print(currentNode.data + " => ");
			//Go to next node
			currentNode = currentNode.next;
		}
		System.out.println(" [NULL]"); 
	}

	//Method untuk menghapus node dengan key yang diberikan
	public static singleLinkedList deleteByKey(singleLinkedList list, int key){
		//Simpan head node
		Node currentNode = list.head, prev = null;

		if (currentNode != null && currentNode.data == key) {
			list.head = currentNode.next; //Changed head
			System.out.println(key + " found and deleted ");
			return list; //return the updated List
		}

		//search for the key to be deleted, keep track of the previous node as we need to change currentNode.next
		while (currentNode != null && currentNode.data != key){
			// If currentNode does not hold key continue to next node
			prev = currentNode;
			currentNode = currentNode.next;
		}

		//if the key was present, it should be at currentNode
		//therefore the currentNode shall not be null
		if (currentNode != null) {
			//since the key is at currentNode, unlink currentNode from linked list
			prev.next = currentNode.next;
			System.out.println(key + " found and deleted");
		}

		//if key was not present in linked list currentNode should be null
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

		// Delete node with value 4
		// In this case the key is present ***in the middle***
		deleteByKey(list, 4);
		deleteByKey(list, 9);

		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);

		printList(list);
	}
}