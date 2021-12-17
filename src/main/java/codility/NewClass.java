package codility;

public class NewClass {
    public static int findDecimals(int max) {
        if (max == 0) {
            return 1;
        }

        int i;
        for (i = 0; max > 0; i++) {
            max /= 10;
        }

        return i;
    }

    public static int findSpaces(int[] a) {
        int max = -1;
        int i;
        for (i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
        }

        return findDecimals(max);
    }

    public static void solution(int[] A, int K) {
        int spaces = findSpaces(A);
        int i, j;

        // print first line
        for (j = 0; j < K && j < A.length; j++) {
            System.out.print("+");
            for (int z = 0; z < spaces; z++) {
                System.out.print("-");
            }
        }
        System.out.println("+");

        for (j = 0; j < K && j < A.length; j++) {
            System.out.print("|");
            for (int z = findDecimals(A[j]); z < spaces; z++) {
                System.out.print(" ");
            }
            System.out.print(A[j]);
        }
        System.out.println("|");

        // print other lines
        for (i = j; i < A.length; i += K) {
            for (j = 0; j < K; j++) {
                System.out.print("+");
                for (int z = 0; z < spaces; z++) {
                    System.out.print("-");
                }
            }
            System.out.println("+");

            for (j = 0; j < K && ((i + j) < A.length); j++) {
                System.out.print("|");
                for (int z = findDecimals(A[i + j]); z < spaces; z++) {
                    System.out.print(" ");
                }
                System.out.print(A[i + j]);
            }
            System.out.println("|");
        }

        // print last line
        int x = A.length % K;
        x = x == 0 ? K : x;

        for (int w = 0; w < x; w++) {
            System.out.print("+");
            for (int z = 0; z < spaces; z++) {
                System.out.print("-");
            }
        }
        System.out.println("+");
    }

    public static void main(String[] args) {

        solution(new int[] { 4, 35, 80, 123 }, 3);
        solution(new int[] { 4 }, 1000000000);
        solution(new int[] { 4 }, 1);
        solution(new int[] { 4 }, 3);
        solution(new int[] { 4, 35, 80, 123, 12345, 44, 8, 5 }, 10);
        solution(new int[] { 4, 35, 80, 123, 12345, 44, 8, 5, 24, 3 }, 4);
        solution(new int[] { 4, 35, 80, 123, 12345, 44, 8, 5, 24, 3, 22, 35 }, 4);
        solution(new int[] { 4, 35, 80, 123, 12345, 44, 8, 5, 24, 3, 22, 35 }, 1);
        solution(new int[] { 4, 35, 80, 123, 12345, 44, 8, 5, 24, 3, 22, 0 }, 4);
        solution(new int[] { 0, 35, 80, 123, 12345, 44, 8, 5, 24, 3, 22, 0 }, 3);
        solution(new int[] { 0, 35, 80, 123, 12345, 44, 8, 5, 24, 3, 22, 1000000000 }, 3);
    }
}
