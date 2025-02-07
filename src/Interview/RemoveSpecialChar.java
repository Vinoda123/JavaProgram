package Interview;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String word = "23,000.00*";
		String newword = word.replaceAll("[,\\.\\*]", "");
		
		System.out.println(newword);

	}

}
