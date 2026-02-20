import java.util.Scanner;

public class SearchingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Taking Size of array
        System.out.println("Enter size of an Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

// Storing Elements from User
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
// Printing Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

// Finding Elements 
        System.out.println("Enter target elemets: ");
        int target = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                System.out.println(target+" is at "+i+" index");
            }
        }
        
    }
}
