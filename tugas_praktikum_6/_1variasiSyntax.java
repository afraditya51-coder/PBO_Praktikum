package tugas_praktikum_6;

public class _1variasiSyntax {
    public static void main(String[] args) {
        // Variasi 1: deklarasi lalu alokasi memori
        int[] a;
        a = new int[3];

        // Variasi 2: deklarasi + alokasi sekaligus
        int[] b = new int[3];

        // Variasi 3: deklarasi + inisialisasi nilai langsung
        int[] c = {10, 20, 30};

        // Variasi tambahan: tanda [] setelah nama variabel
        int d[] = new int[]{1, 2, 3};

        System.out.println("Panjang a = " + a.length);
        System.out.println("Panjang b = " + b.length);
        System.out.println("Panjang c = " + c.length);
        System.out.println("Panjang d = " + d.length);
    }
}