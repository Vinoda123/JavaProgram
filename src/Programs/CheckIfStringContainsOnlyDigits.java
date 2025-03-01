package Programs;

public class CheckIfStringContainsOnlyDigits {

	public static void main(String[] args) {
		
		String str = "12345";
		boolean isINt = false;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!Character.isDigit(ch)) {
				isINt = true;
			}
		}
		if(!isINt) {
			System.out.println("given string have integer");
		} else {
			System.out.println("given string is not have integer");
		}

	}

}
