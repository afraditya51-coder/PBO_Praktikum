package tugas_praktikum_7;

class Mobil {
    String merk;
    String warna;
    int kecepatan;

    Mobil(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
        this.kecepatan = 0;
    }

    void tambahKecepatan(int tambah) {
        kecepatan += tambah;
    }

    void tampilkanInfo() {
        System.out.println("Merk      : " + merk);
        System.out.println("Warna     : " + warna);
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
        System.out.println();
    }
}

public class No_1 {
    public static void main(String[] args) {
        Mobil m1 = new Mobil("Lancer Evo", "Merah");
        Mobil m2 = new Mobil("Civic", "Hitam");

        m1.tambahKecepatan(60);
        m2.tambahKecepatan(80);

        m1.tampilkanInfo();
        m2.tampilkanInfo();
    }
}
