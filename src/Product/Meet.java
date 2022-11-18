package Product;
//Liskov substitution principle - Принцип замены Барбары Лисков
//Мясо является продуктом, который имеет название, цену и страну взращивания
//Мясо играет роль предка
public class Meet extends Product{
    public Meet(String name, String manufacturer, double price) {
        super(name, manufacturer, price);
    }
}
