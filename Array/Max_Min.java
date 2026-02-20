public class Max_Min {

    // Function For Maximum And Minimum
    static int[] firstMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[] { max, min };
    }

    // Function For Second Maximum
    static int secondMaximum(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    // Function For Third Maximum
    static int thirdMaximum(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[0];
        int max3 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3) {
                max3 = arr[i];
            }
        }
        return max3;
    }

    // Function For Second Minimum
    static int secondMinimum(int[] arr){
        int min1 = arr[0];
        int min2 = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min1){
                min2= min1;
                min1 = arr[i];
            }
            else if(arr[i]<min2){
                min2 = arr[i];
            }
        }
        return min2;
    }

    // Function For Third Minimum
    static int thirdMinimum(int[] arr){
        int min1 = arr[0];
        int min2 = arr[0];
        int min3 = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min1){
                min3 = min2;
                min2= min1;
                min1 = arr[i];
            }
            else if(arr[i]<min2){
                min3 = min2;
                min2 = arr[i];
            }
            else if(arr[i]<min3){
                min3 = arr[i];
            }
        }
        return min3;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 2, 4, 9, 6, 3 };

        int[] result = firstMax(arr);

        // Maximum and Minimum ELement
        System.out.println("Max = " + result[0]);
        System.out.println("Min = " + result[1]);

        // Second Maximum Element
        System.out.println("Second Maximum Element: " + secondMaximum(arr));

        // Third Maximum Element
        System.out.println("Third Maximum Element: " + thirdMaximum(arr));

        // Second Minimum Element
        System.out.println("Second Minimum Element: " + secondMinimum(arr));

        // Third Minimum Element
        System.out.println("Third Minimum Element: " + thirdMinimum(arr));

    }

}
