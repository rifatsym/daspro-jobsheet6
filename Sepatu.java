import java.util.Scanner;

public class Sepatu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan merk sepatu (Converse, Sketcher, Nike): ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan kategori sepatu (Slip-on, High Top, Woman, Man, Kids, Adult): ");
        String kategori = scanner.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        int ukuran = scanner.nextInt();

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("slip-on")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    System.out.println("Harga: 800.000");
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    System.out.println("Harga: 1.200.000");
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    System.out.println("Harga: 1.000.000");
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    System.out.println("Harga: 1.800.000");
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    System.out.println("Harga: 750.000");
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    System.out.println("Harga: 1.500.000");
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
        } else {
            System.out.println("Merk tidak ditemukan");
        }
    }
}
