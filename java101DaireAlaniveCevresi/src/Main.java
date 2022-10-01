import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double pi=3.14, r;
        Scanner scan = new Scanner(System.in);
        System.out.print("r Verisini Giriniz: ");
        r = scan.nextDouble();

        double alan= pi*r*r;
        double cevre= 2*pi*r;

        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }
}