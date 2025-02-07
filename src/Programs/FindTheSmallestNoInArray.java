package Programs;

public class FindTheSmallestNoInArray {

	public static void main(String[] args) {
		
		int [] arr = {22, 44, 11, 55, 88};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Smallest Element is : "+arr[0]);

	}

}
