package Operation;

import java.util.Scanner;

public class B1001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		if (a > 0 && b < 10) {
			System.out.println(a - b);
		} else {
			System.out.println("a>0, b<10조건을 만족하세요.");
		}

	}

}
