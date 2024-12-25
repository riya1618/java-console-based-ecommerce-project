package EcommerceMain.User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManagement {
	public static void userManagement() throws IOException {
		System.out.println("****Welcome to User Management****");

		ArrayList<User> userList = new ArrayList<>();
		String filePath = "C:\\Users\\rajsa\\eclipse-workspace\\Ecommerce20241012\\src\\EcommerceMain\\User\\User.txt";
		File file = new File(filePath);
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("What would you like to do today?");
			System.out.println("1.Add User");
			System.out.println("2.Update User");
			System.out.println("3.Delete User");
			System.out.println("4.Search User");
			System.out.println("5.Print User");
			System.out.println("9.Quit");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				User user = new User();

				System.out.println("\tEnter User Name:");
				user.userName = sc.next();

				System.out.println("\tEnter user Email:");
				user.userEmail = sc.next();

				System.out.println("\tEnter Passsword:");
				user.password = sc.next();

				userList.add(user);
				break;
			case 2:
				System.out.println("To Be Implemented......");
				break;
			case 3:
				System.out.println("DELETE USER");
				System.out.println("Enter User Name To Delete:");
				String userToDelete = sc.next();

				for (int i = 0; i < userList.size(); i++) {
					if (userList.get(i).userName.equals(userToDelete)) {
						userList.remove(i);
					}
				}
				break;
			case 4:
				System.out.println("SEARCH USER");
				System.out.println("Enter User Name To Search:");
				String userToSearch = sc.next();

				for (User data : userList) {
					if (data.userName.contains(userToSearch)) {
						System.out.println("User Found!");
						System.out.println("User Name:" + data.userName);
						System.out.println("User Email:" + data.userEmail);
					} else {
						System.out.println("User Not Found");
					}
				}
				break;
			case 5:
				System.out.println("PRINT USER");
				for (User data : userList) {
					System.out.println("User Name:" + data.userName);
					System.out.println("User Email:" + data.userEmail);
					System.out.println("User Password:" + data.password);
				}

				break;
			case 9:
				String filepath1 = "C:\\Users\\rajsa\\eclipse-workspace\\Ecommerce20241012\\src\\EcommerceMain\\User\\User.txt";
				File file1 = new File(filepath1);
				FileWriter fileWriter = new FileWriter(file1, false);
				BufferedWriter bw = new BufferedWriter(fileWriter);
				for (User data : userList) {
					bw.write(data.userName + "," + data.userEmail + "," + data.password + "\n");
				}
				bw.flush();
				bw.close();
				System.out.println("###EXIT the Application###");
				return;

			default:
				System.out.println("Invalid Option");
			}
		}
	}

}
