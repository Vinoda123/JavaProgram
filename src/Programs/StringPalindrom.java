package Programs;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String S = "mamc";
		String ch = "";
		boolean isPalindrom = true;
		
		for(int i = S.length()-1; i >= 0; i--) {
			 ch += S.charAt(i); 
		}
		
		if(ch.equals(S)) {
			System.out.println(isPalindrom);
		} else {
			isPalindrom=false;
			System.out.println(isPalindrom);
		}
	}

}
