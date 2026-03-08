package Array;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,17,6,8,9,32};
		int target = 6;
		largest(arr);
		minimum(arr);
		int sum = sum(arr);
		System.out.println("sum of array elements are "+ sum);
		
		linearSearch(arr,target);
		countEvenOdd(arr);
		reverse(arr);

	}
	
	// find Maximum number
	static void largest(int[] nums) {
		int max = nums[0];
		for(int i=0; i<=nums.length-1; i++) {
			if(max<nums[i]) {
				max = nums[i];
			}
		}
		System.out.println("biggest no is "+ max);
	}
	
	// Find minimum number
	static void minimum(int[] nums) {
		int min = nums[0];
		for(int i=0; i<nums.length; i++) {
			if(min>nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("smallest number is "+ min);

	}
	
	// Sum of an array
	static int sum(int[] nums) {
		int add=0;
		for(int i=0; i<nums.length; i++) {
			add += nums[i];
		}
		return add;
	}
	
	// Leaner Search 
	static void linearSearch(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(target == arr[i]) {
				System.out.println("Elemet is at "+ i +" index");
				return;
			}
		}
		System.out.println("Elemet not found");
	}
	
	// Count Even and Odd number in an Array
	static void countEvenOdd(int[] arr) {
		int EVEN = 0,ODD=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				EVEN++;
			}
			else {
				ODD++;
			}
		}
		System.out.println("total EVEN elemets are "+EVEN+" ODD elements are "+ODD);
	}
	
	// Reverse An array
	static void reverse(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n/2; i++) {
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		System.out.print("Reversed array is: ");
		
		for(int i : arr) {     //  For-Each loop
			System.out.print(i+" ");
		}
	}

}
