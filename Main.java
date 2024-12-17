import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan pilihan menu:");
        System.out.println("1. Tampilkan Pesan Selamat Datang");
        System.out.println("2. Tampilkan Pesan Terima Kasih");
        System.out.println("3. Keluar");
        System.out.print("Pilihan Anda: ");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Selamat datang di program switch case");
                break;
            case 2:
                System.out.println("Terima kasih telah menggunakan program switch case");
                break;
            case 3:
                System.out.println("Program switch case berakhir.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
