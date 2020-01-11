package chocolate;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException, NoSuchElementException {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int n = 0; n < i; n++) {
            int num = scanner.nextInt();
            int[] arr = new int[num];
            for (int j = 0; j < num; j++) {
                arr[j] = scanner.nextInt();
            }
            Solution solution = new Solution();
            System.out.println("Min=" + solution.getMinValue(arr) + " " + "Max=" + solution.getMaxValue(arr));
        }
        System.exit(0);
    }

    private int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    private int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

}