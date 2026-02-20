public class TwoDarrayMultiplication {
    static void multiplication(int[][] a, int[][] b) {
        int c[][] = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < a[i].length; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        for (int x[] : c) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
        int b[][] = { { 1, 5, 2 }, { 6, 8, 4 }, { 3, 9, 7 } };

        // multiplication(a, b);

        int c[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
        // for checking that working right set second array element like this 
        int d[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        multiplication(c, d);

    }
}
