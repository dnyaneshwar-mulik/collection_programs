package collection_list_assignment;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {

	public static void main(String[] args) {

		System.out.println(" *******   Iterate Linked List   ******* ");

		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);

		System.out.println("Using Iterator");
		Iterator itr = ll.iterator();
		while (itr.hasNext()){
			Integer a = (Integer) itr.next();
			System.out.println(a);
		}
		
		System.out.println("Using for loop");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

	}

}
