
package Client;

import Product.Product;
import Shop.Shop;

import java.util.ArrayList;

public class Client {
    private String name;
    private ArrayList<Product> purchases = new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }
    //Single-responsibility principle - принцин единственной ответственности
    //Только клиент может покупать товар
    public void buy(Product product, Shop shop){
        purchases.add(product);
        shop.sell(product);
    }
}
