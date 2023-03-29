package lab9;

import java.util.*;

public class LinkedListLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> link = new LinkedList<String>();
		link.add("H");
		link.add("I");
		link.add("100");
		System.out.println("The contents of array is " + link);
		System.out.println("The size of a linked list is " + link.size());
		link.addFirst("H");
		link.add("R");
		System.out.println("The third element of this linked list is " + link.get(2));
		System.out.println("The last element of this linked list is " + link.getLast());
		link.add("U");
		link.add("?");
		link.remove(4);
		System.out.println("The first element of the list is " + link.pollFirst() + " and has been removed");
		System.out.println("The contents of linked list is " + link);
		System.out.println("The size of a linked list is " + link.size());
	}

}
