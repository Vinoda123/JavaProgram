package Programs;

import java.util.HashMap;

public class TwoSumArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8};
		int target = 8;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			int result = target-arr[i];
			if(map.containsKey(result)) {
				System.out.println("first number : "+arr[i]+" place of index : "+i+" Second Number : "+result+" place of index : "+ map.get(result));
			}
			map.put(arr[i], i);
		}
		

	}

}
