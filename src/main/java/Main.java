import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int howManyPeople;
        while (true) {

            System.out.println("На сколько человек необходимо разделить счет?");
            howManyPeople = scanner.nextInt();
            if (howManyPeople <= 1) {
                System.out.println("Ошибка: Количество людей должно быть больше 1.");
            } else {
                break;
            }
        }
        Calculator calculator = new Calculator(howManyPeople);

        while (true) {
            System.out.print("Введите название товара (или 'Завершить' для подсчета): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("Завершить")) {
                break;
            }

                System.out.print("Введите стоимость товара (в формате рубли,копейки): ");
                double price = scanner.nextDouble();


            calculator.addProduct(input, price);
        }
        calculator.printSummary();
    }
}