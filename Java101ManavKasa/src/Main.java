import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double kg1,kg2,kg3,kg4,kg5, total , armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00;

        Scanner manav= new Scanner(System.in);

        System.out.print("Armut Kaç KG? ");
        kg1 = manav.nextDouble();

        System.out.print("Elma Kaç KG? ");
        kg2 = manav.nextDouble();

        System.out.print("Domates Kaç KG? ");
        kg3 = manav.nextDouble();

        System.out.print("Muz Kaç KG? ");
        kg4= manav.nextDouble();

        System.out.print("Patlıcan Kaç KG? ");
        kg5= manav.nextDouble();

        total= (kg1*armut)+(kg2*elma)+(kg3*domates)+(kg4*muz)+(kg5*patlican);

        System.out.print("Toplam Tutar" + total);

    }
}