package tugas_praktikum_6;

import java.util.Scanner;

public class _5ArrayMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Jumlah baris   : ");
        int baris = in.nextInt();
        System.out.print("Jumlah kolom   : ");
        int kolom = in.nextInt();

        int[][] a = new int[baris][kolom];
        int[][] b = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("\nMatriks A:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                a[i][j] = in.nextInt();
            }

        System.out.println("\nMatriks B:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                b[i][j] = in.nextInt();
            }

        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                hasil[i][j] = a[i][j] + b[i][j];

        System.out.println("\nHasil penjumlahan A + B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++)
                System.out.print(hasil[i][j] + "\t");
            System.out.println();
        }
    }
}
