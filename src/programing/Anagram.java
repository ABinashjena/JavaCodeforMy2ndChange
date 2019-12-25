/*
 * script: Anagram Program
 * Author : ABinash Jena
 */

package programing;

import java.util.ArrayList;

public class Anagram {

	/* Algorithm of Script
	 * ------------------------
	 * 1)remove white space
	 * 2)map the two string length
	 * 3)convert to Lower case 
	 * 4) convert to character array
	 * 5)sort the string
	 * 6) map two string
	 */
	public static void main(String[] args) {
		Anagram a=new Anagram();
		boolean ans = a.getAnagram("Abinash Jena", " Jena    Abinash");
		if(ans==true)
		{
			System.out.println("  Anagram");
		}
		else
		{
			System.out.println("  not Anagram");
		}

	}

	
	
	public boolean getAnagram(String a,String b)
	{
		a=a.replace(" ", "");
		b=b.replace(" ", "");
		if(a.length()==b.length())
		{
			return true;
		}
		else
		{
			a=a.toLowerCase();
			b=b.toLowerCase();
			char[] ch1 = a.toCharArray();
			char[] ch2 = b.toCharArray();
			ArrayList l1=new ArrayList();
			ArrayList l2=new ArrayList();
			for(char c1:ch1)
			{
				l1.add(c1);
			}
			for(char c2:ch2)
			{
				l2.add(c2);
			}
			if(l1.equals(l2))
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		}
		
		
		
		
	}
	
	
}
