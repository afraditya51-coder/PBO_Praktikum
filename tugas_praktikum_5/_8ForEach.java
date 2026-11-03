package tugas_praktikum_5;

public class _8ForEach {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
        String[] motor = {"BEaT", "Mio", "Scoopy"};
 
        System.out.println("Isi array angka:");
        for (int a : angka) {
            System.out.println(a);
        }
 
        System.out.println("\nIsi array motor:");
        for (String b : motor) {
            System.out.println(b);
        }
    }
}
