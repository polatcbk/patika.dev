import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double pi=3.14, r, a;
        Scanner daire = new Scanner(System.in);

        System.out.print("Yarı Çapını Giriniz (r): ");
        r = daire.nextDouble();

        System.out.print("Merkez Açısını Giriniz (a): ");
        a = daire.nextDouble();

        double formul= (pi*(r*r)*a)/360;
        System.out.print("Daire Diliminin Alanı: " +formul);
    }
}