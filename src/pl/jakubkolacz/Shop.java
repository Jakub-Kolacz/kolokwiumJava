package pl.jakubkolacz;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        StoreWarehouse.loadExampleArticles();
        System.out.println("Welcome in our shop");
        System.out.println("Create client to do shopping");
        System.out.println("Provide your pesel");
        Scanner scanner = new Scanner(System.in);
        Client client = new Client(scanner.nextLine(), new Basket(new ArrayList<>()));
        System.out.println("press any key to continue, but not 0");
        int i = scanner.nextInt();
        scanner.close();
        Scanner productScanner = new Scanner(System.in);
        if(i != 0) {
            System.out.println("Now you can do shopping, what do you want to buy?");
            System.out.println(StoreWarehouse.getAvailableProducts());
            System.out.println("Provide product name to add it to your basket");
            String product = productScanner.next();
            client.getBasket().addProduct(product);
            System.out.println("If you want to end session, press 0. To continue shopping, press any key");
            i = productScanner.nextInt();
        }
        System.out.println("Value of your basket is: " + client.getBasket().value);
        return;
    }
}
