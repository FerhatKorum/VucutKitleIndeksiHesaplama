import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Vücut Kitle Indeksi Hesaplama.. " + "\n");


        //Scanner Sınıfından bir nesne Tanımlıyoruz , bu sayede kullancıdıan veri alabiliyoruz.
        Scanner inp = new Scanner(System.in);

        // degiskenler
        double kg, boy, hesapla;

        System.out.print("Lütfen Boyunuzu Giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kg = inp.nextDouble();

        // Formul
        hesapla = kg / (boy * boy);

        System.out.print("Vücut Kitle İndeksiniz : " + hesapla);
        System.out.println(" ");

        if (hesapla < 18) {
            System.out.print("Zayıfsın Kardeşşş!");
        } else if (hesapla > 18 && hesapla < 25) {
            System.out.print("Normalsin Bilader Ne Zayıfla Ne kilo Al!");
        } else if (hesapla > 26 && hesapla < 30) {
            System.out.print("Kardeşim boyuna göre kilon fazla git biraz spor yap hepimiz için iyi olcak.");
        } else {
            System.out.println("Kardeşim zayıflaamassan nanayy!");
        }

    }}

