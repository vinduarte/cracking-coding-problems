package com.viniciusduartelopes.crackingcodingproblems.chapter01;

public class CheckPermutation_1_2 {

    private static boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        final int MAX_CHAR = 1024;
        int letters_count[] = new int[MAX_CHAR]; // default value is 0 for all elements.

        for (int i = 0; i < s1.length(); i++) {
            letters_count[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            letters_count[s2.charAt(i)]--;
            if (letters_count[s2.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("test 1 = " + checkPermutation("abcd", "dacb"));
        System.out.println("test 2 = " + checkPermutation("abcd", "dacb1"));
        System.out.println("test 3 = " + checkPermutation("ffg", "gge"));
        System.out.println("test 4 = " + checkPermutation("aabb", "baab"));
        System.out.println("test 5 = " + checkPermutation("aabb", "aaac"));
    }
}
