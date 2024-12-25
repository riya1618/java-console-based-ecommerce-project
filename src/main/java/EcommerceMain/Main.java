package EcommerceMain;

import java.io.IOException;
import java.util.Scanner;

import EcommerceMain.Product.ProductManagement;
import EcommerceMain.User.UserManagement;


public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("################ Welcome To E-Commerce ###########");
		Login.login();
		while (true) {
			System.out.println("What would you like today?");
			System.out.println("1.User Management");
			System.out.println("2.Product Management");
			System.out.println("9.Quit");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				UserManagement.userManagement();
				break;
			case 2:
				ProductManagement.productManagement();
				break;
			case 9:
				System.out.println("###EXIT the Application###");
				return;

			default:
				System.out.println("Invalid Option");

			}
		}
	}

}
