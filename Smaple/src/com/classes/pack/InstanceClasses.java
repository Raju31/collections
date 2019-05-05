package com.classes.pack;

public class InstanceClasses {
	int[] x= new int[3];
	/*static int x=10;
	int y=20;*/
	public static void main(String[] args) {
		//System.out.println(x);
		//System.out.println(y);
		InstanceClasses  classes = new InstanceClasses();
		//System.out.println(classes.x);
		//m1();
		/*classes.x=888;
		classes.y=999;
		InstanceClasses classes2 = new InstanceClasses();
		System.out.println((classes2.x)+"======="+(classes2.y));
		*/
	}
	/*public static void m1() {
		System.out.println(x);
	}*/
}
