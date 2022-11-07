import java.util.concurrent.atomic.AtomicMarkableReference;

/*
 * Class implementing our LockFreeDupList
 */
public class LockFreeDupList<T> implements LockFreeInterface<T> {
	/* TODO: Add the necessary fields and implement all of the methods 
	 * in this file to create a Lock-Free List that supports duplicate 
	 * elements. Feel free to add whatever helper methods you deem
	 * necessary
	 */
	 
	Node head, tail;
	class Window{
		public Node pred, curr;
		Window(Node myPred, Node myCurr) {
			pred = myPred; curr = myCurr;
		}
	}
	
	Window find(Node head, int key) {
		//TODO
		throw new UnsupportedOperationException();
	}

	LockFreeDupList() {
		head = new Node(null, Integer.MIN_VALUE);
		tail = new Node(null, Integer.MAX_VALUE);
		head.next.set(tail, false);
	}

	public boolean isEmpty() {
		return head.next.getReference() == tail;
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
		if (key == Integer.MIN_VALUE || key == Integer.MAX_VALUE){
			return true;
		}
		//TODO
		throw new UnsupportedOperationException();
	}
}
