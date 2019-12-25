/*
 * script: Prime Number Program
 * Author : ABinash Jena
 */
package programing;

public class PrimeNumber {
	/*
	 *  Algorithm  of this program
	 *  ============================
	 *  1) take a Number 
	 *  2) check that number is divided through 2 to num-1 ; if yes 
	 *  3)print its not prime number 
	 *  4)else prime number
	 */
	
	
	
	public static void main(String ...args)
	{
		PrimeNumber.getPrime(7);
	}
	public static void getPrime(int num)
	{
		boolean ans=false;
	  for (int i=2;i<=num-1;i++)
	  {
		  if(num%i==0)
		  {
			  ans=true;
		  }  
	  }
		
	  if(ans==false)
	  {
		  System.out.println(num+"  prime Number");
	  }
	  else
	  {
		  System.out.println(num+"  not a prime number");
	  }
     }
}