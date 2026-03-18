package Array;

public class CheckifSorted {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4};
		
		
		// 1st Way
		System.out.println(isSorted(arr));   // option first for output
		if(isSorted(arr)){					// option second for output
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is NOT Sorted");
        }
		
		
		// 2nd Way
		isSorted2(arr);
		
	}
	
	// 1st Way
    static boolean isSorted(int[] arr){
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    
    // 2nd Way
    static void isSorted2(int[] arr){
        boolean isSorted = true;
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        
        if(isSorted){
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is NOT Sorted");
        }

    }
}
