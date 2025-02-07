package Programs;

public class FindTheSecondLargerstEleInArray {

	public static void main(String[] args) {
		
		int [] arr = {22,44,55,11,77,88,99};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] < arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			}
		}
		System.out.println("Second Largest Element : "+ arr[1]);

	}

}
