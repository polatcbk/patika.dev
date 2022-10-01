import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("A Kenar Uzunluğunu giriniz : ");
        a = input.nextDouble();
        System.out.print("B kenar Uzunluğunu Giriniz : ");
        b = input.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.print("Hipotenüs : " + c );
    }
}