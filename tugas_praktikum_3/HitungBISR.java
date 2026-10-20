package tugas_praktikum_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitungBISR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Jumlah mangga dibeli          : ");
        int mangga = Integer.parseInt(br.readLine());
        System.out.println("Jumlah tetangga               : ");
        int tetangga = Integer.parseInt(br.readLine());
        System.out.println("Jambu per tetangga            : ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());
        System.out.println("Mangga busuk (dikembalikan)   : ");
        int busuk = Integer.parseInt(br.readLine());

        int jambu = tetangga * jambuPerTetangga;
        int manggaBagus = mangga - busuk;
        int totalAwal = mangga + jambu;
        int totalAkhir = manggaBagus + jambu;

        System.out.println("\n===== HASIL =====");
        System.out.println("Mangga dibeli          : " + mangga);
        System.out.println("Jambu dibeli           : " + jambu);
        System.out.println("Total buah awal        : " + totalAwal);
        System.out.println("Mangga dikembalikan    : " + busuk);
        System.out.println("Mangga yang tersisa    : " + manggaBagus);
        System.out.println("Total buah akhir       : " + totalAkhir + " pcs");
    }
}
