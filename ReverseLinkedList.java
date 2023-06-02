package collection_list_assignment;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {

		System.out.println(" *******   Reverse Linked List   ******* ");

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(11);
		ll.add(22);
		ll.add(66);
		ll.add(77);
		ll.add(33);
		
		System.out.println(ll);
		
		Collections.reverse(ll);
		
		System.out.println(ll);
		
	}
}
