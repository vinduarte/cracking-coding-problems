package leetcode;

public class DuplicateZeros {

    // In-place
    public static void duplicateZeros(int[] arr) {
        int limitOfValidIndex = arr.length;
        int i = 0;
        // Defining new limit of valid values
        for (; i < limitOfValidIndex - 1; i++) {
            if (arr[i] == 0) {
                limitOfValidIndex--;
            }
        }
        int numberOfZerosAcessed = 0;

        // Counting zeros in limit and not in the last index
        for (i = 0; i < limitOfValidIndex && i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                numberOfZerosAcessed++;
            }
        }

        if (numberOfZerosAcessed == 0) {
            return;
        }

        int j = arr.length - 1;
        int k = limitOfValidIndex - 1;

        // If you have more zeros than spaces, you can't duplicate 
        if (numberOfZerosAcessed > (arr.length - i)) {
            arr[j--] = arr[k--];
        }
        for (; j >= 0 && k >= 0; j--, k--) {
            arr[j] = arr[k];
            if (arr[j] == 0) {
                arr[--j] = 0;
            }
            if (k == j) {
                return;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 0, 6, 8, 0, 6, 0};
        duplicateZeros(arr);
        printArray(arr);

        arr = new int[]{0, 1, 0, 1};
        duplicateZeros(arr);
        printArray(arr);
        /*
        [1,0,2,3,0,4,5,0]
[0,1]
[1,0]
[1,2,3,0]
[1,2,0,3]
[1,2,0,0]
[0,1,0,1]
[1,2,3]
[0]
[1]
         */
    }
}
