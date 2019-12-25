package Array_Sorting_Related_Programs;

public class BoubleSorting {

	public static void main(String[] args) {

		int arr[] = { 16, 14, 5, 6, 8 };
		int temp, i, j, flag;
		int arr1[];

		for (i = 0; i < arr.length - 1; i++) {

			flag = 0;

			for (j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;

				}

			}
			if (flag == 0) {
				break;
			}

		}
		System.out.println("Array After Bubble Sort");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
