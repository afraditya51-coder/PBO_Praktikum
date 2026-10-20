package tugas_praktikum_3;

import java.util.Scanner;

public class MesinCetak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Banyak novel yang dicetak      : ");
        long novel = in.nextLong();
        System.out.print("Tebal per novel (lembar)       : ");
        long tebal = in.nextLong();

        long kecepatan = 1;                       // 1 lembar/detik
        long totalLembar = novel * tebal;
        long totalDetik = totalLembar / kecepatan;

        long hari = totalDetik / 86400;
        long sisa = totalDetik % 86400;
        long jam = sisa / 3600;
        sisa = sisa % 3600;
        long menit = sisa / 60;
        long detik = sisa % 60;

        System.out.println("\nTotal lembar : " + totalLembar);
        System.out.println("Waktu yang diperlukan:");
        System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}
