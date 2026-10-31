package tugas_praktikum_4;

import java.util.Scanner;

public class _4TahunKabisat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        _4TahunKabisat soal = new _4TahunKabisat();
        soal.jalankan(s);
    }

    // Dipanggil dari Main dengan Scanner yang sama
    public void jalankan(Scanner s) {

        System.out.print("Masukkan tahun: ");
        int tahun = s.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            System.out.println(tahun + " adalah tahun KABISAT");
        } else {
            System.out.println(tahun + " BUKAN tahun kabisat");
        }
    }
}
