public class RightRotate {
    static void rotateByOneIndex(int[] arr){
        int first = arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = first;

        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    static void rotateByTwoIndex(int[] arr){
        int last = arr[arr.length-1];
        int secondLast = arr[arr.length-2];

        for(int i=arr.length-1; i>1; i--){
            arr[i] = arr[i-2];
        }
        arr[1] = last;
        arr[0] = secondLast;

        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        // rotateByOneIndex(arr);
        rotateByTwoIndex(arr);
    }
}
