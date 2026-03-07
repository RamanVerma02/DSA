package Array;
import java.util.*;

public class ArraysProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,8,2,9};
		int[] arr2 = {1,3,5,8,2,9};
		
		// Arrays.equals(array1, array2)
		// Purpose: Dono arrays same elements rakhte hain ya nahi check karta hai.
		System.out.println(Arrays.equals(arr,arr2));
		
		
		// Arrays.sort(array)
		// Array ko ascending order me sort karta hai.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		// Arrays.binarySearch(array, key)
		// Sorted array me key element search karna.
		int index = Arrays.binarySearch(arr, 8);
		System.out.println(index);
		
		// Arrays.stream(array)
		// Array ko stream me convert karta hai → functional programming ke liye useful.
		// Aggregate functions (sum, max, min, average, count)
		int sum = Arrays.stream(arr).sum();
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println(sum+" "+min+" "+max+" "+avg);


		
	}

}
