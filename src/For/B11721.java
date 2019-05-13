package For;

import java.util.Scanner;

public class B11721 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;
		word = scan.next();
		String[] wordArr = word.split("");
		for (int i = 0; i < word.length(); i++) {
			if (i != 0 && i % 10 == 0) {
				System.out.println();
			}
			System.out.print(wordArr[i]);

		}

	}
}
