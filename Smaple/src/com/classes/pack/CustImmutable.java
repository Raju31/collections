package com.classes.pack;

final public class CustImmutable {
	private static int i;
	public CustImmutable(int i) {
		this.i=i;
		
	}
	public CustImmutable modiyCustImmutable() {
		if (this.i==i) {
			return this;
			
		}else {
			return (new CustImmutable(i));
		}
		
		
	}
	public static void main(String[] args) {
		CustImmutable im = new CustImmutable(i);
		System.out.println(im);
	}
	

}
