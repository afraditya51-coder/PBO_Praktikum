package tugas_praktikum_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _6ArrayBilangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0;
        // Jumlah bilangan juga divalidasi
        while (true) {
            try {
                System.out.print("Masukkan jumlah bilangan: ");
                n = in.nextInt();
                if (n <= 0) {
                    System.out.println("Jumlah harus lebih dari 0!");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan: input harus berupa bilangan!");
                in.nextLine(); // bersihkan input salah
            }
        }

        double[] data = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Bilangan ke-" + (i + 1) + " : ");
                data[i] = in.nextDouble();
                total += data[i];
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan: input bukan bilangan, silakan ulangi!");
                in.nextLine();
                i--; // ulangi input yang sama
            }
        }

        System.out.println("Rata-rata = " + (total / n));
    }
}
