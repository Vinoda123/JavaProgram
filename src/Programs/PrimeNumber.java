package Programs;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int no = 10;
		int count = 0;
		
		for(int i = 1; i <= no; i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("is prime number");
		} else {
			System.out.println("is not prime number");
		}

	}

}
