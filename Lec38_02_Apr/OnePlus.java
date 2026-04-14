package Lec38_02_Apr;

import java.util.Arrays;

public class OnePlus {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // increment
                return digits; // no carry, return
            }
            digits[i] = 0; // if digit is 9, make it 0 and carry forward
        }

        // If all digits were 9 (e.g., 999 → 1000)
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};

        int[] result = plusOne(digits);

        System.out.println("Result: " + Arrays.toString(result));
    }
}
