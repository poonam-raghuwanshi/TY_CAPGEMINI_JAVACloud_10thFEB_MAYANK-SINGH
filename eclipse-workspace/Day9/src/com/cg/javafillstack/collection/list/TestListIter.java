package com.cg.javafillstack.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIter {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add("mayank");
		al.add(2.5);
		
		ListIterator lit=al.listIterator(3);
		System.out.println("......backward");
		while(lit.hasPrevious())
		{
			Object o=lit.previous();
			System.out.println(o);
		}
			
		
	}

}
