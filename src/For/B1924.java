package For;

import java.util.Scanner;

public class B1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] dayOfTheWeeks = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		int totalDays = day;
		for (int i = 0; i < month - 1; ++i) {
			totalDays += daysInMonth[i];
		}

		System.out.println(dayOfTheWeeks[totalDays % 7]);
	}

}
