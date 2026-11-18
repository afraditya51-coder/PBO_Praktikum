package tugas_praktikum_6;

import java.util.Arrays;
import java.util.Scanner;

public class _3VariabelArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //a. Jumlah elemen
        System.out.print("Masukkan jumlah elemen array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        //b. Isi elemen
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + " : ");
            arr[i] = in.nextInt();
        }

        //c. Nilai terbesar & terkecil beserta indeksnya
        int max = arr[0], min = arr[0], idxMax = 0, idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) { max = arr[i]; idxMax = i; }
            if (arr[i] < min) { min = arr[i]; idxMin = i; }
        }
        System.out.println("\nNilai terbesar : " + max + " (indeks " + idxMax + ")");
        System.out.println("Nilai terkecil : " + min + " (indeks " + idxMin + ")");

        //d. Jumlah & rata-rata
        int total = 0;
        for (int v : arr) total += v;
        double rata = (double) total / n;
        System.out.println("Jumlah semua data : " + total);
        System.out.println("Rata-rata         : " + rata);

        //e. Jumlah elemen berindeks ganjil, f. berindeks genap
        int sumGanjil = 0, sumGenap = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) sumGanjil += arr[i];
            else sumGenap += arr[i];
        }
        System.out.println("Jumlah elemen indeks ganjil : " + sumGanjil);
        System.out.println("Jumlah elemen indeks genap  : " + sumGenap);

        //g. Cek hasil penjumlahan e dan f ganjil/genap
        System.out.println("Hasil jumlah indeks ganjil (" + sumGanjil + ") bernilai "
                + (sumGanjil % 2 == 0 ? "genap" : "ganjil"));
        System.out.println("Hasil jumlah indeks genap (" + sumGenap + ") bernilai "
                + (sumGenap % 2 == 0 ? "genap" : "ganjil"));

        //h. Urutkan (ascending)
        int[] urut = arr.clone();
        Arrays.sort(urut);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(urut));
    }
}

