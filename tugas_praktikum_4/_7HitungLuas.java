package tugas_praktikum_4;

import java.util.Scanner;

public class _7HitungLuas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        _7HitungLuas luas = new _7HitungLuas();
        luas.jalankan(s);
    }

    // Dipanggil dari Main dengan Scanner yang sama
    public void jalankan(Scanner s) {

        System.out.println("=== Luas Bangun Datar ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu (1-5): ");
        int pilih = s.nextInt();

        switch (pilih) {
            case 1: {
                System.out.print("Sisi: ");
                double sisi = s.nextDouble();
                System.out.println("Luas persegi = " + (sisi * sisi));
                break;
            }
            case 2: {
                System.out.print("Alas  : ");
                double alas = s.nextDouble();
                System.out.print("Tinggi: ");
                double tinggi = s.nextDouble();
                System.out.println("Luas segitiga = " + (0.5 * alas * tinggi));
                break;
            }
            case 3: {
                System.out.print("Jari-jari: ");
                double r = s.nextDouble();
                System.out.println("Luas lingkaran = " + (Math.PI * r * r));
                break;
            }
            case 4: {
                System.out.print("Sisi sejajar a: ");
                double a = s.nextDouble();
                System.out.print("Sisi sejajar b: ");
                double b = s.nextDouble();
                System.out.print("Tinggi        : ");
                double t = s.nextDouble();
                System.out.println("Luas trapesium = " + (0.5 * (a + b) * t));
                break;
            }
            case 5: {
                System.out.print("Diagonal 1: ");
                double d1 = s.nextDouble();
                System.out.print("Diagonal 2: ");
                double d2 = s.nextDouble();
                System.out.println("Luas layang-layang = " + (0.5 * d1 * d2));
                break;
            }
            default:
                System.out.println("Menu tidak valid!");
        }
    }
}
