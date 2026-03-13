package Array;
import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		
		int lastEle = arr[n-1];
		
		for(int i=n-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0]=lastEle;
		
		System.out.println("Right rotated array: " + Arrays.toString(arr));

	}

}
