/*
 * script: Missing Number In Array
 * Author : ABinash Jena
 */
package programing;

public class MissingNumberInArray {
	/*
	 * Algorithm of this program
	 * =============================
	 * 1)sort the array
	 * 2)find the length+1 of array
	 * 3)find sum by using (n*(n+1))/2
	 * 4)use the loop up to length and deduct the loop value from sum 
	 * 5) final sum value is missing number
	 */

	public static void main(String[] args) {
		
		int data[]={1,2,3,5,6,7,8};
		
		MissingNumberInArray.getMissingnumber(data);
		
	}

	
	
	public static void getMissingnumber(int arr[])
	{
		
		int n = arr.length+1;//8
		int sum=(n*(n+1))/2;//36
		for(int i=0;i<arr.length;i++)
		{
			sum=sum-arr[i];
			
		}
		System.out.println(sum);
		
	}

}


