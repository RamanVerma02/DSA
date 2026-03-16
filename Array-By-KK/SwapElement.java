package Array;
import java.util.*;
public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,7,6,8,17};
		
//		swap(arr,2,3);
//		swap(arr,4,0);
//		swap(arr,3,1);
		
		
		System.out.println(Arrays.toString(arr));
		
//		System.out.println("max element is : "+max(arr));
		
//		int result = maxinrange(arr,1,2);
//		System.out.println(result);

		// one way
//		reverse(arr); 
		// Second way
		reverseByTwoPointer(arr);

	}
	
	// Q Swap elements of array
	static void swap(int[] nums, int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
	
	// Q maximum in range
	static int maxinrange(int[] nums, int start, int end) {
		// work on edge cases here , like array is being null
		if(end < start) {
			return -1;
		}
		
		if(nums == null) {
			return -1;
		}
		
		// combine
//		if(nums == null || end < start) {
//			return -1;
//		}
		
		int max = nums[start];
		for(int i=start; i<=end; i++) { 
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		return max;
	}
	
	// Q max element in array
	static int max(int[] nums) {
		// edge case here could be
		if(nums.length == 0) {
			return -1;
		}
		
		int max = nums[0];
		for(int i=0; i<nums.length; i++) {  
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		return max;

	}
	
	//Q Reverse the Array
	static void reverse(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n/2; i++) {
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}
	
	// Second Method 
	static void reverseByTwoPointer(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(end > start) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));

	}
}
