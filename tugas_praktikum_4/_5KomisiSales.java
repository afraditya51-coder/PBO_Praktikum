package tugas_praktikum_4;

import java.util.Locale;
import java.util.Scanner;

public class _5KomisiSales {
    static String rp(double angka) {
        return "Rp" + String.format(Locale.forLanguageTag("id-ID"), "%,.0f", angka);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        _5KomisiSales soal = new _5KomisiSales();
        soal.jalankan(s);
    }

    // Dipanggil dari Main dengan Scanner yang sama
    public void jalankan(Scanner s) {

        System.out.print("Total penjualan hari ini (Rp): ");
        double penjualan = s.nextDouble();

        double uangJasa;
        double persenKomisi;

        if (penjualan <= 2000000) {
            uangJasa = 100000;
            persenKomisi = 0.10;
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            persenKomisi = 0.15;
        } else {
            uangJasa = 300000;
            persenKomisi = 0.20;
        }

        double komisi = persenKomisi * penjualan;
        double pendapatan = uangJasa + komisi;

        System.out.println("Uang jasa  : " + rp(uangJasa));
        System.out.println("Komisi     : " + rp(komisi) + " (" + (int) (persenKomisi * 100) + "%)");
        System.out.println("Pendapatan : " + rp(pendapatan));
    }
}
