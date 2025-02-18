package Programs;

public class FibanocciSeries {

	public static void main(String[] args) {

		int fib1 = 0;
		int fib2 = 1;
		int no = 10;

		for (int i = 0; i < no; i++) {
			int fib3 = fib1 + fib2;
			System.out.println(fib3);
			fib1 = fib2;
			fib2 = fib3;
		}

	}

}
