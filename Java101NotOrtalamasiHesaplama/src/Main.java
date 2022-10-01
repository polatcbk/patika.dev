import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int beden, biyo, cog, din, fzk, muzik, kimya, mat, tarih, turkce, ing;

        //Scanner sınıfı tanımladık
        Scanner inp = new Scanner(System.in);

        //Etkileşim kurma
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = inp.nextInt();

        System.out.print("İngilizce Notunuzu Giriniz : ");
        ing = inp.nextInt();

        System.out.print("Beden Eğitimi Notunuzu Giriniz : ");
        beden = inp.nextInt();

        System.out.print("Biyoloji Notunuzu Giriniz : ");
        biyo = inp.nextInt();

        System.out.print("Coğrafya Notunuzu Giriniz : ");
        cog = inp.nextInt();

        System.out.print("Din Kültürü Notunuzu Giriniz : ");
        din = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fzk = inp.nextInt();

        System.out.print("Müzik Notunuzuı Giriniz : ");
        muzik = inp.nextInt();

        System.out.print("Kimya Notunuzu Gİriniz : ");
        kimya = inp.nextInt();

        int toplam = (mat + tarih + turkce + ing + beden + biyo + cog + din + fzk + muzik + kimya);
        double sonuc = (toplam / 11.0);

        String durum = sonuc>=60? "Sınıfı Geçti ":"Kaldı ";

        System.out.print("Ortalamanız : " + durum + sonuc);
    }
}