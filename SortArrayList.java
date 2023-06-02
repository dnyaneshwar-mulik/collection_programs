package collection_list_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		
		System.out.println(" ****** Sort Array List ******\n");

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(50);
		al.add(30);
		al.add(70);
		al.add(10);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);

	}

}
