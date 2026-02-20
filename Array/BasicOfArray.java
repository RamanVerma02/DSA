import java.util.*;

public class BasicOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[];                    // Declaration
        A = new int[5];             // Initialization
        int B[] = {1,2,3,4,5};      // Declaration + assinging values
        int C[] = new int[5];       // Declaration + Initialization


// Default Value of Array are ZERO 
        for(int i=0; i<5; i++){
            // System.out.print(A[i]++ +" ");
        }

// Printing Elements in accending order   
        for(int i=0; i<B.length; i++){
            // System.err.print(B[i]+" ");
        }

// Increment in Elements of array
        for(int i=0; i<B.length; i++){
            // System.err.print(++B[i]+" ");
        }

// Taking Input for Array Elements 
        System.out.println("Enter Elements: ");
        for(int i=0; i<C.length; i++){
            C[i] = sc.nextInt();
        }
// 1 --> Printing Elements 
        for(int i=0; i<C.length; i++){
            // System.out.print(C[i]+" ");
        }
// In Reverse Order
        for(int i=C.length-1; i>=0; i--){
            System.out.print(C[i]+" ");
        }

// 2 --> Using "FOR EACH LOOP" ( Works ONLY in ASSECNDING ORDER )
        for(int x : C){
            // System.out.print(x+"  ");
        }


    }
}
