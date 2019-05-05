package com.classes.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map8 {
	public static void main(String[] args) {
			
				System.out.println("The stream after applying "
								+ "the function is : "); 
				//counting the words
				/*
				words.stream().map(str-> str.length()).forEach(System.out::println);
				*/
				StringBuffer b = new StringBuffer();
				List<String> words=Arrays.asList("Siva","Raju","rajuSiav","it is software fields so    ");
				words.stream().forEach(str ->b.append(str));
				
				System.out.println(b.toString());
				List<String> hamap= new ArrayList<>();
				
				System.out.println(findLengthWithoutSpaces("Siva","Raju","rajuSiav","it is software fields so    "));

				//System.out.println(mapValues("EmpMap8"));
	}
	
	public static int findLengthWithoutSpaces(String str, String string, String string2, String string3) {
		
		String s1 = str.concat(string).concat(string2);
		String s = str.replaceAll(" ", "");			
		return s.length();
	}
	
	public void mapValues() {
		List<EmpMap8> s = new ArrayList<EmpMap8>();
		s.stream().collect(Collectors.toMap(EmpMap8::toString,EmpMap8::toString));
	}	
	
	
	
	

}
