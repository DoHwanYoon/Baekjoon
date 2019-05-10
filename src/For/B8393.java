package For;

import java.util.Scanner;
public class B8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, sum=0;
		n= scan.nextInt();
		if(n>=1 && n<=10000) {
			for(int i=1; i<=n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}

	}

}
