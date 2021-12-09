package amazon;

public class AMZ001_FindingMissingNumberInArray {

    private static int findMissing(int[] numbers) {
        long n = numbers.length + 1;
        long sumOfOneToN = (n * (n + 1)) / 2;
        long sum = 0;

        for (int value : numbers) {
            sum += value;
        }

        return (int) (sumOfOneToN - sum);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 2, 8, 4, 5};
        System.out.println(findMissing(numbers));
    }

}
