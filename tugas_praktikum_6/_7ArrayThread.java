package tugas_praktikum_6;

// Kelas baru pewaris Thread
class ThreadBaru extends Thread {
    // Titik entri thread baru
    @Override
    public void run() {
        System.out.println("Thread berjalan: " + getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " -> hitungan " + i);
        }
    }
}

public class _7ArrayThread {
    public static void main(String[] args) {
        ThreadBaru t = new ThreadBaru(); // buat objek
        t.start();                       // mulai eksekusi (memanggil run())
    }
}
