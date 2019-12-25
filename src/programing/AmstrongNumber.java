/*
 * script:  Amstrong Number  Program
 * Author : ABinash Jena
 */
package programing;
public class AmstrongNumber {
	/*Algorithm of this program
	 * ------------------------   153
	 * 0)check until num=<0
	 * 1) take reminder of the integer
	 * 2) add temp=0 +(reminder in to 3 times)
	 * 3)num= devide integer /10;
	 * 4) check copy==temp if yes Amstrong
	 * 5) else Not a amstrong
	 */
      
	public static void main(String[] args) {
		AmstrongNumber.getAmstrong(153);
		
	}

	public static void getAmstrong(int num)
	{
		int copy=num;
		int temp=0;
		int reminder;
		while(num>0)
		{
			reminder=num%10;
			temp=temp+(reminder*reminder*reminder);
			num=num/10;
		}
		if(copy==temp)
			System.out.println(copy+" Amstrong Number ");
		else
			System.out.println(copy+ " Not a Amstrong Number");
		
		
	}
}

