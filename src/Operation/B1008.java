package Operation;

import java.util.Scanner;

public class B1008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		if (a > 0 && b < 10) {
			System.out.println(a / b);
		} else {
			System.out.println("a>0, b<10������ �����ϼ���.");
		}

	}

}
