package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Year?");
		int Year = in.nextInt();
		System.out.print(Year + " is a leap year: ");
		System.out.print(Year % 4 == 0 & Year % 100 != 0 | Year % 400 ==0); 
		// TODO Auto-generated method stub

	}

}
