public class CopyAnArray {

    static void copyOfArray(int[] A ){
        int[] B = new int[A.length];

        for(int i=0; i<A.length; i++){
            B[i] = A[i];
        }

        for(int x : B){
            System.out.print(x+" ");
        }
    }

    static void reverseCopyOfArray(int[] A){
        int[] B = new int[A.length];

        int j = A.length-1;
        for(int i=0; i<B.length; i++){
            B[i] = A[j];
            j--;
        }

        for(int x : B){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        // copyOfArray(arr); 
        reverseCopyOfArray(arr);
        
    }
}
