package tugas_praktikum_6;

public class _10ArrayList {
    public static void main(String[] args) {
        // Tipe data berbeda-beda -> gunakan array Object
        Object[] data = {19, 0.2, 'C', "Java", true};

        for (int i = 0; i < data.length; i++) {
            System.out.println("data[" + i + "] = " + data[i]
                    + "  (" + data[i].getClass().getSimpleName() + ")");
        }
    }
}
