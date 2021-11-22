package com.viniciusduartelopes.crackingcodingproblems.chapter01;

public class IsUnique_1_1 {

    private static boolean isUnique(String str) {
        final int MAX_CHAR = 1024;

        boolean char_code_found[] = new boolean[MAX_CHAR]; //default is false
        int char_code;

        for (int i = 0; i < str.length(); i++) {
            char_code = (int) str.charAt(i);
            if (char_code_found[char_code]) {
                return false;
            }
            char_code_found[char_code] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("test 1 = " + isUnique("aabc"));
        System.out.println("test 2 = " + isUnique("abcd"));
    }
}
