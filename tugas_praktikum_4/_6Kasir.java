package tugas_praktikum_4;

import java.util.Locale;
import java.util.Scanner;

public class _6Kasir {
    static String rp(double angka) {
        return "Rp" + String.format(Locale.forLanguageTag("id-ID"), "%,.0f", angka);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        _6Kasir kasir = new _6Kasir();
        kasir.jalankan(s);
    }

    // Dipanggil dari Main dengan Scanner yang sama
    public void jalankan(Scanner s) {

        System.out.print("Apakah memiliki kartu member? (y/t): ");
        String jawab = s.nextLine();
        boolean member = jawab.equalsIgnoreCase("y");

        System.out.print("Total belanja (Rp)      : ");
        double totalBelanja = s.nextDouble();
        System.out.print("Uang yang diberikan (Rp): ");
        double uangDiberikan = s.nextDouble();

        double diskon = 0;
        if (member) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        double totalBayar = totalBelanja - diskon;

        System.out.println("\n--- Struk ---");
        System.out.println("Total belanja : " + rp(totalBelanja));
        System.out.println("Diskon        : " + rp(diskon));
        System.out.println("Harus dibayar : " + rp(totalBayar));
        System.out.println("Uang diberikan: " + rp(uangDiberikan));

        if (uangDiberikan >= totalBayar) {
            System.out.println("Kembalian     : " + rp(uangDiberikan - totalBayar));
        } else {
            System.out.println("Uang kurang   : " + rp(totalBayar - uangDiberikan));
        }
    }
}
