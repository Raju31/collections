package com.basic.collections;

import java.util.Arrays;
//sorting order and removing the duplicate
public class SortingOrder {
	public static void main(String[] args) {
		int []s= {12,25,55,66,45,1,2,3,6,4,5,89,7,5,8,6};
		Arrays.sort(s);
		 System.out.printf("Modified arr[] : %s", 
                 Arrays.toString(s)); 
		 //Remove the duplicate in the array
		 for (int i = 0; i < s.length; i++) {
			 int count=0;
			 for (int j = 0; j < s.length; j++) {
				 if (s[i]==s[j]) {
					 count++;
					
				}
				
			}
			 if (count<=1) {
				 System.out.print(s[i]+" ");
				
			}
			
		}
	}

}
