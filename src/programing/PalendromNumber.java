/*
 * script: Palendrom Number  Program
 * Author : ABinash Jena
 */
package programing;

public class PalendromNumber {
/* Algorithm of this program 121
 * ============================
 * 1) run the loop until num<=0
 * 2) copy the num
 * 3) find the reminder of the number
 * 4) temp=(temp*10)+num
 * 5) Divided num by 10
 * 6) check copy==temp if yes palendrom Number 
 * 7) else Not a Palendrom Number 
 * 
 */
	public static void main(String[] args) {
		PalendromNumber.getPalendrom(121);
		
	}
    public static void getPalendrom(int num)
    {
    	int copy=num;
    	int temp=0;
    	int reminder;
    	while(num>0)
    	{
    		reminder=num%10;
    		temp=(temp*10)+reminder;
    		num=num/10;
    	}
    	if(copy==temp)
    		System.out.println(copy+"  is a Palendrom");
    	else
    		System.out.println(copy+" is not palendrom");
    	
    	
    	
    }
}
