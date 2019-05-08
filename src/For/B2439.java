package For;

import java.util.Scanner;

public class B2439 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		if (n >= 1 && n <= 100) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n-i; j++) {
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}