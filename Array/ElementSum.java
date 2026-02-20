public class ElementSum {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 12, 4 };
        int arr1[] = { 2, 4, 8, 12, 2 };

        // Sum Using FOR LOOP
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum using for loop : " + sum);

        // Sum Using FOR-EACH LOOP
        int sum1 = 0;
        for (int x : arr1) {
            sum1 += x;
        }
        System.out.println("Sum using for each loop: " + sum1);
    }

}