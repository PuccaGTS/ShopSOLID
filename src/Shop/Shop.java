package Shop;

import Product.*;

import java.util.List;
import java.util.function.Predicate;

public class Shop {
    private String name;
    private List<Product> products;

    public Shop(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void filterProduct (List<Product> list, Predicate<Product>predicate){
        for (Product product:list) {
            if(predicate.test(product)){
                System.out.println(product);
            }
        }
        System.out.println("======================================");
    }

    public void showAllProducts(){
        System.out.println("///////////////////////////////////////////");
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%30s\n", products.get(i));
        }
        System.out.println("///////////////////////////////////////////");
    }


}
