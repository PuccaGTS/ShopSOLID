//Open-Closed principle - принцип открытости / закрытости
// можно расщирить класс Продукта, тогда все свойства появятся у наследников
//методы можно переопределить, если возникнет необходимость
package Product;
//Dependency inversion principle - принцип инверсии зависимостей
//Человек собирается купить продукты в магазине
//Возможно фрукты, а возможно овощи, в магазине их может быть много видов
//Не важно какой конечный продукт, главное человек идет в магазин за продуктами.
public abstract class Product {
    private String name;
    private String manufacturer;
    private double price;

    public Product(String name, String manufacturer, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", name, manufacturer, price);
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }
}
