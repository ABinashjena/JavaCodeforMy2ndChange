package programing;

import java.util.HashMap;

public class NumberOFoccuranceofAstring {

	//public static void main(String[] args) {
	public static void Number()
	{
		String str = "abineeeeeeeeeeeeash";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}

		}
		System.out.println(hm);
	}
	//}

}
