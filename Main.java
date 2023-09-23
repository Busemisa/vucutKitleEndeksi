import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //boy,kilo,sonuc değişkenlerini tanımladık
        double boy,kilo,sonuc;

        Scanner input =new Scanner(System.in);

        System.out.println("VÜCUT KİTLE İNDEKSİ HESAPLAMAYA HOŞGELDNİZ");
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz :");
        boy=input.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz :");
        kilo=input.nextDouble();

        sonuc=kilo/(boy*boy);

        System.out.println("VÜCUT KİTLE İNDEKSİNİZ: " + sonuc);


        //if ve else sorguları ile hastanın kitle endeksinin durumunu bulmuş ve kullanıcıya aktarmış olduk
        if (sonuc < 18.5) {
            System.out.println("ZAYIFSINIZ");
        } else if (sonuc >= 18.5 && sonuc <= 24.9) {
            System.out.println("NORMALSİNİZ");
        } else if (sonuc >= 25.0 && sonuc <= 29.9) {
            System.out.println("KİLOLUSUNUZ");
        } else if (sonuc >= 30.0) {
            System.out.println("1. DERECE OBEZSİNİZ");
        }





    }
}
