package tugas_praktikum_4;

import java.util.Locale;
import java.util.Scanner;

public class _3HitungGaji {
    static String rp(double angka) {
        return "Rp" + String.format(Locale.forLanguageTag("id-ID"), "%,.0f", angka);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        _3HitungGaji gaji = new _3HitungGaji();
        gaji.jalankan(s);
    }

    public void jalankan(Scanner s) {

        System.out.print("NIK                 : ");
        String nik = s.nextLine();
        System.out.print("Nama                : ");
        String nama = s.nextLine();

        System.out.println("Kode Golongan:");
        System.out.println("  1 = Menikah");
        System.out.println("  2 = Belum menikah");
        System.out.println("  3 = Cerai");
        System.out.println("  4 = Menikah dan punya anak");
        System.out.print("Kode golongan (1-4) : ");
        int golongan = s.nextInt();
        System.out.print("Jumlah anak         : ");
        int jumlahAnak = s.nextInt();

        double gajiPokok;
        String status;
        switch (golongan) {
            case 1:
                gajiPokok = 1200000;
                status = "Menikah";
                break;
            case 2:
                gajiPokok = 1500000;
                status = "Belum menikah";
                break;
            case 3:
                gajiPokok = 1750000;
                status = "Cerai";
                break;
            case 4:
                gajiPokok = 2000000;
                status = "Menikah dan punya anak";
                break;
            default:
                System.out.println("Kode golongan tidak valid!");
                return;
        }

        // Tunjangan pasangan = 10% gaji pokok (hanya jika menikah)
        double tunjanganPasangan = 0;
        if (golongan == 1 || golongan == 4) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }

        // Tunjangan anak = 5% gaji pokok x jumlah anak
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;

        // Tunjangan = tunjangan pasangan + tunjangan anak
        double tunjangan = tunjanganPasangan + tunjanganAnak;

        // Gaji bersih = gaji pokok + tunjangan
        double gajiBersih = gajiPokok + tunjangan;

        System.out.println("\n--- Slip Gaji ---");
        System.out.println("NIK                : " + nik);
        System.out.println("Nama               : " + nama);
        System.out.println("Status             : " + status);
        System.out.println("Jumlah anak        : " + jumlahAnak);
        System.out.println("Gaji pokok         : " + rp(gajiPokok));
        System.out.println("Tunjangan pasangan : " + rp(tunjanganPasangan));
        System.out.println("Tunjangan anak     : " + rp(tunjanganAnak));
        System.out.println("Total tunjangan    : " + rp(tunjangan));
        System.out.println("Gaji bersih        : " + rp(gajiBersih));
    }
}
