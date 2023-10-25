public class Formatter {
    public static String rubles(double i) {
        int rub;
        int x = (int) i % 100;

        if (x >= 11 && x <= 14)
            rub = x;
        else
            rub = (int) i % 10;

        return switch (rub) {
            case 1 -> " рубль";
            case 2, 3, 4 -> " рубля";
            default -> " рублей";
        };
    }
}
// я додумывался как это сделать дольше, чем писал всю остальную программу)



