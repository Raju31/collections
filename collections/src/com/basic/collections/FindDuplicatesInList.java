package com.basic.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInList {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(14);
		list.add(110);
		list.add(114);
		list.add(10);
		list.add(14);
		list.add(10);
		list.add(14);
		
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		
		for(int n:list) {
		if(!set1.add(n))
		{
			set2.add(n);
		}
	}
		System.out.println(set2);


	}
	

}
