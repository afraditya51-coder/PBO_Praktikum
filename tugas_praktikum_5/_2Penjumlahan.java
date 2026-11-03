package tugas_praktikum_5;

import java.util.Scanner;

public class _2Penjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan : ");
        int jumlahData = input.nextInt();
        double total = 0;
        for (int i = 1; i <= jumlahData; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            total += input.nextDouble();
        }
        if (jumlahData > 0) {
            System.out.println("Total     : " + total);
            System.out.println("Rata-rata : " + (total / jumlahData));
        } else {
            System.out.println("Jumlah bilangan harus lebih dari 0.");
        }
    }
}
