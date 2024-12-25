package EcommerceMain;

import java.util.Scanner;

public class Login {
	public static void login() {
		Scanner sc = new Scanner(System.in);

		System.out.println("******Login:\n");

		System.out.println("\tEnter User Name:");
		String userName = sc.next();

		System.out.println("\tEnter Password:");
		String password = sc.next();

		System.out.println("\tEnter Confirm Password:");
		String confirmPassword = sc.next();

		if (password.equals(confirmPassword)) {
			System.out.println("Login Successfully\n");
		} else {
			System.out.println("Login Failed::");
		}
	}
}
