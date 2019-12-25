/*WAP to remove duplicates in Array.
 * @Author ABinash Jena 
 * Date Sept 29th 2019
 */


package Array_Sorting_Related_Programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesArray {

  public static void main(String[] args) {

		int arr[]= {10,20,10,30,40,50};
		
		Set hs=new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			boolean Number = hs.add(arr[i]);
			if(Number==false)
			{
				System.out.println("Duplicate Number "+arr[i]);
			}
			
		}
		System.out.println(hs);
		
		
		

	}

}
