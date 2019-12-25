/*
 * script: Reverse Each Word of a String  Program
 * Author : ABinash Jena
 */

package programing;

public class ReverseEachWordofaString {
	/*
	 * Algorithm of this program
	 * ===============================
	 * 1) split the string where the space betwwen word 
	 * 2) reverse each word and print 
	 */

	public static void main(String[] args) {
		
		ReverseEachWordofaString.getReverseEachWord("Abinash Jena");

	}

	public static void getReverseEachWord(String s)
	{
		String[] word = s.split(" ");
		for(String var: word)
		{
			StringBuffer sb=new StringBuffer(var);
			System.out.print(sb.reverse()+" ");
		}
	}
}
