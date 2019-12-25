/*WAP selection sort of an array 
 *@author ABinash Jena
 *Date Sept 30th 2019
*/

package Array_Sorting_Related_Programs;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 7, 2, 5, 4, 6, 1 };
		int len = arr.length;
		int min;
		for (int i = 0; i < len - 1; i++) {
			min = i;
			for (int j = arr[i] + 1; j < len; j++) {

				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			// swap
			arr[min] = arr[i] + arr[min];
			arr[i] = arr[min] - arr[i];
			arr[min] = arr[i] + arr[min];

		}
		for (int z = 0; z < arr.length; z++) {
			System.out.println(arr[z]);
		}
	}

}
