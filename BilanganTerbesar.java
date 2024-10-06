import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // Input tiga bilangan
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = scanner.nextInt();
        
        // Inisialisasi max dengan bilangan pertama
        int max = bil1;
        
        // Bandingkan dengan bilangan kedua
        if (bil2 > max) {
            max = bil2;
        }
        
        // Bandingkan dengan bilangan ketiga
        if (bil3 > max) {
            max = bil3;
        }
        
        // Cetak bilangan terbesar
        System.out.println("Bilangan terbesar adalah: " + max);
    }
}
