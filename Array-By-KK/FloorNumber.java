package Array;

public class FloorNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {16,18,20,22,25,27,29};
		int target = 15;
		int ans = FloorNumber(arr,target);
		System.out.println(ans);
		
	}
	
	// return the index of number >= target
	static int FloorNumber(int[] arr, int target) {
		
		// but what if the target no is smaller than the first no in the array
//		if(target < arr[0]) {   // no need this coz already index shift to -1
//			return -1;
//		}
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2 ;
			
			if(target == arr[mid]) {
				return arr[mid];
			}
			
			if(target < arr[mid]) {
				end = mid - 1;
			} else if(target > arr[mid]) {
				start = mid + 1;
			}
		}
		return end;  // if wanna return element than --> arr[start]
	}
		
	

}

