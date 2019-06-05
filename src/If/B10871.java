package If;

import java.util.Scanner;
public class B10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int min = scan.nextInt();
		int num[] = new int[n];

		for (int a = 0; a < num.length; a++) {
			num[a] = scan.nextInt();
		}
		for (int b = 0; b < num.length; b++) {
			if (num[b] < min) {
				System.out.print(num[b] + " ");
			}

		}

	}

}
