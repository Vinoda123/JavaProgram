package Programs;

import java.util.Arrays;

public class ChechTwoArranyAnagram {

	public static void main(String[] args) {
		
		char [] arr1 = {'a','b','c','d','e'};
		char [] arr2 = {'e','d','c','b','f'};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if(Arrays.equals(arr1, arr2)) {
			System.out.println("is anagram");
		} else {
			System.out.println("is not anagram");
		}
	}

}
