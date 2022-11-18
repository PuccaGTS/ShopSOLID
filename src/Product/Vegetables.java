package Product;
//Liskov substitution principle - Принцип замены Барбары Лисков
//Овощи являются продуктом, который имеет название, цену и страну взращивания
//Овощи играют роль предка
public class Vegetables extends Product{
    public Vegetables(String name, String manufacturer, double price) {
        super(name, manufacturer, price);
    }
}
