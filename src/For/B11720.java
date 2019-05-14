package For;

import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt, result = 0;
		String num;
		cnt = scan.nextInt();
		num = scan.next();
		if (num.length() == cnt) {
			String[] num1 = num.split("");
			int[] num2 = new int[cnt];
			for (int i = 0; i < cnt; i++) {
				num2[i] = Integer.parseInt(num1[i]);
			}
			for(int i=0; i<cnt; i++) {
				result += num2[i];
			}
			System.out.println(result);
		}

	}
}