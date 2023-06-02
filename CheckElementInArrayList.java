package collection_list_assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CheckElementInArrayList {

	public static void main(String[] a) {
		
		System.out.println(" ****** Check Element in the given array list ****** ");
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(90);
		numbers.add(60);
		numbers.add(30);
		numbers.add(310);
		numbers.add(20);
		System.out.println(numbers);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int x = scanner.nextInt();
		scanner.close();
		boolean exists = false;
		
		for (int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i)==x) {
				exists = exists || true;
			}
			
		}
		if(exists) {
			System.out.println(x + " Exists in the given array list");
		}
		else {
			System.out.println(x + " Does not exists in the given array list");

		}
		
	}

}
