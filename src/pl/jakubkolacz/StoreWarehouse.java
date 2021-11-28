package pl.jakubkolacz;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StoreWarehouse {
    public static List<Product> availableProducts = new ArrayList<>();

    public StoreWarehouse() {
    }

    public static void loadExampleArticles(){
        availableProducts.add(new Product("Banana", 4.50));
        availableProducts.add(new Product("Apple", 2.00));
        availableProducts.add(new Product("Whiskey", 70));
        availableProducts.add(new Product("Pineapple", 10));
        availableProducts.add(new Product("Tomatoes", 3.00));
        availableProducts.add(new Product("Paper", 0.50));
    }

    public static Optional<Product> getProductByName(String name){
        return availableProducts.stream()
                .filter(product -> product.getName().equals(name))
                .findAny();
    }

    public static List<Product> getAvailableProducts() {
        return availableProducts;
    }

    public static void setAvailableProducts(List<Product> availableProducts) {
        StoreWarehouse.availableProducts = availableProducts;
    }
}
