package pl.jakubkolacz;

import java.util.List;
import java.util.Optional;

public class Basket {

    /*
    * Pojo class of basket
    * @variable basket - used list to allocate products in it
    * */

    public List<Product> basket;
    public double value;

    public Basket(List<Product> basket) {
        this.basket = basket;
        value = 0.0;
    }

    public void addProduct(String name){
        Optional<Product> productInWarehouse = StoreWarehouse.getProductByName(name);
        productInWarehouse.ifPresent(product -> {
            basket.add(product);
            value +=  product.getPrice();
        });
        if(productInWarehouse.isEmpty()){
            throw new IllegalArgumentException("Product does not exists");
        }
    }

    public List<Product> getBasket() {
        return basket;
    }

    public double getValue() {
        return value;
    }
}
