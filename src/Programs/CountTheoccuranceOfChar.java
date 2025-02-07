package Programs;

import java.util.HashMap;

public class CountTheoccuranceOfChar {

	public static void main(String[] args) {
		
		String word = "UshaVinoda";
		char [] charecter = word.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i <charecter.length; i++) {
			char c = charecter[i];
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
	}

}
