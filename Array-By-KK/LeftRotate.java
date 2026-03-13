package Array;

import java.util.Arrays;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		// Copy array for leftAtOne
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		leftAtOne(arr1);
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		leftAtTwo(arr2);
	}
	
	static void leftAtOne(int[] arr) {
		
		int n = arr.length;
		
		int first = arr[0];
		
		for(int i=0; i<n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = first;
		
		System.out.println("Left Rotated array by one position: " + Arrays.toString(arr));
	}
	
	static void leftAtTwo(int[] arr) {
		int n = arr.length;
		
		int first = arr[0];
		int second = arr[1];
		
		for(int i=0; i<n-2; i++) {
			arr[i] = arr[i+2];
		}
		
		arr[n-2] = first;
		arr[n-1] = second;
		
		System.out.println("Left Rotated array by two position: " + Arrays.toString(arr));

	}

}
