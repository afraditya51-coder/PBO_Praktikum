package tugas_praktikum_6;

public class _9ArrayAge {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        // Perulangan 1: for biasa
        System.out.println("Menggunakan for:");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }

        // Perulangan 2: for-each (enhanced for)
        System.out.println("\nMenggunakan for-each:");
        for (int nilai : age) {
            System.out.print(nilai + " ");
        }
        System.out.println(" ");
    }
}
