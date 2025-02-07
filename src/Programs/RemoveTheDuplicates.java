package Programs;

public class RemoveTheDuplicates {

	public static void main(String[] args) {
		
		int [] arr = {1,2,2,3,3,4,4,5};
		int [] temp = new int[arr.length];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			boolean isSame = false;
			for(int j = 0 ; j < index; j++) {
				if(arr[i] == temp[j]) {
					isSame = true;
				}
			}
			if(!isSame) {
				temp[index++] = arr[i];
			}
		}
		
		for(int k = 0; k < index; k++) {
			System.out.print(temp[k]+" ");
		}

	}

}
