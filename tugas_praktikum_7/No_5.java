package tugas_praktikum_7;

import java.util.Scanner;

public class No_5 {
    
    static long faktorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * faktorial(n-1);
    }
    
    static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Bilangan Bulat non-negatif    : ");
        int n = input.nextInt();
        
        System.out.println(n + "! = " + faktorial(n));
        
        System.out.print("Deret Fibonacci " + n + " suku pertama: ");
        for (int i=0; i<n; i++){
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}
