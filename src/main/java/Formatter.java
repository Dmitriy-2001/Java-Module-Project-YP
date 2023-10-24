public class Formatter {
    public static String rubles (double i) {
        int rub;

     if((int) i % 100 >= 11 && (int) i % 100 <= 14)
        rub = (int) i % 100;
       else
        rub = (int) i % 10;

      return switch (rub) {
           case 1 -> " рубль";
           case 2, 3, 4 -> " рубля";
           default -> " рублей";};
        }
}
// я додумывался как это сделать дольше, чем писал всю остальную программу)



