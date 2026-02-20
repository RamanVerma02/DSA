public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,3,0,5};

        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        int n = arr.length;
        int total = n*(n+1)/2;

        int sum = 0;
        for(int x : arr){
            sum += x;
        }

        int missing = total - sum;
        System.out.println("Missing elemet is: "+ missing);

    }
}

/*
## LeetCode 268 – Missing Number

### Approach 1: Sum Formula
- Expected sum = n*(n+1)/2
- Actual sum = sum of array
- Missing = expected - actual

### Complexity
- Time: O(n)
- Space: O(1)

*/