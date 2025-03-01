package Programs;

public class CountTheNumOfCharInSent {

	public static void main(String[] args) {
		
		String input = "Hi, i am a tester vinoda";
		char [] arr = input.toCharArray();
		int count = 0;
		
		for(int i =0; i < arr.length; i++) {
			
			if(arr[i] != ' '&& arr[i] != ',') {
				count++;
			}
		}
		System.out.println(count);

	}

}
