/*
 * script: Number of occurrence of a string  Program
 * Author : ABinash Jena
 */
package programing;

import java.util.HashMap;

public class NumberOFoccuranceofAstring {

	/* Algorithm of this program 
	 * ------------------------------- 
	 * 0)Remove all white space
	 * 1)convert to lower case
	 * 2)convert to character array 
	 * 3)use hashmap<C,I> 
	 * 4)put all character in hashmap 
	 * 5)check if the character is all ready exist or not if  yes increase the occurrence +1 
	 * 6)if NO then add it in HM with occurrence 1
	 * 7)print the has HM
	 */

	public static void main(String[] args) {
		NumberOFoccuranceofAstring.getOccurrence("Abinash Jena");

	}

	public static void getOccurrence(String s) {
		s=s.replace(" ", "");
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);

			} else {

				hm.put(c, 1);
			}

		}
                System.out.println(hm);
	}

}
