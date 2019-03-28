package collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		//used for add and delete, search not good
		LinkedList<Integer> details = new LinkedList<Integer>();
		Hashmap<String,String> emp = new Hashmap<String,String>();
		Treeset;
		details.add(7);
		details.add(8);
		details.add(9);
		details.removeFirst();
		details.removeLast();
		System.out.println(details);
		for (Integer integer : details) {
			System.out.println(integer);
		}
	}

}
