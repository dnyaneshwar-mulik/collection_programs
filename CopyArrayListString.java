package collection_list_assignment;

import java.util.ArrayList;

public class CopyArrayListString {

	public static void main(String[] args) {
		
		System.out.println(" ****** Copy String array List to other array list ******");
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> names2 = new ArrayList<>();
		names.add("Swara");
		names.add("Aarav");
		names.add("Swati");
		names.add("Amit");
		System.out.println("Original array list : "+names);

		for (int i = 0; i < names.size(); i++) {
			names2.add(names.get(i));
		}
		System.out.println("Copied array list : "+names2);
	}

}
