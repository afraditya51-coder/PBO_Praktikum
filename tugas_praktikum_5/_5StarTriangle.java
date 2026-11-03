package tugas_praktikum_5;

public class _5StarTriangle {
    public static void main(String[] args) {
        int n = 5;
 
        System.out.println("Half Triangle");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int b = 1; b <= 2 * i - 1; b++) System.out.print("*");
            System.out.println();
        }
 
        System.out.println();
        System.out.println("Full Triangle");
        
        for (int i = 1; i <= 3; i++) {
            for (int s = 1; s <= 3 - i; s++) System.out.print(" ");
            for (int b = 1; b <= 2 * i - 1; b++) System.out.print("*");
            System.out.println();
        }
        
        for (int i = 2; i >= 1; i--) {
            for (int s = 1; s <= 3 - i; s++) System.out.print(" ");
            for (int b = 1; b <= 2 * i - 1; b++) System.out.print("*");
            System.out.println();
        }
    }
}
