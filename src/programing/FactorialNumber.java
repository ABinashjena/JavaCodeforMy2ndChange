/*
 * script: Factorial Number  Program
 * Author : ABinash Jena
 */

package programing;
/*
 * Algorithm of this program
 * ============================
 * 1)run the loop until num<=0
 * 2)temp=temp*num
 * 3)Decrement the num
 * 
 */
public class FactorialNumber {

	public static void main(String[] args) {
		FactorialNumber.getFactorial(3);
		
	}

	public static void getFactorial(int num)
	{
		int temp=1;
		while(num>0)
		{
			temp=temp*num;
					num--;
		}
		System.out.println(temp);
		
	}
	
	
}
