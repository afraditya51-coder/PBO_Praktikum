package tugas_praktikum_4;

import java.util.Scanner;

public class _1GanjilGenap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        _1GanjilGenap pilihan = new _1GanjilGenap();
        pilihan.jalankan(s);
    }

    // Dipanggil dari Main dengan Scanner yang sama
    public void jalankan(Scanner s) {

        System.out.print("Masukkan bilangan: ");
        int bilangan = s.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan GENAP");
        } else {
            System.out.println(bilangan + " adalah bilangan GANJIL");
        }
    }
}
