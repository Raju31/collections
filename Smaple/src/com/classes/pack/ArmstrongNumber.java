package com.classes.pack;

import java.util.Arrays;
import java.util.List;

public class ArmstrongNumber {
	 static int t=0 ;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static boolean armstrong(int num) {
		/*boolean flag = false;
		int total = 0;

		String[] s = String.valueOf(num).split("");
		
		for (String ss : s)
			total += Math.pow(Integer.parseInt(ss), s.length);
		flag = num == total ? true : false;*/

		List l = Arrays.asList(String.valueOf(num).split(""));
		l.stream().forEach(str -> {
				t += Math.pow(Integer.parseInt((String) str), l.size());
		});		
		 
		return num == t ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(armstrong(12));
	}
}
