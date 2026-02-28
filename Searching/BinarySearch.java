package DSA;

public class BinarySearch {

    public static int binarySearch( int number[], int key){
        int start =0 , end = number.length-1;
        
        while(start<= end){
            int mid = start+(end-start)/2;
            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int number[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 3;
        System.out.println("Key is found at " + binarySearch(number,key));
    }
}

