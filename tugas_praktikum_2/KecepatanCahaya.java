public class KecepatanCahaya {
    public static void main(String[] args) {
        double jarakBulan = 384400;
        double jarakMatahari = 152100000;
        double kecepatanCahaya = 300000;
        
        double waktuBulan = jarakBulan / kecepatanCahaya;
        double waktuMatahari = jarakMatahari / kecepatanCahaya;
        
        System.out.println("Waktu Tempuh Bumi ke Bulan      : " + waktuBulan + " detik");
        System.out.println("Waktu Tempuh Bumi ke Matahari   : " + waktuMatahari + " detik (" + (waktuMatahari/60) + " menit)");
    }
}
