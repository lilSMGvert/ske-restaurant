package shoppingCart;

import java.util.*; //* for all of util if future want to edit/modify by adding more classes from the Util library

public class shoppingCart {
	
	public static void method() {
		
		// variables and start
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int choice = 0;
		String pizza = "Pizza";
		String chicken = "Chicken";
		String coke = "Coke";
		String cake = "Cheese Cake";
		String vanilla = "Vanilla Ice Cream";
		int pizzaQty = 0;
		int chickenQty = 0;
		int cokeQty = 0;
		int cakeQty = 0;
		int vanillaQty = 0;
		int pizzaTotal = 0;
		int chickenTotal = 0;
		int cokeTotal = 0;
		int cakeTotal = 0;
		int vanillaTotal = 0;

		// menu
		System.out.printf("--------- Welcome to SKE Restaurant ---------\n");
		System.out.printf("1.) Pizza\t\t %5d Baht\n", 250);
		System.out.printf("2.) Chicken\t\t %5d Baht\n", 120);
		System.out.printf("3.) Coke\t\t %5d Baht\n", 45);
		System.out.printf("---------         Desserts          ---------\n");
		System.out.printf("4.) Cheese Cake\t\t %5d Baht\n", 100);
		System.out.printf("5.) Vanilla Ice Cream\t %5d Baht\n", 80);
		System.out.printf("6.) Total(Show Cart)\t\t\n");
		System.out.printf("7.) Modify/Subtract Cart\t\t\n");
		System.out.printf("8.) Exit\t\t%n\n");

		do {

			// body

			System.out.print("Enter your Choice: ");
			choice = scan.nextInt();

			if (choice > 8 || choice <= 0) {
				System.out.println("Error 404: item not found");
				System.out.println("");
			}
			if (choice == 1) { // pizza
				System.out.print("Enter Quantity: ");
				int quantity = scan.nextInt();
				pizzaQty += quantity;
				pizzaTotal += 250 * pizzaQty;
				System.out.println(""); // blank line
			}
			if (choice == 2) { // chicken
				System.out.print("Enter Quantity: ");
				int quantity = scan.nextInt();
				chickenQty += quantity;
				chickenTotal += 120 * chickenQty;
				System.out.println("");
			}
			if (choice == 3) { // coke
				System.out.print("Enter Quantity: ");
				int quantity = scan.nextInt();
				cokeQty += quantity;
				cokeTotal += 45 * cokeQty;
				System.out.println("");
			}
			if (choice == 4) { // cheese cake
				System.out.print("Enter Quantity: ");
				int quantity = scan.nextInt();
				cakeQty += quantity;
				cakeTotal += 100 * cakeQty;
				System.out.println("");
			}

			if (choice == 5) { // vanilla ice cream
				System.out.print("Enter Quantity: ");
				int quantity = scan.nextInt();
				vanillaQty += quantity;
				vanillaTotal += 80 * vanillaQty;
				System.out.println("");
			}

			if (choice == 6) { // show cart

				total = pizzaTotal + chickenTotal + cokeTotal + cakeTotal + vanillaTotal;

				System.out.println("+------ Menu ------+-- Qty --+-- Price --+");
				if (pizzaQty != 0) {
					System.out.printf("| %s \t   |   %5d |     %5d | \n", pizza, pizzaQty, pizzaTotal);
				}
				if (chickenQty != 0) {
					System.out.printf("| %s \t   |   %5d |     %5d | \n", chicken, chickenQty, chickenTotal);
				}
				if (cokeQty != 0) {
					System.out.printf("| %s \t           |   %5d |     %5d | \n", coke, cokeQty, cokeTotal);
				}
				if (cakeQty != 0) {
					System.out.printf("| %s \t   |   %5d |     %5d | \n", cake, cakeQty, cakeTotal);
				}
				if (vanillaQty != 0) {
					System.out.printf("| %s|   %5d |     %5d | \n", vanilla, vanillaQty, vanillaTotal);
				}
				System.out.printf("+------------------+---------+-----------+\n");
				System.out.printf("| Total \t\t     |     %5d | \n", total);
				System.out.print("+------------------+---------+-----------+\n\n");
			}

			if (choice == 7) { // modify cart (subtract)
				System.out.printf("Item\t\t   Qty in Cart\n");
				System.out.printf("1.) Pizza\t\t %5d\n", pizzaQty);
				System.out.printf("2.) Chicken\t\t %5d\n", chickenQty);
				System.out.printf("3.) Coke\t\t %5d\n", cokeQty);
				System.out.printf("4.) Cheese Cake\t\t %5d\n", cakeQty);
				System.out.printf("5.) Vanilla Ice Cream\t %5d\n", vanillaQty);

				System.out.print("Enter the item (number) that you wish to modify: ");
				int modify = scan.nextInt();
				// nested if to modify according to what item user chooses
				if (modify == 1) { // pizza
					System.out.print("What is the quantity you wish to remove? :");
					int remove = scan.nextInt();
					if (remove <= pizzaQty) {
						pizzaQty -= remove;
						pizzaTotal -= remove * 250;
					} else { // if user enter more than they have in cart it
								// will automatically put the value to 0
						pizzaQty = 0;
						pizzaTotal = 0;
					}
					System.out.println("");
				}
				if (modify == 2) { // chicken
					System.out.print("What is the quantity you wish to remove? :");
					int remove = scan.nextInt();
					if (remove <= chickenQty) {
						chickenQty -= remove;
						chickenTotal -= remove * 120;

					} else {
						chickenQty = 0;
						chickenTotal = 0;
					}
					System.out.println("");
				}

				if (modify == 3) { // coke
					System.out.print("What is the quantity you wish to remove? :");
					int remove = scan.nextInt();
					if (remove <= cokeQty) {
						cokeQty -= remove;
						cokeTotal -= remove * 45;
					} else {
						cokeQty = 0;
						cokeTotal = 0;
					}
					System.out.println("");
				}

				if (modify == 4) { // cheese cake
					System.out.print("What is the quantity you wish to remove? :");
					int remove = scan.nextInt();
					if (remove <= cakeQty) {
						cakeQty -= remove;
						cakeTotal -= remove * 100;
					} else {
						cakeQty = 0;
						cakeTotal = 0;
					}
					System.out.println("");
				}
				if (modify == 5) { // vanilla ice cream
					System.out.print("What is the quantity you wish to remove? :");
					int remove = scan.nextInt();
					if (remove <= vanillaQty) {
						vanillaQty -= remove;
						vanillaTotal -= remove * 80;
					} else {
						vanillaQty = 0;
						vanillaTotal = 0;
					}
					System.out.println("");
				}
				System.out.println("Key in 6 for your choice to show cart");
				System.out.println("");
			}

		} while (choice != 8);
		// when user press 8 to exit
		System.out.println("===== Thank you! Please come again! =====");
		System.exit(0);
		// end of program
		
	}

	public static void main(String[] args) {
		method();
	}
}
