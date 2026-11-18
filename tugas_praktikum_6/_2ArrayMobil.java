package tugas_praktikum_6;

public class _2ArrayMobil {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        // "Suzuki" ada di indeks 1, ubah nilainya
        mobil[1] = "Toyota";

        System.out.println("Array setelah diubah (indeks 1 diganti):");
        for (int i = 0; i < mobil.length; i++) {
            System.out.print(mobil[i] + " ");
        }
        System.out.println(" ");
    }
}