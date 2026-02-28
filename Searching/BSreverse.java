package DSA;

public class BSreverse {
	
	public static int reverseBS(int number[], int key) {
		int start=0,end=number.length-1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(number[mid]==key) {
				return mid;
			}
			else if(number[mid]>key) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {12,11,10,9,8,7,6,5,4,3};
		int key = 9;
		
		System.out.println("key is found at "+ reverseBS(number,key));

	}

}
