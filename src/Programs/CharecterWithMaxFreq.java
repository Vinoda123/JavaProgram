package Programs;

import java.util.HashMap;

public class CharecterWithMaxFreq {

	public static void main(String[] args) {

		String word = "ushauu";
		char[] charecter = word.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < charecter.length; i++) {
			char c = charecter[i];
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int maxcount = 0;
		char maxrepchar = ' ';

		for (char C : charecter) {
			if (map.get(C) > maxcount) {
				maxrepchar = C;
				maxcount = map.get(C);
			}
		}
		System.out.println("charecter : " + maxrepchar + " Count : " + maxcount);
	}

}
