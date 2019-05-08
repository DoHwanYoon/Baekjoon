package For;

import java.util.Scanner;

public class B2739 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		if (n >= 1 && n <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(n + " * " + i + " = " + n * i);
			}
		}

	}

}
