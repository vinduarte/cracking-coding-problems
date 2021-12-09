package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long max = arr.get(0);
        long min = arr.get(0);
        long sum = 0;

        for (Integer el : arr) {
            if (el > max) {
                max = el;
            } else if (el < min) {
                min = el;
            }
            sum += el;
        }

        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
