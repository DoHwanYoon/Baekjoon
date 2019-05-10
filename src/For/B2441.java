package For;

import java.util.Scanner;

public class B2441 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		if (n >= 1 && n <= 100) {
			for(int i =0; i<n; i++) {
				for(int k=0; k<i; k++) {
					System.out.print(" ");
				}
				for(int j=0; j<n-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}
