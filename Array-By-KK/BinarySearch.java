package Array;

public class BinarySearch {

	public static void main(String[] args) {
		// Works for any sorted array asscending / Decending
		
		int[] arr = {4,6,8,10,12,14};
		int target = 82;
		System.out.println(BS(arr,target));
	}
	
	static int BS(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		
		while(start <= end) {
			// find the middle element 
			// int mid = (start+end)/2 might be possible that (start + end) exceeds the range of  int in java
			int mid = start + (end-start)/2;
			
			if(target == nums[mid]) {
				return mid;    // return the index 
			}
			
			if(target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			}
			// YOU can replace first if with this else
//			else {
//				return mid;
//			}
		}
		return -1;    // return -1 if it does not exist
	}
	

}
