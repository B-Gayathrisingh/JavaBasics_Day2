package Tasks;

import java.util.Scanner;

public class Eleven {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value of N: ");
	        int N = sc.nextInt();
	        System.out.println("First " + N + " even numbers:");
	        for (int i = 0; i < N; i++) {
	            System.out.print((i * 2) + " ");
	        }
	        sc.close();
	    }
}
