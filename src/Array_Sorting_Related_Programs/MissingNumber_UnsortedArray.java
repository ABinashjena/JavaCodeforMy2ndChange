/*WAP to find the missing numbers in an array 
		 *@author ABinash Jena
		 *Date Sept 29th 2019
		 */

package Array_Sorting_Related_Programs;

public class MissingNumber_UnsortedArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 6, 3, 7, 8 };
		int sum = 0;
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}
		// We are Using the formula n(n+1)/2
		int totalsum = ((size + 1) * (size + 2)) / 2; // in array size is lessthan actual array so we added +1 dont be
														// confuse .
		System.out.println("Missing Number is " + (totalsum - sum));

	}

}
