public class KonversiSuhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;
        
        System.out.println("a. Celcius & Fahrenheit");
        System.out.println(C + " C = " + ((C*9/5) + 32) + " F");
        System.out.println(F + " F = " + ((F-32) * 5/9) + " C");
        
        System.out.println("\nb. Celcius & Reamur");
        System.out.println(C + " C = " + (C*4/5) + " R");
        System.out.println(R + " R = " + (R*5/4) + " C");
        
        System.out.println("\nc. Fahrenheit & Reamur");
        System.out.println(F + " F = " + ((F-32)*4/9) + " R");
        System.out.println(R + " R = " + ((R*4/9)+32) + " F");
    }
}
