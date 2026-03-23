package Lec28_17_Mar;

import java.util.Scanner;

public class PositiveAndNegativeElementCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive elements: " + positiveCount);
        System.out.println("Negative elements: " + negativeCount);
    }
}