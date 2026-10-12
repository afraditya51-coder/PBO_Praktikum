public class OperasiMatematika {
    public static void main(String[] args) {
        int x = 22;
        int y = 33;
        
        int tambah = x+y;
        int kurang = x-y;
        int kali = x*y;
        double bagi = (double) x/y;
        
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Penjumlahan : " + x + " + " + y + " = " + tambah);
        System.out.println("Pengurangan : " + x + " - " + y + " = " + kurang);
        System.out.println("Perkalian : " + x + " * " + y + " = " + kali);
        System.out.println("Pembagian : " + x + " / " + y + " = " + bagi);
    }
}
