/*
 * script: Separate 0 and 1 Program
 * Author : ABinash Jena
 */
package programing;

public class Sagregate0and1 {
	/* Algo of this program
	 * =========================
	 * 1.find the length of the array
	 * 2.count the num of ZERO present in that array
	 * 3.put all the zero in array 
	 * 4.put all the ONE in same array 
	 * 5.print 
	 */
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {0,1,0,1,0,0,1};
		int len=arr.length;
		
		Sagregate0and1.getSegregate(arr, len);
		

	}
	public static void getSegregate(int[] arr,int len)
	{
		int count=0;
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]==0)
				count++;
		}
		
		for(int i=0;i<count;i++)
		{
			arr[i]=0;
		}
		for(int i=count;i<len;i++)
		{
			arr[i]=1;
		}
		
		System.out.println("segrgration 0 and 1");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"");
		}
		
	}

}
