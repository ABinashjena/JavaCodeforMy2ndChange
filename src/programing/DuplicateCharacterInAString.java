/*
 * script: Duplicate Character In A String
 * Author : ABinash Jena
 */

package programing;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterInAString {
/*
 * Algorithm of this program
 * ============================
 * 1)conver the string to char array
 * 2) use 2 loop and compare each character of them then print the character if it is duplicate
 * 
 */
	public static void main(String[] args) {

		DuplicateCharacterInAString.getDuplicatecharacter("abinashjena");

	}

	public static void getDuplicatecharacter(String s) {
		char[] ch = s.toCharArray();
		Set<Character> hs = new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					hs.add(ch[i]);
				}
			}
		}
		for (Character c : hs) {
			System.out.println(c);
		}

	}
}
