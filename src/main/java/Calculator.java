import java.util.ArrayList;

public class Calculator {
    private Formatter formatter = new Formatter();
    private int howManyPeople;
    private ArrayList<Product> products; // создал массив


    public Calculator(int howManyPeople) {
        this.howManyPeople = howManyPeople;
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
        System.out.println("Товар '" + name + "' успешно добавлен.");
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

        String formattedTotalPrice = formatter.rubles(totalPrice);
        String formattedPricePerPerson = formatter.rubles(pricePerPerson);
        System.out.println("Общая сумма: " + String.format("%.2f", totalPrice) + formattedTotalPrice);
        System.out.println("Сумма для каждого человека: " + String.format("%.2f", totalPrice / howManyPeople) + formattedPricePerPerson);

    }
}
