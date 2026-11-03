package tugas_praktikum_5;

import java.util.Scanner;

public class _1Perulangan10nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terbesar = 0, terkecil = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            int n = input.nextInt();
            if (i == 1) {
                terbesar = n;
                terkecil = n;
            } else {
                if (n > terbesar) terbesar = n;
                if (n < terkecil) terkecil = n;
            }
        }
        System.out.println("Bilangan terbesar : " + terbesar);
        System.out.println("Bilangan terkecil : " + terkecil);
    }
}
