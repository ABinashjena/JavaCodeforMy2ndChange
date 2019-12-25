/*
 * script: Reverse a String   Program
 * Author : ABinash Jena
 */

package programing;
/*
 * Algorithm of this program
 * =============================
 * 1)convert the string to character
 * 2)find the length of character array
 * 3)print in to reverse order
 * 
 */

public class ReverseString {

	public static void main(String[] args) {
		ReverseString.getReversestring("Abinash.jena@ge.com");
	}
	
	public static void getReversestring(String s)
	{
		
		char[] ch = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
					
		
	}

}
