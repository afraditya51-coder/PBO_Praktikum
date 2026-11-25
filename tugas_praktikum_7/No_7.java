package tugas_praktikum_7;

import java.util.Scanner;

class DataMahasiswa{
    private String nama;
    private String npm;
    private String kelas;
    
    void SetData(String nama, String npm, String kelas){
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
    
    void tampil(){
        System.out.println("Nama    : " + this.nama);
        System.out.println("NPM     : " + this.npm);
        System.out.println("Kelas   : " + this.kelas);
    }
}

public class No_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukan NPM : ");
        String npm = input.nextLine();
        System.out.print("Masukan Kelas : ");
        String kelas = input.nextLine();
        
        DataMahasiswa mhs = new DataMahasiswa();
        mhs.SetData(nama, npm, kelas);
        
        System.out.println("");
        System.out.println("------- DATA MAHASISWA -------");
        mhs.tampil();
    }
}
