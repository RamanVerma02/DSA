package Array;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		// OrderAgnostic means given array is sorted but dont know 
		// if it is sorted in Assending or Decending
		int[] arr = {30,27,26,22,17,13,11,9,5,3,1,0};
		int target = 9;
		int ans = BS(arr, target);
		System.out.println(ans);

	}
	
	static int BS(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		
		// find whether the array is sorted in ascending or descendinig 
		boolean isAsc;
		if(nums[start] < nums[end]) {
			isAsc = true;
		} else {
			isAsc = false;
		}
		
		// OR CAN USE THIS
//		boolean isAsc = nums[start] < nums[end];
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(target == nums[mid]) {
				return mid;    
			}
			
			if(isAsc) {
				if(target < nums[mid]) {
					end = mid - 1;
				} else if (target > nums[mid]) {
					start = mid + 1;
				}
			} 
			else {
				if(target > nums[mid]) {
					end = mid - 1;
				} else if (target < nums[mid]) {
					start = mid + 1;
				}
			}
			
		}
		return -1;
	
	}

}
