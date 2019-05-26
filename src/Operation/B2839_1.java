package Operation;

import java.util.Scanner;
public class B2839_1 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         
        int count = n / 5;
         
        switch (n % 5) {
        case 0:
            System.out.println(count);
            break;
        case 1:
        case 3:
            System.out.println(count + 1);
            break;
        case 2:
            if (count < 2) {
                System.out.println(-1);
            } else {
                System.out.println(count + 2);
            }
            break;
        case 4:
            if (count < 1) {
                System.out.println(-1);
            } else {
                System.out.println(count + 2);
            }
            break;
        }

	}

}
