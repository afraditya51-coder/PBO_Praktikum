package tugas_praktikum_7;

import java.util.Scanner;

public class No_3 {
    
    static int kali(int a, int b){
        return a*b;
    }
    
    static int tambah(int a, int b){
        return a+b;
    }
    
    static int kurang(int a, int b){
        return a-b;
    }
    
    static int tebak(int bulan, int tanggal){
        int hasil = kali(bulan, 2);
        hasil = tambah(hasil, 5);
        hasil = kali(hasil, 50);
        hasil = tambah(hasil, tanggal);
        hasil = kurang(hasil, 250);
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Bulna Lahir (1-12)    : ");
        int bulan = input.nextInt();
        System.out.print("Masukan Tanggal Lahir (1-31)  : ");
        int tanggal = input.nextInt();
        
        int hasil = tebak(bulan, tanggal);
        System.out.println("Hasil Akhir : " + hasil);
        System.out.println("Yaitu Bulan " + (hasil/100) + " Tanggal " + (hasil%100));
        
    }
}
