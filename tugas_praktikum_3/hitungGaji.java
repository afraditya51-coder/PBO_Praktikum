package tugas_praktikum_3;

import java.util.Scanner;

public class hitungGaji {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Nomor Induk Karyawan : ");
        String nik = in.nextLine();
        
        System.out.println("Nama Karyawan : ");
        String nama = in.nextLine();
        
        System.out.println("Alamat : ");
        String alamat = in.nextLine();
        
        String jabatan = "Manajer";
        
        double p1 = 2000000;
        double p2 = 3000000;
        double p3 = 200000;
        double p4 = 150000;
        
        double totalGaji = p1+p2+p3+p4;
        double pajak = 0.10*(p1+p2+p4);
        double gajiBersih = totalGaji-pajak;
        
        System.out.println("\n===== SLIP GAJI =====");
        System.out.println("Nomor Induk Karyawan    : " + nik);
        System.out.println("Nama Karyawan           : " + nama);
        System.out.println("Alamat                  : " + alamat);
        System.out.println("Jabatan                 : " + jabatan);
        System.out.println("Gaji Pokok              : " + p1);
        System.out.println("Tunjangan Jabatan       : " + p2);
        System.out.println("Tunjangan Istri         : " + p3);
        System.out.println("Tunjangan Anak          : " + p4);
        System.out.println("Total Gaji              : " + totalGaji);
        System.out.println("Pajak Penghasilan       : " + pajak);
        System.out.println("Gaji Bersih             : " + gajiBersih);
        
        
        
    }
    
}
