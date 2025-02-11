package Programs;

public class ReverseEachWordInTheSentence {

	public static void main(String[] args) {
		
		//output - ehT kciuq nworb xof spmuj revo eht yzal god.
		
		String S = "The quick brown fox jumps over the lazy dog.";
		String [] words = S.split(" ");
		
		for(String word : words) {
			String revers = "";
			
			for(int i = word.length()-1; i >= 0; i--) {
				revers += word.charAt(i);
			}
			System.out.print(revers+" ");
		}
	}

}
