import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double kacKm, opening=10, min=20,km=2.20;

        Scanner scan = new Scanner(System.in);
        System.out.print("Gidilen KM: ");
        kacKm = scan.nextDouble();

        double tutar = (kacKm*km)+opening;
        double mintutar= (tutar<min)? min:tutar;

        System.out.println("Borcunuz:" +mintutar);
    }
}