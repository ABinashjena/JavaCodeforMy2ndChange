/*
 * script: Reverse A Number  Program
 * Author : ABinash Jena
 */

package programing;

public class ReverseANumber {
	/* Algorithm of this program 121
	 * ============================
	 * 1) run the loop until num<=0
	 * 2) find the reminder of the number
	 * 3) temp=(temp*10)+num
	 * 4) Divided num by 10
	 * 5) print the temp 
	 * 
	 */

	public static void main(String[] args) {
		
		ReverseANumber.getReversenumber(12345610);
		

	}
 public static void getReversenumber(int num)
 {
	 int temp=0;
	 int reminder;
	 while(num>0)
	 {
	 reminder=num%10;
	 temp=(temp*10)+reminder;
	 num=num/10;
	 }
	 System.out.println(temp);
 }
}
