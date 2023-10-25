import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int howManyPeople;
        while (true) {
            try {
                System.out.println("На сколько человек необходимо разделить счет?");
                howManyPeople = scanner.nextInt();
                if (howManyPeople <= 1) {
                    System.out.println("Ошибка: Количество людей должно быть больше 1");
                } else {
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка: Введите целое число");
                scanner.nextLine();
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
            double price;
            try {
                price = scanner.nextDouble();

                if (price <= 0) {
                    System.out.println("Ошибка: Стоимость товара не может быть отрицательной или 0");
                } else {
                    calculator.addProduct(input, price);
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка: Неверный формат данных");
                scanner.nextLine();
            }
        }
        calculator.printSummary();
    }
}