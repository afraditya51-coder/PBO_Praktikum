package tugas_praktikum_6;

import java.util.Scanner;

// Thread anak
class ThreadAnak extends Thread {
    private final int nomor;

    ThreadAnak(int nomor) {
        this.nomor = nomor;
        setName("Thread-Anak-" + nomor);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " : langkah " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(getName() + " terganggu");
            }
        }
        System.out.println(getName() + " selesai");
    }
}

public class _8ArrayThread2 {
    public static void main(String[] args) throws InterruptedException {
        // Thread utama = thread yang menjalankan main()
        Thread utama = Thread.currentThread();
        utama.setName("Thread-Utama");

        Scanner in = new Scanner(System.in);
        System.out.print("Berapa thread anak yang diinginkan? ");
        int jumlah = in.nextInt();

        Thread[] anak = new Thread[jumlah];
        for (int i = 0; i < jumlah; i++) {
            anak[i] = new ThreadAnak(i + 1);
            anak[i].start();
        }

        System.out.println(utama.getName() + " : membuat " + jumlah + " thread anak");

        // Tunggu semua thread anak selesai
        for (Thread t : anak) t.join();

        System.out.println(utama.getName() + " : semua thread anak selesai");
    }
}
