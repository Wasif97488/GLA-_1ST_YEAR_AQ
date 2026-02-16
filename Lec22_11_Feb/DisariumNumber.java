package Lec22_11_Feb;

public class DisariumNumber {

    public static void main(String[] args) {

        int num = 135;   
        int original = num;

        // Step 1: count digits
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Step 2: calculate sum
        temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            count--;
            temp /= 10;
        }

        // Step 3: compare
        if (sum == original)
            System.out.println(original + " is a Disarium number");
        else
            System.out.println(original + " is not a Disarium number");
    }
}
