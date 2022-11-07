/*
 * Class implementing our OptimisticDuplLists
 */
public class OptimisticDupList<T> implements OptimisticInterface<T> {
	/* TODO: Add the necessary fields and implement all the methods given
	 * in this file to create an Optimistic List that supports duplicate 
	 * elements 
	 */	
	private Node head;
	private Node tail;
	OptimisticDupList() {
		head = new Node(null, Integer.MIN_VALUE);
		tail = new Node(null, Integer.MAX_VALUE);
		head.next = tail;
	}
	
	public boolean isEmpty() {
		return head.next.key == tail.key;
	}

	public boolean add(T item) {
		int key = item.hashCode();
		if (key == Integer.MIN_VALUE || key == Integer.MAX_VALUE){
			return false;
		}
		//TODO
		throw new UnsupportedOperationException();
	}

	public boolean remove(T item) {
		int key = item.hashCode();
		if (key == Integer.MIN_VALUE || key == Integer.MAX_VALUE){
			return false;
		}
		//TODO
		throw new UnsupportedOperationException();
	}

	public boolean contains(T item) {
		int key = item.hashCode();
		if(key == Integer.MIN_VALUE || key == Integer.MAX_VALUE){
			return true;
		}
		//TODO
		throw new UnsupportedOperationException();
	}

	/* Validate is unique only to the Optimistic and Lazy Lists */
	public boolean validate(Node<T> pred, Node<T> curr) {
		//TODO
		throw new UnsupportedOperationException();
	}
}
