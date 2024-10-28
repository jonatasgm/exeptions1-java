package principal;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
/*
import entities.Employee;
import entities.OutSourceEmployee;


import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
*/

public class program {

	public static void main (String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow! That's awesome!");
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:58"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(c1);
		
		Post p2 = new Post(
				sdf1.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"Good night",
				5);
		 */
		/*
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002,"Maria", 0.0, 500.0);
		
		// Upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//Downcasting
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
	 não é possível fazer o Downcasting de duas classes inferiores BusinessAccount acc5 =(BusinessAccount)acc3;
		 Para realizar o Downcasting utilize o instanceof
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 =(BusinessAccount)acc3;
			acc5.loan(200.0);
		}
		*/
		
		
		/* empregados

	
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees: " );
		Integer numberEmployee = sc.nextInt();
		
		for (int i = 1; i >= numberEmployee; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsource (y/n)? ");
		    char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutSourceEmployee(name, hours, valuePerHour, additionalCharge));
		    } else {
		   
		    	list.add(new Employee (name, hours, valuePerHour));
		    }		
		}
		
		System.out.println();
		System.out.println("Payments:");
		
		for(Employee emp: list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
			 */
		
		/* Produtos 
		
		List<Product> product = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.println("Custom fee: ");
				Double customsFee = sc.nextDouble();
				product.add(new ImportedProduct (name, price, customsFee ));				
			} else if (ch == 'u') {
				System.out.println("Manufactured Data (dd/MM/yyyy): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				product.add(new UsedProduct(name, price, manufactureDate ));
			} else if (ch == 'c') {
				  product.add(new Product(name, price));
			} else {
				System.out.println("Error");
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAG:");
		for(Product prod: product) {
			System.out.println(prod.priceTag());
		}
				 */
		sc.close();
	}

}
