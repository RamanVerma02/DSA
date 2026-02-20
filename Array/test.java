import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String arr[] = {"apple", "mango", "papaya", "guava", "banana"};
        // java.util.Arrays.sort(arr);

        Arrays.sort(arr);

        for(String x : arr)
            System.out.println(x+" ");
    }
}
