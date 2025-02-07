package Programs;

public class FindTheLargestEleInArray {

	public static void main(String[] args) {
		
		int [] arr = {23, 11, 45, 67, 98};
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(arr[0]);

	}

}
