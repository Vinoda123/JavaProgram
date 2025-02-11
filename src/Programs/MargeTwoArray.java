package Programs;

import java.util.Arrays;

public class MargeTwoArray {

	public static void main(String[] args) {
		
		char [] arr1 = {'a','b','c','d','e'};
		char [] arr2 = {'e','d','c','b','f'};
		
		int marg = arr1.length + arr2.length;
		char [] margarr = new char[marg];

		int index = 0;
		for(char a1 : arr1) {
			margarr[index++] = a1;
		}
		for(char a2 : arr2) {
			margarr[index++] = a2;
		}
		System.out.println(Arrays.toString(margarr));
	}

}
