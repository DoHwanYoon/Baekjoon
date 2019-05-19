package Operation;//디버깅은 ok, 채점은x

import java.util.Scanner;

public class B2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, x = 0, y = 0;
		n = scan.nextInt();
		if (n >= 3 && n <= 5000) {
			while (n % 3 != 0 || n != 0) {
				n -= 5;
				x++;
				if (n < 3) {
					n += 5;
					x--;
					break;
				}
			}
			if (n % 3 == 0) {
				y = n / 3;
			} else{
				n = n + 5 * x;
				x = 0;
				while (n != 0) {
					n -= 3;
					y++;
					if (n < 0) {
						System.out.println("-1");
						return;
					}
				}
			}
		}
		System.out.println(x + y);
	}
}
