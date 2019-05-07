package Operation;//다시풀기

import java.util.Scanner;

public class B2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, x = 0, y = 0;
		n = scan.nextInt();
		if (n >= 3 && n <= 5000) {
			for(int i=0; n==3; i++) {
				n -= 5;
				x=i;
			}
			for(int i=0; n>=0; i++) {
				if(n%3 == 0) {
				n -= 3;
				y=i;
				}
				else {
					System.out.println("-1"); 
					return;
				}
			}
			System.out.println(x+y);
		}else {
			System.out.println("n >= 3 && n <= 5000조건을 만족하세요.");
		}

	}

}
