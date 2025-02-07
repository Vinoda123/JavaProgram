package Programs;

import java.util.HashMap;

public class CountTheFirstNonOccuranceChar {

	public static void main(String[] args) {
		
		String word = "Swiggee";
		char [] charecter = word.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < charecter.length; i++) {
			char c = charecter[i];
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char C : charecter) {
			if(map.get(C)==1) {
				System.out.println("The non occurance of first charecter is "+ C);
				break;
			}
		}

	}

}
