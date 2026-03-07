package Array;

public class CheckifSorted2 {

	public static void main(String[] args) {
		// Check if sorted in decending order
		int[] arr = {10,8,6,5,3,1,9};
//		System.out.println(isDecending(arr));
		isDecending(arr);
	}
	
	static void isDecending(int[] arr) {
		boolean hehe = true;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				hehe = false;
				break;
			}
		}
		
		if(hehe) {
			System.out.println("array is decending");
		}
		else {
			System.out.println("array is NOT decending");
		}
	}
}

