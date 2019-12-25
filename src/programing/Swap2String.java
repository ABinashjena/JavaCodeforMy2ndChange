/*
 * script: Reverse a String   Program
 * Author : ABinash Jena
 */
package programing;

public class Swap2String {
/*
 * Algorithm of this program
 * =========================
 * a=a+b;
 * b=a-b;
 * a=a-b;
 * 
 */
	
	public static void main(String[] args) {
		
		Swap2String.getSwapstring("Abinash", "Jena");
		
	}
	
	public static void getSwapstring(String a, String b)
	{
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
