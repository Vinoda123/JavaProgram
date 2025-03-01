package Programs;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		
		int [] arr = {23, 22, 25, 28, 21};
		boolean isSort = true;
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				isSort = false;
			}
			//return;
		}
		System.out.println(isSort);

	}

}
