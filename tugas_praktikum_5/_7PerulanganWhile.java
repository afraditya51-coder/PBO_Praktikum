package tugas_praktikum_5;

public class _7PerulanganWhile {
     public static void main(String[] args) {
        System.out.println("While dengan i++ (post-increment):");
        int i = 0;
        while (i++ < 5) {
            System.out.print(i + " ");
        }
        System.out.println("\nNilai akhir i = " + i);
 
        System.out.println("\nWhile dengan ++i (pre-increment):");
        int j = 0;
        while (++j < 5) {
            System.out.print(j + " ");
        }
        System.out.println("\nNilai akhir j = " + j);
 
        System.out.println("\nKesimpulan:");
        System.out.println("i++ : nilai i dipakai dulu (dibandingkan), baru ditambah 1.");
        System.out.println("++i : nilai i ditambah 1 dulu, baru dipakai (dibandingkan).");
    }
}
