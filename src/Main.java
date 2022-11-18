import Product.*;
import Shop.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Fruit("Яблоко", "Китай", 145.2);
        Product product2 = new Fruit("Апельсин", "Россия", 169.6);
        Product product3 = new Fruit("Банан", "Эквадор", 45.6);

        Product product4 = new Vegetables("Морковь", "Китай", 19.2);
        Product product5 = new Vegetables("Лук", "Пакистан", 78.5);
        Product product6 = new Vegetables("Помидор", "Казахстан", 112.1);

        Product product7 = new Meet("Свинина", "Россия", 345.5);
        Product product8 = new Meet("Говядина", "Казахстан", 454.4);
        Product product9 = new Meet("Баранина", "Казахстан", 543.0);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);

        Shop shop = new Shop("Магазинчик", products);

        shop.showAllProducts();


        shop.filterProduct(products, s->s.getPrice()<200);
        shop.filterProduct(products, s->s instanceof Fruit);
        shop.filterProduct(products, s->s.getManufacturer().equals("Казахстан"));

    }
}