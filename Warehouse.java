import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse {
    ArrayList<Product> listOfProducts = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void listOfAllProducts() {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();

        listOfProducts.add(product1);
        listOfProducts.add(product2);
        listOfProducts.add(product3);
        listOfProducts.add(product4);
        listOfProducts.add(product5);

        product1.product_name = "Cipla Derma";
        product2.product_name = "Nestle Maggi";
        product3.product_name = "Paracetamol";
        product4.product_name = "Dexa";
        product5.product_name = "Iron Folic Acid Capsules";

        product1.expiry_date = "08/2024";
        product2.expiry_date = "01/2023";
        product3.expiry_date = "08/2024";
        product4.expiry_date = "11/2024";
        product5.expiry_date = "11/2024";

        product1.mfg_date = "03/2020";
        product2.mfg_date = "07/2022";
        product3.mfg_date = "06/2020";
        product4.mfg_date = "09/2020";
        product5.mfg_date = "08/2020";

        product1.mrp = 25.0f;
        product2.mrp = 50.75f;
        product3.mrp = 10f;
        product4.mrp = 12.70f;
        product5.mrp = 75.80f;

        product1.productionCost = 10f;
        product2.productionCost = 20f;
        product3.productionCost = 4f;
        product4.productionCost = 6f;
        product5.productionCost = 30f;

        product1.stock = 3;
        product2.stock = 15;
        product3.stock = 31;
        product4.stock = 25;
        product5.stock = 5;

        int j = 1;
        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.print("Product " + j + " name: ");
            System.out.println(listOfProducts.get(i).product_name);
            j++;
        }
    }

    public void displayInformation() {
//        listOfAllProducts();
        int choice;
        do {
            System.out.println("");
            System.out.println("6.Exit");
            System.out.print("Choose product to get information: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Expiry date: " + listOfProducts.get(0).expiry_date);
                    System.out.println("Manufacturing date: " + listOfProducts.get(0).mfg_date);
                    System.out.println("MRP: " + listOfProducts.get(0).mrp + " ₹");
                    System.out.println("No. of units available: " + listOfProducts.get(0).stock);
                    break;
                case 2:
                    System.out.println("Expiry date: " + listOfProducts.get(1).expiry_date);
                    System.out.println("Manufacturing date: " + listOfProducts.get(1).mfg_date);
                    System.out.println("MRP: " + listOfProducts.get(1).mrp + " ₹");
                    System.out.println("No. of units available: " + listOfProducts.get(1).stock);
                    break;
                case 3:
                    System.out.println("Expiry date: " + listOfProducts.get(2).expiry_date);
                    System.out.println("Manufacturing date: " + listOfProducts.get(2).mfg_date);
                    System.out.println("MRP: " + listOfProducts.get(2).mrp + " ₹");
                    System.out.println("No. of units available: " + listOfProducts.get(2).stock);
                    break;
                case 4:
                    System.out.println("Expiry date: " + listOfProducts.get(3).expiry_date);
                    System.out.println("Manufacturing date: " + listOfProducts.get(3).mfg_date);
                    System.out.println("MRP: " + listOfProducts.get(3).mrp + " ₹");
                    System.out.println("No. of units available: " + listOfProducts.get(3).stock);
                    break;
                case 5:
                    System.out.println("Expiry date: " + listOfProducts.get(4).expiry_date);
                    System.out.println("Manufacturing date: " + listOfProducts.get(4).mfg_date);
                    System.out.println("MRP: " + listOfProducts.get(4).mrp + " ₹");
                    System.out.println("No. of units available: " + listOfProducts.get(4).stock);
                    break;
                default:
                    System.out.println("Product not found!");
                    break;
            }
        } while (choice != 6);
    }

    public void purchase() {
//        listOfAllProducts();
        int choice, choice1;
        do {
            System.out.println("");
            System.out.println("6.Exit");
            System.out.print("Choose product to buy: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("MRP: " + listOfProducts.get(0).mrp + " ₹");
                    System.out.println("No. of units available: " + listOfProducts.get(0).stock);
                    do {
                        System.out.println("Press 1 for buy or 2 for quit");
                        choice1 = input.nextInt();
                        if (listOfProducts.get(0).stock != 0) {
                            switch (choice1) {
                                case 1:
                                    System.out.println("Product Purchased");
                                    listOfProducts.get(0).stock--;
                                    System.out.println("No. of units available: " + listOfProducts.get(0).stock);
                                    listOfProducts.get(0).sales += listOfProducts.get(0).mrp;
                                    listOfProducts.get(0).productsSold++;
                                    break;
                                case 2:
                                    System.out.println("Product not Purchased");
                                    break;
                                default:
                                    System.out.println("Please enter valid input");
                            }
                        } else {
                            System.out.println("Stock is empty");
                        }
                    } while (choice1 != 2);
                    break;
                case 2:
                    System.out.println("MRP: " + listOfProducts.get(1).mrp + " ₹");
                    System.out.println("No. of units available: " + listOfProducts.get(1).stock);
                    do {
                        System.out.println("Press 1 for buy or 2 for quit");
                        choice1 = input.nextInt();
                        if (listOfProducts.get(1).stock != 0) {
                            switch (choice1) {
                                case 1:
                                    System.out.println("Product Purchased");
                                    listOfProducts.get(1).stock--;
                                    System.out.println("No. of units available: " + listOfProducts.get(1).stock);
                                    listOfProducts.get(1).sales += listOfProducts.get(1).mrp;
                                    listOfProducts.get(1).productsSold++;
                                    break;
                                case 2:
                                    System.out.println("Product not Purchased");
                                    break;
                                default:
                                    System.out.println("Please enter valid input");
                            }
                        } else {
                            System.out.println("Stock is empty");
                        }
                    } while (choice1 != 2);
                    break;
                case 3:
                    System.out.println("MRP: " + listOfProducts.get(2).mrp + " ₹");
                    System.out.println("No. of units available: " + listOfProducts.get(2).stock);
                    do {
                        System.out.println("Press 1 for buy or 2 for quit");
                        choice1 = input.nextInt();
                        if (listOfProducts.get(2).stock != 0) {
                            switch (choice1) {
                                case 1:
                                    System.out.println("Product Purchased");
                                    listOfProducts.get(2).stock--;
                                    System.out.println("No. of units available: " + listOfProducts.get(2).stock);
                                    listOfProducts.get(2).sales += listOfProducts.get(2).mrp;
                                    listOfProducts.get(2).productsSold++;
                                    break;
                                case 2:
                                    System.out.println("Product not Purchased");
                                    break;
                                default:
                                    System.out.println("Please enter valid input");
                            }
                        } else {
                            System.out.println("Stock is empty");
                        }
                    } while (choice1 != 2);
                    break;
                case 4:
                    System.out.println("MRP: " + listOfProducts.get(3).mrp + " ₹");
                    System.out.println("No. of units available: " + listOfProducts.get(3).stock);
                    do {
                        System.out.println("Press 1 for buy or 2 for quit");
                        choice1 = input.nextInt();
                        if (listOfProducts.get(3).stock != 0) {
                            switch (choice1) {
                                case 1:
                                    System.out.println("Product Purchased");
                                    listOfProducts.get(3).stock--;
                                    System.out.println("No. of units available: " + listOfProducts.get(3).stock);
                                    listOfProducts.get(3).sales += listOfProducts.get(3).mrp;
                                    listOfProducts.get(3).productsSold++;
                                    break;
                                case 2:
                                    System.out.println("Product not Purchased");
                                    break;
                                default:
                                    System.out.println("Please enter valid input");
                            }
                        } else {
                            System.out.println("Stock is empty");
                        }
                    } while (choice1 != 2);
                    break;
                case 5:
                    System.out.println("MRP: " + listOfProducts.get(4).mrp + " ₹");
                    System.out.println("No. of units available: " + listOfProducts.get(4).stock);
                    do {
                        System.out.println("Press 1 for buy or 2 for quit");
                        choice1 = input.nextInt();
                        if (listOfProducts.get(4).stock != 0) {
                            switch (choice1) {
                                case 1:
                                    System.out.println("Product Purchased");
                                    listOfProducts.get(4).stock--;
                                    System.out.println("No. of units available: " + listOfProducts.get(4).stock);
                                    listOfProducts.get(4).sales += listOfProducts.get(4).mrp;
                                    listOfProducts.get(4).productsSold++;
                                    break;
                                case 2:
                                    System.out.println("Product not Purchased");
                                    break;
                                default:
                                    System.out.println("Please enter valid input");
                            }
                        } else {
                            System.out.println("Stock is empty");
                        }
                    } while (choice1 != 2);
                    break;
                default:
                    System.out.println("Product not found!");
                    break;
            }
        } while (choice != 6);
    }

    public float profit() {
        float totalSales = listOfProducts.get(0).sales + listOfProducts.get(1).sales +
                listOfProducts.get(3).sales + listOfProducts.get(4).sales + listOfProducts.get(2).sales;
        float totalProductionCost = listOfProducts.get(0).productsSold * listOfProducts.get(0).productionCost +
                listOfProducts.get(1).productsSold * listOfProducts.get(1).productionCost +
                listOfProducts.get(2).productsSold * listOfProducts.get(2).productionCost +
                listOfProducts.get(3).productsSold * listOfProducts.get(3).productionCost +
                listOfProducts.get(4).productsSold * listOfProducts.get(4).productionCost;
        if (listOfProducts.get(1).productsSold + listOfProducts.get(2).productsSold +
                listOfProducts.get(3).productsSold + listOfProducts.get(4).productsSold == 0) {
            return 0;
        } else {
            return totalSales - totalProductionCost;
        }
    }
}