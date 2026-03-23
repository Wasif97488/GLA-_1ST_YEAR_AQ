package Lec30_19_Mar;

import java.util.Scanner;

public class UniqueElement {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Logic: print element only once
	        for (int i = 0; i < n; i++) {
	            int count = 0;

	            // check if appeared before
	            for (int j = 0; j < i; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }

	            if (count == 0) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	
	}

}
