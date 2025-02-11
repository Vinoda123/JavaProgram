package Programs;

public class CpitalizeFirstword {

	public static void main(String[] args) {
		
		String S = "i am a tester";
		String [] word = S.split(" ");
		
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 0; i < word.length; i++) {
			buffer.append(word[i].substring(0, 1).toUpperCase()+word[i].substring(1));
		}
		System.out.println(buffer);
	}

}
