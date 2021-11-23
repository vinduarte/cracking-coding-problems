package com.viniciusduartelopes.crackingcodingproblems.chapter01;

public class PalindromePermutation_1_4_v1 {

    public static boolean pp(String str) {

        final int MAX_CHAR = 1024;
        int letters_count[] = new int[MAX_CHAR]; // default value is 0 for all elements.
        int odd_count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                letters_count[str.charAt(i)]++;
            }
            if (letters_count[str.charAt(i)] % 2 != 0) {
                odd_count++;
            } else {
                odd_count--;
            }
        }

        return odd_count <= 1;
    }

    public static void main(String[] args) {
        System.out.println(pp("tact coa"));
        System.out.println(pp("rome"));
        System.out.println(pp("abcd"));
        System.out.println(pp("abca"));
        System.out.println(pp("deed"));
        System.out.println(pp("wow"));
        System.out.println(pp("no lemon no melon"));
        System.out.println(pp("cccc"));
        System.out.println(pp("ccc"));
    }

}
