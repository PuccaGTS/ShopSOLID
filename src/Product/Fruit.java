package Product;
//Liskov substitution principle - Принцип замены Барбары Лисков
//Фрукт является продуктом, который имеет название, цену и страну взращивания
//Фрукт играет роль предка
public class Fruit extends Product{
    public Fruit(String name, String manufacturer, double price) {
        super(name, manufacturer, price);
    }
}
