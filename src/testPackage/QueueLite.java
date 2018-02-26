package testPackage;

import java.util.LinkedList;

public class QueueLite<T> {
 
	private LinkedList<T> linkedList = null;
	
	public QueueLite() {
		linkedList = new LinkedList<>();
	}
	
	public synchronized void add(T item) {
		linkedList.add(item);		
	}
	
	public synchronized T pop() {
		 
		if(linkedList.isEmpty()) {
			return null;
		}
		return linkedList.removeLast();
		
	}
	
	public int size() {
		return linkedList.size();
	}
}
