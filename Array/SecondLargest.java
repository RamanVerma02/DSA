package Array;

import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,7,5,23,23,17};
//		int largest = Integer.MIN_VALUE;
		int n = arr.length;
		Arrays.sort(arr);
		
		// 1st way
		System.out.println(Arrays.toString(arr));
//		System.out.println("Second largest "+ arr[n-2]);
//		System.out.println("Second minimum "+ arr[1]);

		
		// 2nd Way by loop
		
		for(int i= n-2; i>=0; i--) {
			if(arr[i] != arr[n-1]) {
				System.out.println(arr[i]);
				break;
			}
		}

	}

}
