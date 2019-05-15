package If; //실행 ok, 채점 x

import java.util.Scanner;
public class B9498 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		if(n>=0 && n<=100) {
			if(n>=90 && n<=100) {
				System.out.println("A");
			}
			else if(n>=80 && n<=89) {
				System.out.println("B");
			}
			else if(n>=70 && n<=79) {
				System.out.println("c");
			}
			else if(n>=60 && n<=69) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		}
	}

}
