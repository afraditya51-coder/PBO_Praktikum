package tugas_praktikum_7;

class SumpahPemuda{
    SumpahPemuda(){
        System.out.println("SUMPAH PEMUDA");
        System.out.println("Kami Putra dan Putri Indonesia");
    }
    
    void tampil(){
        System.out.println("1. Mengaku bertumpah darah yang satu, Tanah Air Indonesia.");
        System.out.println("2. Mengaku berbangsa yang satu, Bangsa Indonesia.");
        System.out.println("3. Menjunjung bahasa persatuan, Bahasa Indonesia.");
    }
}

public class No_4 {
    public static void main(String[] args) {
        SumpahPemuda sp = new SumpahPemuda();
        sp.tampil();
    }
}
