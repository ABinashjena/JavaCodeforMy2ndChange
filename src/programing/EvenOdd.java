/*
 * script: Even Odd Number Program
 * Author : ABinash Jena
 */
package programing;

import java.util.Arrays;

public class EvenOdd {
  /*
   * Algorithm of the program
   * ===========================
   * 1)if number is >0 then
   * 2)if number is divisible by 2 then Even
   * 3)else its not Odd number
   * 4)else its hole number
   */
	public static void main(String...args)
	{
		int data[]= {1,2,3,4,5,6,7,0};
		Arrays.sort(data);
		EvenOdd.getEvenOdd(data);
	}
	
	
	public static void getEvenOdd(int arr[])
	{
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]>0)
		 {
			 if(arr[i]%2==0)
			 {
				 System.out.println(arr[i]+ "  its a Even Number");
			 }
			 else
			 {
				 System.out.println(arr[i]+ "  its a Odd Number");
			 }
		 }
		 else
		 {
			 System.out.println(arr[i]+ "  its a Hole Number");
		 }
		 
		 
	 }
		
		
		
	}
	

}

