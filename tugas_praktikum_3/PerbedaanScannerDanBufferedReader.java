package tugas_praktikum_3;
import java.io.*;
import java.util.Scanner;

public class PerbedaanScannerDanBufferedReader {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Menggunakan Scanner ===");
        System.out.print("Masukkan nama  : ");
        String nama1 = sc.nextLine();
        System.out.print("Masukkan umur  : ");
        int umur1 = sc.nextInt();   
        System.out.println("Nama    :  " + nama1);
        System.out.println("Umur    :  " + umur1);
 
        // ---- Dengan BufferedReader ----
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n=== Menggunakan BufferedReader ===");
        System.out.print("Masukkan nama  : ");
        String nama2 = br.readLine();
        System.out.print("Masukkan umur  : ");
        int umur2 = Integer.parseInt(br.readLine()); 
        System.out.println("Nama    : " + nama2);
        System.out.println("Umur    : " + umur2);
    }
}
