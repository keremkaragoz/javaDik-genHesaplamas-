import java.util.Scanner;

public class dik {
    public static void main(String[] args) {
        double a, b, c, x, cevre, alan;
        Scanner kenar = new Scanner(System.in);
        System.out.print("1.Dik Kenari Giriniz: ");
        a = kenar.nextDouble();
        System.out.print("2.Dik Kenari Giriniz: ");
        b = kenar.nextDouble();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenus kenar: " + c);

        x = (a + b + c)/2;
        cevre = 2 * x;
        System.out.println("Ucgenin cevresi: " + cevre);

        alan = (a * b)/2;
        System.out.println("ucgenin alani: " + alan);





    }


}
