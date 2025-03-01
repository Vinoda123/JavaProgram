package Programs;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		String S1 = "night";
		String S2 = "thing";
		
		char [] arr1 = S1.toCharArray();
		char [] arr2 = S2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if(Arrays.equals(arr1, arr2)) {
			System.out.println("is amagram");
		} else {
			System.out.println("is not anagram");
		}
	}

}
