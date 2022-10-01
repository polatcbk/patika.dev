import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double kg, boy;

        Scanner indeks = new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz (m): ");
        boy = indeks.nextDouble();

        System.out.print("Kilonuzu Giriniz (kg): ");
        kg = indeks.nextDouble();

        double sonuc= kg/(boy*boy);

        System.out.print("Vücut Kitle İndeksiniz: " +sonuc);

    }
}