import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double tutar, kdv, kdv8 , toplam, toplamTutar , toplam8 , kdv1 , kdvOran1 ,   kdvOran=0.18, kdvOran8=0.08;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Tutarını Giriniz : ");
        tutar = input.nextDouble();

        kdv = tutar*kdvOran;
        kdv8 = tutar*kdvOran8;
        toplam = kdv+tutar;
        toplam8 = kdv8+tutar;

        kdv1 = (tutar<1000)? kdvOran:kdvOran8;
        kdvOran1 = (tutar<1000)? kdv:kdv8;
        toplamTutar = (tutar<1000)? toplam:toplam8;


        System.out.println("KDV Oranı : " +kdv1);
        System.out.println("KDV Tutarınız : " +kdvOran1);
        System.out.println("KDV'li Toplam Tutar : " +toplamTutar);

    }
}