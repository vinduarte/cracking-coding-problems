package com.viniciusduartelopes.crackingcodingproblems.hackerrank;

import java.io.*;
import java.util.Scanner;

public class TimeConversion {

    public static String timeConversion(String s) {
        char ampm = s.charAt(s.length() - 2);
        int hour = Integer.parseInt(s.substring(0, 2));
        String strWithoutAMPM = s.substring(0, s.length() - 2);

        if (ampm == 'A') {
            if (hour == 12) {
                return "00" + strWithoutAMPM.substring(2);
            } else {
                return strWithoutAMPM;
            }
        } else {
            if (hour == 12) {
                return strWithoutAMPM;
            } else {
                hour += 12;
                return hour + strWithoutAMPM.substring(2);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(timeConversion(s));
    }
}
