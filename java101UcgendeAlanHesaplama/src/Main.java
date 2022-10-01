import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a,b,c;
        double cevreS, alan;
        Scanner scan = new Scanner(System.in);
        System.out.print("A Kenar Uzunluğunu Giriniz: ");
        a = scan.nextInt();
        System.out.print("B Kenarının Uzunluğunu Giriniz: ");
        b = scan.nextInt();
        System.out.print("C Kenarının Uzunluğunu Giriiz: ");
        c = scan.nextInt();

        cevreS = (a+b+c)/2;
        alan = Math.sqrt(cevreS * (cevreS-a) * (cevreS-b) * (cevreS-c));

        System.out.println("Çevresi: " + cevreS + "  Birim");
        System.out.println("Alanı: " + alan + "  Birim Kare");
    }
}