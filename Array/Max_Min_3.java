public class Max_Min_3 {

    static void findAll(int[] arr) {

        if (arr.length < 3) {
            System.out.println("Array must have at least 3 elements");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for (int x : arr) {

            // Maximums
            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max3 = max2;
                max2 = x;
            } else if (x > max3 && x != max1 && x != max2) {
                max3 = x;
            }

            // Minimums
            if (x < min1) {
                min3 = min2;
                min2 = min1;
                min1 = x;
            } else if (x < min2 && x != min1) {
                min3 = min2;
                min2 = x;
            } else if (x < min3 && x != min1 && x != min2) {
                min3 = x;
            }
        }

        System.out.println("Max = " + max1);
        System.out.println("Second Max = " + max2);
        System.out.println("Third Max = " + max3);

        System.out.println("Min = " + min1);
        System.out.println("Second Min = " + min2);
        System.out.println("Third Min = " + min3);
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 4, 9, 6, 3};
        findAll(arr);
    }
}
