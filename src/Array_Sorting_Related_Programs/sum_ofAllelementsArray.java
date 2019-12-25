
/** WAP to find the sum of all array elements
 * @author ABinash Jena
 * @date Sept 29th,2019
 */

package Array_Sorting_Related_Programs;

public class sum_ofAllelementsArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum of all Element's in array is " + sum);
	}

}
