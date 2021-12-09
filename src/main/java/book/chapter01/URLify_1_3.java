package book.chapter01;

import java.util.Arrays;

public class URLify_1_3 {

    private static void urlify(char c[], int realSize) {

        int current_new = c.length - 1;

        for (int i = realSize - 1; i >= 0; i--) {
            if (c[i] != ' ') {
                c[current_new--] = c[i];
            } else {
                c[current_new] = '0';
                c[current_new - 1] = '2';
                c[current_new - 2] = '%';
                current_new -= 3;
            }

        }
    }

    private static int findRealSizeOfString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String test1 = "Mr John Smith    ";
        char[] c = test1.toCharArray();
        urlify(c, findRealSizeOfString(test1));
        System.out.println("test 1 = " + Arrays.toString(c));
    }
}
