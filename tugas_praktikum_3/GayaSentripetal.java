package tugas_praktikum_3;

import java.util.Scanner;

public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Massa benda m(kg)       : ");
        double m = in.nextDouble();
        System.out.println("Kecepatan v(m/s)        : ");
        double v = in.nextDouble();
        System.out.println("Jari-jari lintasan r(m) : ");
        double r = in.nextDouble();
        
        double fc = (m*v*v)/r;
        
        System.out.println("Gaya Sentripantal (Fc) : " + fc + "N");
    }
}
