package Lec22_11_Feb;

public class KaprekarNumber {

    public static void main(String[] args) {

        int num = 45;  
        int square = num * num;

        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // create divisor = 10^digits
        int divisor = 1;
        for (int i = 0; i < digits; i++) {
            divisor *= 10;
        }

        // split the square
        int right = square % divisor;
        int left = square / divisor;

        if (left + right == num)
            System.out.println(num + " is a Kaprekar number");
        else
            System.out.println(num + " is not a Kaprekar number");
    }
}
