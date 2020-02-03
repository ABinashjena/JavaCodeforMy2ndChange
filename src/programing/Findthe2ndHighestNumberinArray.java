package programing;



public class Findthe2ndHighestNumberinArray {

	public static void main(String[] args) {
		int data[]= {20,3,0,4,5,45};
		Findthe2ndHighestNumberinArray.get2ndhighest(data);

	}

	
	
	public static void get2ndhighest(int arr[])
	{
		int len = arr.length;
		int highest=0;
		int secendhighest=0;
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]>highest)
			{
				secendhighest=highest;
				highest=arr[i]; 
			}
			else if(arr[i]<secendhighest)
			{
				secendhighest=arr[i];
			}
		}
		System.out.println("highest "+ highest );
		System.out.println("secendhighest "+ secendhighest );
		
		
	}
}
