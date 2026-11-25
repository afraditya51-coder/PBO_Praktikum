package tugas_praktikum_7;

class Civitas {
    protected String nama;
    protected String status;
    
    Civitas(String nama, String status){
        this.nama = nama;
        this.status = status;
    }
    
    void tampil(){
        System.out.println("Nama    : " + nama);
        System.out.println("Status  : " + status + " Fakultas Teknik");
    }
}

class Dosen extends Civitas{
    Dosen(String nama){
        super(nama, "Dosen");
    }
}

class Mahasiswa extends Civitas{
    Mahasiswa(String nama){
        super(nama, "Mahasiswa");
    }
}

class Staff extends Civitas{
    Staff(String nama){
        super(nama, "Staff");
    }
}

public class No_6 {
    public static void main(String[] args) {
        Civitas[] daftar = {
            new Dosen("Diding Coding"),
            new Mahasiswa("Oliper Saik"),
            new Staff("Junot Kibot")
        };
        
        for (Civitas c : daftar){
            c.tampil();
        }
    }
}
