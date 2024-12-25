package EcommerceMain.Product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
	public static void productManagement() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("####### Welcome To Product Management ######");

		ArrayList<Product> productList = new ArrayList<>();
		String filePath = "C:\\Users\\rajsa\\eclipse-workspace\\Ecommerce20241012\\src\\EcommerceMain\\Product\\Product.txt";
		File file = new File(filePath);
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);

		while (true) {
			System.out.println("What would you like today!!!!");
			System.out.println("1.Add Product");
			System.out.println("2.Update Product");
			System.out.println("3.Delete Product");
			System.out.println("4.Search Product");
			System.out.println("5.Display Product");
			System.out.println("9.Quit");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				Product product = new Product();

				System.out.println("Add Product:");
				System.out.println("\tEnter Product Name:");
				product.productName = sc.next();

				System.out.println("\tEnter Product Quantity:");
				product.productQuantity = sc.next();

				System.out.println("\tEnter Product Price:");
				product.productPrice = sc.next();

				productList.add(product);
				break;
			case 2:
				System.out.println("Update Product To Be Implemented......");
				break;
			case 3:
				System.out.println("DELETE PRODUCT");

				System.out.println("Enter Product Name To Delete:");
				String remove = sc.next();

				for (int i = 0; i < productList.size(); i++) {
					if (productList.get(i).productName.equals(remove)) {
						productList.remove(i);
						System.out.println("Product deleted successfully");
					}
				}
				break;
			case 4:
				System.out.println("SEARCH PRODUCT");
				System.out.println("Enter product name to Search");
				String productToSearch = sc.next();

				for (Product data : productList) {
					if (data.productName.contains(productToSearch)) {
						System.out.println("Product Found!");
						System.out.println("Product Name:" + data.productName);
						System.out.println("Product Price:" + data.productPrice);
						System.out.println("Product Quantity:" + data.productQuantity);
					} else {
						System.out.println("Product Not Found!");
					}
				}
				break;
			case 5:
				System.out.println("Print Product...\n");
				String line;
				while ((line = br.readLine()) != null) {
					String[] str = line.split(",");
					for (String data : str) {
						System.out.println(data);
					}
					System.out.println("product name=" + str[0]);
					System.out.println("product Price=" + str[1]);
					System.out.println("product Quantity=" + str[2]);
					System.out.println("\n");
				}
				break;
			case 9:
				String filepath = "C:\\Users\\rajsa\\eclipse-workspace\\Ecommerce20241012\\src\\EcommerceMain\\Product\\Product.txt";
				File file1 = new File(filepath);
				FileWriter fileWriter = new FileWriter(file1,false);
				BufferedWriter bw = new BufferedWriter(fileWriter);
				for (Product data : productList) {
					bw.write(data.productName + "," + data.productPrice + "," + data.productQuantity + "\n");
				}
				bw.flush();
				bw.close();
				System.out.println("###EXIT the Application###");
				return;
			default:
				System.out.println("Invalid option");
			}
		}
	}

}
