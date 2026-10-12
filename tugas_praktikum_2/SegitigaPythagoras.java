public class SegitigaPythagoras {
    public static void main(String[] args) {
        double a = 6;
        double b = 8;
        
        double c = Math.sqrt((a*a) + (b*b));
        
        double keliling = a+b+c;
        
        System.out.println("a = " + a + " , b = " + b);
        System.out.println("Sisi Miring c = " + c);
        System.out.println("Keliling Segitiga = " + keliling);
    }
}
