package tugas_praktikum_7;

import java.util.Scanner;

public class No_2 {

    // Method hitung keliling persegi panjang
    static double hitungKel(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang : ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar   : ");
        double lebar = input.nextDouble();

        double keliling = hitungKel(panjang, lebar);
        System.out.println("Keliling persegi panjang = " + keliling);

        input.close();
    }
}
