import java.util.ArrayList;

public class Calculator {
    //  private Formatter formatter = new Formatter();
    private final int howManyPeople;
    private final ArrayList<Product> products; // создал массив


    public Calculator(int howManyPeople) {
        this.howManyPeople = howManyPeople;
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
        System.out.println("Товар '" + name + "' успешно добавлен");
    }


    public double calculateTotalPrice() {
        double totalPrice = 0.00;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void printSummary() {
        System.out.println("Добавленные товары:");
        for (Product product : products) {
            System.out.println(product);
        }


        double totalPrice = calculateTotalPrice();
        double pricePerPerson = totalPrice / howManyPeople;

        String formattedTotalPrice = Formatter.rubles(totalPrice);
        String formattedPricePerPerson = Formatter.rubles(pricePerPerson);

        System.out.println(String.format("Общая сумма: %.2f %s", totalPrice, formattedTotalPrice));
        System.out.println(String.format("Сумма для каждого человека: %.2f %s", pricePerPerson, formattedPricePerPerson));


    }
}
