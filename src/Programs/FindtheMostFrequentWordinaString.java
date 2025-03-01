package Programs;

import java.util.HashMap;

public class FindtheMostFrequentWordinaString {

	public static void main(String[] args) {

		String sentance = "Java is fun and Java is powerful";
		String[] words = sentance.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		System.out.println(map);
		int maxcount = 0;
		String maxword = "";
		for (String S : words) {
			if (map.get(S) > maxcount) {
				maxword = S;
				maxcount = map.get(S);
			}
		}
		System.out.println("Max word : " + maxword);

	}

}
