public class TwoDarrayOperations {
    static void addition(int[][] a, int[][] b) {
        int c[][] = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");

                // System.out.print(a[i][j] + b[i][j] +" ");
            }
            System.out.println();
        }
    }

    static void subtraction(int[][] a, int[][] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] - b[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void additionByForeachLoop(int[][] a, int[][] b) {
        int c[][] = new int[a.length][a[0].length];

        // Creation of C array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Printing 2D Array C
        for (int x[] : c) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 2, 2, 2 }, { 2, 5, 2 }, { 2, 2, 2 } };
        int b[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

        // addition(a, b);
        // subtraction(a, b);
        additionByForeachLoop(a, b);
    }
}
