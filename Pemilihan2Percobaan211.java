import java.util.Scanner;
public class Pemilihan2Percobaan211 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        int pilihanMenu;
        String member;
        double diskon = 0.0, harga = 0.0, totalBayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU CAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");
        System.out.print("Silahkan masukkan angka untuk menu yang dipilih: ");
        pilihanMenu = input11.nextInt();
        input11.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input11.nextLine();
        System.out.println("-------------------------");

        
    if (member.equalsIgnoreCase("y")) { //menggunakan equalsIgnoreCase untuk membandingkan string
        diskon = 0.10;
        System.out.println("Besar diskon = 10%");
        if (pilihanMenu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = " + harga);

        } else if (pilihanMenu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);
        
        } else if (pilihanMenu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);
        
        } else {
            System.out.println("Masukkan pilihan menu dengan benar"); 
            return; // menghentikan eksekusi lebih lanjut jika pilihan salah
        }
        totalBayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + totalBayar);
        }    
        


        else if (member.equalsIgnoreCase("n")) { //menggunakan equalsIgnoreCase untuk membandingkan string
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // menghitung total bayar
            System.out.println("Total Bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }    
        System.out.println("--------------------------------");

    }
}
