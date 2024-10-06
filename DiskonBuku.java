import java.util.Scanner;

public class DiskonBuku {
    
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input jenis buku
        System.out.println("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = scanner.nextLine();

        // Meminta input jumlah buku
        System.out.println("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();

        // Deklarasi variabel untuk menyimpan diskon
        double diskon = 0;

        // Logika untuk menentukan diskon berdasarkan jenis dan jumlah buku
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10; // Diskon 10% untuk kamus
            if (jumlahBuku > 2) {
                diskon = 0.12; // Diskon 12% jika lebih dari 2 kamus
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07; // Diskon 7% untuk novel
            if (jumlahBuku > 3) {
                diskon = 0.09; // Diskon 9% jika lebih dari 3 novel
            } else {
                diskon = 0.08; // Diskon 8% jika jumlah novel <= 3
            }
        } else { // Buku lainnya
            if (jumlahBuku > 3) {
                diskon = 0.05; // Diskon 5% untuk buku lainnya jika jumlah > 3
            }
        }

        // Meminta input harga total
        System.out.println("Masukkan total harga buku: ");
        double totalHarga = scanner.nextDouble();

        // Menghitung total harga setelah diskon
        double hargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        // Menampilkan diskon dan total yang harus dibayar
        System.out.println("Diskon yang diterapkan: " + (diskon * 100) + "%");
        System.out.println("Total yang harus dibayar setelah diskon: Rp " + hargaSetelahDiskon);
    }
}
