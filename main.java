import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        Warehouse warehouse = new Warehouse();
        do {
            System.out.println("1. List of all Products");
            System.out.println("2. Display product information");
            System.out.println("3. Purchase product");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    warehouse.listOfAllProducts();
                    break;
                case 2:
                    warehouse.displayInformation();
                    break;
                case 3:
                    warehouse.purchase();
                    break;
                default:
                    System.out.println("Please enter valid input!");
            }
        } while (choice != 4);
//        //warehouse.listOfAllProducts();
//        warehouse.displayInformation();
//        warehouse.purchase();
        System.out.println("Total profit: " + warehouse.profit());
    }
}