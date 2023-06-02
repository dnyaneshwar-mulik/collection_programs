package collection_list_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingArrayList {

	public static void main(String[] args) {

		System.out.println(" ***** Sort Array in descending order  *****");

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(90);
		numbers.add(60);
		numbers.add(30);
		numbers.add(310);
		numbers.add(20);
		System.out.println(numbers);

		Collections.reverse(numbers);
		System.out.println(numbers);
		Collections.sort(numbers);
		Collections.reverse(numbers);

		System.out.println(numbers);

	}

}
