import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n|===============================|");
            System.out.println("| Pembelian Paket Data Telkomsel|");
            System.out.println("|===============================|\n");

            System.out.print("Masukan Nama Anda : ");
            String nama = input.nextLine();

            String nomor;
            String yOn;

            do {
                System.out.print("Masukan Nomer Telepon : ");
                nomor = input.nextLine();
                System.out.println("Apakah Benar Nomor Yang Kamu Masukan : " + nomor + " Y/N");
                yOn = input.nextLine();

                if (!yOn.equalsIgnoreCase("Y") && !yOn.equalsIgnoreCase("N")) {
                    System.out.println("Input tidak valid, silakan masukkan 'Y' atau 'N'.");
                }
            } while (!yOn.equalsIgnoreCase("Y"));

            double harga = 0;
            String kuota = "";
            String tipeKuota = "";
            double diskon = 0;

            System.out.println("\n|==================================|");
            System.out.println("|===Pilih Paket Yang Mau di Beli===|");
            System.out.println("|             1. Game Max          |");
            System.out.println("|           2. Sosial Media        |");
            System.out.println("|             3. Youtube           |");
            System.out.println("|==================================|\n");

            System.out.print("Masukan Pilihan Paket Yang Kamu Pilih : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    tipeKuota = "GameMax";
                    System.out.println("\n|============================================|");
                    System.out.println("|============= Game Max List Kuota ==========|");
                    System.out.println("|      1. Kuota Game Max : 1000 MB           |");
                    System.out.println("|      2. Kuota Game Max : 2000 MB           |");
                    System.out.println("|      3. Kuota Game Max : 3000 MB           |");
                    System.out.println("|============================================|\n");
                    System.out.print("Masukan Pilihan : ");
                    int pilihJumlah = input.nextInt();
                    input.nextLine();
                    switch (pilihJumlah) {
                        case 1:
                            System.out.println("Kuota Game Max : 1000 MB\nRp. 10.000");
                            System.out.print("Apakah Benar Ingin Membeli Y/N : ");
                            String bOn = input.nextLine();
                            if (bOn.equalsIgnoreCase("Y")) {
                                harga = 10000;
                                kuota = "1000 MB";
                            } else if (bOn.equalsIgnoreCase("N")) {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            } else {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            }
                            break;
                        case 2:
                            System.out.println("Kuota Game Max : 2000 MB \n Rp. 20.000");
                            System.out.print("Apakah Benar Ingin Membeli Y/N : ");
                            bOn = input.nextLine();
                            if (bOn.equalsIgnoreCase("Y")) {
                                harga = 20000;
                                kuota = "2000 MB";
                            } else if (bOn.equalsIgnoreCase("N")) {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            } else {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            }
                            break;
                        case 3:
                            System.out.println("Kuota Game Max : 3000 MB \n Rp. 30.000");
                            System.out.print("Apakah Benar Ingin Membeli Y/N : ");
                            bOn = input.nextLine();
                            if (bOn.equalsIgnoreCase("Y")) {
                                harga = 30000;
                                kuota = "3000 MB";
                            } else if (bOn.equalsIgnoreCase("N")) {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            } else {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            }
                            break;
                        default:
                            System.out.println("Input Yang Kamu Masukan Tidak Valid");
                    }
                    break;
                case 2:
                    tipeKuota = "SosialMedia";
                    System.out.println("\n|============================================|");
                    System.out.println("|======== Sosial Media List Kuota ===========|");
                    System.out.println("|      1. Kuota Media Sosial : 1 GB          |");
                    System.out.println("|      2. Kuota Media Sosial : 2 GB          |");
                    System.out.println("|      3. Kuota Media Sosial : 3 GB          |");
                    System.out.println("|============================================|\n");
                    System.out.print("Masukan Pilihan : ");
                    pilihJumlah = input.nextInt();
                    input.nextLine();
                    switch (pilihJumlah) {
                        case 1:
                            System.out.println("Kuota Media Sosial : 1 GB\nRp. 15.000");
                            System.out.print("Apakah Benar Ingin Membeli Y/N : ");
                            String bOn = input.nextLine();
                            if (bOn.equalsIgnoreCase("Y")) {
                                harga = 15000;
                                kuota = "1 GB";
                            } else if (bOn.equalsIgnoreCase("N")) {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            } else {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            }
                            break;
                        case 2:
                            System.out.println("Kuota Media Sosial : 2 GB\nRp. 20.000");
                            System.out.print("Apakah Benar Ingin Membeli Y/N : ");
                            bOn = input.nextLine();
                            if (bOn.equalsIgnoreCase("Y")) {
                                harga = 20000;
                                kuota = "2 GB";
                            } else if (bOn.equalsIgnoreCase("N")) {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            } else {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            }
                            break;
                        case 3:
                            System.out.println("Kuota Media Sosial : 3 GB\nRp. 30.000");
                            System.out.print("Apakah Benar Ingin Membeli Y/N : ");
                            bOn = input.nextLine();
                            if (bOn.equalsIgnoreCase("Y")) {
                                harga = 30000;
                                kuota = "2 GB";
                            } else if (bOn.equalsIgnoreCase("N")) {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            } else {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            }
                            break;
                        default:
                            System.out.println("Input Yang Kamu Masukan Tidak Valid");
                    }
                    break;
                case 3:
                    tipeKuota = "Youtube";
                    System.out.println("\n|============================================|");
                    System.out.println("|=========== Youtube List Kuota =============|");
                    System.out.println("|      1. Kuota Youtube : 10 GB              |");
                    System.out.println("|      2. Kuota Youtube : 20 GB              |");
                    System.out.println("|      3. Kuota Youtube : 30 GB              |");
                    System.out.println("|============================================|\n");
                    System.out.print("Masukan Pilihan : ");
                    pilihJumlah = input.nextInt();
                    input.nextLine();
                    switch (pilihJumlah) {
                        case 1:
                            System.out.println("Kuota Youtube : 10 GB\nRp. 12.000");
                            System.out.print("Apakah Benar Ingin Membeli Y/N : ");
                            String bOn = input.nextLine();
                            if (bOn.equalsIgnoreCase("Y")) {
                                harga = 12000;
                                kuota = "10 GB";
                            } else if (bOn.equalsIgnoreCase("N")) {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            } else {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            }
                            break;
                        case 2:
                            System.out.println("Kuota Youtube : 20 GB\nRp. 18.000");
                            System.out.print("Apakah Benar Ingin Membeli Y/N : ");
                            bOn = input.nextLine();
                            if (bOn.equalsIgnoreCase("Y")) {
                                harga = 18000;
                                kuota = "20 GB";
                            } else if (bOn.equalsIgnoreCase("N")) {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            } else {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            }
                            break;
                        case 3:
                            System.out.println("Kuota Youtube : 30 GB\nRp. 25.000");
                            System.out.print("Apakah Benar Ingin Membeli Y/N : ");
                            bOn = input.nextLine();
                            if (bOn.equalsIgnoreCase("Y")) {
                                harga = 25000;
                                kuota = "30 GB";
                            } else if (bOn.equalsIgnoreCase("N")) {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            } else {
                                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");
                            }
                            break;
                        default:
                            System.out.println("Input Yang Kamu Masukan Tidak Valid");
                    }
                    break;
                default:
                    System.out.println("Input Yang Kamu Masukan Tidak Valid");
            }

            if (harga >= 25000) {
                diskon = 0.30;
            } else if (harga >= 15000) {
                diskon = 0.20;
            } else if (harga >= 5000) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            double diskonHarga = harga * diskon;
            double totalHarga = harga - diskonHarga;

            if (harga != 0) {
                System.out.println("\n|=============================================|");
                System.out.println("|====== Detail Kuota Yang Telah Anda Beli ====|");
                System.out.println("|---------------------------------------------|");
                System.out.println("| Nama                : " + nama);
                System.out.println("| Nomor Telepon       : " + nomor);
                System.out.println("| Diskon              : Rp " + diskonHarga);
                System.out.println("| Total Harga         : Rp " + totalHarga);
                System.out.println("| Tipe Kuota          : " + tipeKuota);
                System.out.println("| Jumlah Kuota        : " + kuota);
                System.out.println("|============================================|\n");

            }
        }
    }
}
