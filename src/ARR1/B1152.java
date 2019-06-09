package ARR1;

import java.util.Scanner;
public class B1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();
         
        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(input.split(" ").length);
        }
	}

}
