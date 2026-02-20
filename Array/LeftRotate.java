public class LeftRotate {

    static void rotateByOneIndex(int[] arr) {

        // Shifting elements leftside by one index
        int last = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = last;

        // Printing elements
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    // Method for Left Two Index Rotate
    static void rotateByTwoIndex(int[] arr) {

        // Shifting elements leftside by one index
        int secLast = arr[0];
        int last = arr[1];

        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = arr[i + 2];
        }
        arr[arr.length-2] = secLast;
        arr[arr.length-1] = last;

        // Printing elements
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // Printing before rotating
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Rotate by one: ");
        rotateByOneIndex(arr);

        System.out.println("Rotate by two: ");
        rotateByTwoIndex(arr);
    }
}
