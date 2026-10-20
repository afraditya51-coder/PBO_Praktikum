package tugas_praktikum_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream {
    public static void main(String[] args) throws IOException {
        DataInputStream din = new DataInputStream(System.in);
        
        System.out.print("Nama              : ");
        String nama = din.readLine();
        System.out.print("Total Belanja   : ");
        double belanja = Double.parseDouble(din.readLine());
        System.out.print("Diskon          : ");
        double diskon = Double.parseDouble(din.readLine());
        
        double total = belanja - (belanja*diskon/100);
        
        System.out.print("Bayar         : ");
        double bayar = Double.parseDouble(din.readLine());
        double kembalian = bayar - total;
        
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("Struk.dat"));
        dout.writeUTF(nama);
        dout.writeDouble(belanja);
        dout.writeDouble(diskon);
        dout.writeDouble(total);
        dout.writeDouble(bayar);
        dout.writeDouble(kembalian);
        dout.close();
        
        DataInputStream fin = new DataInputStream(new FileInputStream("struk.dat"));
        String n = fin.readUTF();
        double b = fin.readDouble();
        double d = fin.readDouble();
        double t = fin.readDouble();
        double by = fin.readDouble();
        double k = fin.readDouble();
        fin.close();
 
        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Nama          : " + n);
        System.out.printf("Total Belanja : %.0f%n", b);
        System.out.printf("Diskon (%%)    : %.0f%n", d);
        System.out.printf("Total         : %.0f%n", t);
        System.out.printf("Bayar         : %.0f%n", by);
        System.out.printf("Kembalian     : %.0f%n", k);
        
        
    }
}
