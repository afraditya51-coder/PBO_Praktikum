package tugas_praktikum_5;

import java.util.Scanner;

public class _4AngkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka : ");
        int banyak = input.nextInt();
        int ganjil = 1, total = 0;
        for (int i = 1; i <= banyak; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }
        System.out.println();
        System.out.println("Total penjumlahan : " + total);
    }
}
