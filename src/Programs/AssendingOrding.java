package Programs;

public class AssendingOrding {

	public static void main(String[] args) {
		
		int [] arr = {33,22,44,11,55,77,88};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
