package com.classes.pack;

import java.beans.Transient;

public class LocalVaribles {
	public static void main(String[] args) {
		/*
		 * int i=0; for (int j = 0; j<=2; j++) { i=i+j;
		 * 
		 * } System.out.println(i+"------"+j); }
		 */
		/*int x;
		if (args.length>0) {
			x=10;
			
		}else {
			x=20;
		}
		System.out.println(x);
	}*/
	public int x=10;
	private int x=20;
	protected int x5=20;
	static int x8=20;
	transient int x6=20;
	volatile int x1=20;
	// it is valid
	final int x3=20;
	}
	
}
