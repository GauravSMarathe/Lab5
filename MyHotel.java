package fundamentals;

import java.util.Scanner;

	public class MyHotel {

	    public static void main(String[] args) {
	        int choice, ch1;
	        char ans;
	        double totalAmount = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Welcome to Gaurav's Hotel");
	        do {
	            System.out.println("1: Starters\n2: Main Course\n3: Desserts\n4: Drinks");
	            choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    totalAmount += displayMenu("Starters");
	                    break;
	                case 2:
	                    totalAmount += displayMenu("Main Course");
                    break;
	                case 3:
	                    totalAmount += displayMenu("Desserts");
                    break;
	                case 4:
	                    totalAmount += displayMenu("Drinks");
                    break;
                default:
                    System.out.println("Invalid choice");
                break;
          }
            System.out.println("Do you want to add any other item? (Y/N)");
            ans = sc.next().charAt(0);
        } while (ans == 'Y' || ans == 'y');

	        System.out.println("Total Bill: " + totalAmount + " Rs");
	        System.out.println("Thanks for coming. Visit again :)");
	        sc.close();
	    }

       private static double displayMenu(String category) {
         double itemPrice = 0;
         Scanner sc = new Scanner(System.in);
	         System.out.println(category + ":");
            switch (category) {
             case "Starters":
	               System.out.println("1: Paneer Tikka - 120 Rs.");
	               System.out.println("2: Samosa - 60 Rs.");
	               System.out.println("3: Chicken Kebabs - 150 Rs.");
		           System.out.println("4: Vegetable Spring Rolls - 80 Rs.");
	                break;
	         case "Main Course":
	                System.out.println("1: Butter Chicken - 200 Rs.");
	                System.out.println("2: Biryani - 180 Rs.");
	                System.out.println("3: Palak Paneer - 160 Rs.");
	                System.out.println("4: Tandoori Roti with Dal - 120 Rs.");
	                break;
            case "Desserts":
	                System.out.println("1: Gulab Jamun - 50 Rs.");
	                System.out.println("2: Rasgulla - 60 Rs.");
	                System.out.println("3: Kheer - 70 Rs.");
	                System.out.println("4: Ice Cream - 40 Rs.");
	                break;
	         case "Drinks":
	                System.out.println("1: Mango Lassi - 80 Rs.");
	                System.out.println("2: Masala Chai - 40 Rs.");
	                System.out.println("3: Fresh Orange Juice - 60 Rs.");
	                System.out.println("4: Soda - 30 Rs.");
	                break;
	            default:
	                System.out.println("Invalid category");
	                break;
	        }
        System.out.print("Enter your choice (1-4): ");
	        int choice = sc.nextInt();
	        switch (choice) {
	            case 1:
	                itemPrice = 120;
	                break;
	            case 2:
	                itemPrice = 60;
	                break;
	            case 3:
	                itemPrice = 150;
	                break;
	            case 4:
	                itemPrice = 80;
	                break;
	            default:
	                System.out.println("Invalid choice");
                break;
        }
	        return itemPrice;
    }
}


	