package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupTheAnagram {

	public static void main(String[] args) {
		
		String[] words = {"eat", "tea", "tan", "ate", "nat", "bat", "tab"};
		
		HashMap<String, List<String>> map  = new HashMap<String, List<String>>();
		
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			char [] charecter = word.toCharArray();
			Arrays.sort(charecter);
			
			String newWord = new String(charecter);
			
			map.putIfAbsent(newWord, new ArrayList<>());
			map.get(newWord).add(word);
		}
		
		ArrayList<List< String>> result = new ArrayList<List <String>>(map.values());
		System.out.println(result);

	}

}
