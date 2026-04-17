import java.util.Scanner;

public class PemesananMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih (1.Pesan / 2.Selesai): ");
        int pilih = input.nextInt();
        input.nextLine();

        if (pilih == 1) {
            System.out.print("Masukkan Nama Pemesan: ");
            String nama = input.nextLine();

            System.out.print("Pilih Menu (1.Nasi Goreng / 2.Mie Ayam / 3.Sate / 4.Bakso) [default 1]: ");
            String pilihanMenu = input.nextLine();

            String makanan;

            switch (pilihanMenu) {
                case "2":
                    makanan = "Mie Ayam";
                    break;
                case "3":
                    makanan = "Sate";
                    break;
                case "4":
                    makanan = "Bakso";
                    break;
                default:
                    makanan = "Nasi Goreng"; // default
            }

            System.out.println("\n=== Detail Pesanan ===");
            System.out.println("Nama     : " + nama);
            System.out.println("Pesanan  : " + makanan);

        } else {
            System.out.println("Terima kasih, selesai.");
        }

        input.close();
    }
}