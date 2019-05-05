package com.classes.pack;

import java.util.Scanner;

public class Revers {
	public static void main(String[] args) {
		//First way
		/*String s= "Sivaraju9966442995";
		char c[]=s.toCharArray();
		for (int i = c.length-1;i>= 0; i--) {
			System.out.print(c[i]);
			
		}*/
		
		//second way
		/*String s="RajuSiva";
		StringBuilder builder = new StringBuilder();
		builder.append(s);
		builder.reverse();
		System.out.println(builder);*/
		//third way
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string :");
		s=sc.nextLine();
		String[] token= s.split("");
		for (int  i = token.length-1;i >= 0; i--) {
			System.out.print(token[i]+"");
			
		}
 	}

}
