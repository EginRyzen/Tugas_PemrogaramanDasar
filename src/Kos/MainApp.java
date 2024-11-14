package Kos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Fungsi class kos ini sebagai cetakan
class Kos {
        String nama;
        Double harga;
        List<String> fasilitas;

        public Kos(String nama, Double harga, List<String> fasilitas) {
                this.nama = nama;
                this.harga = harga;
                this.fasilitas = fasilitas;
        }

        public void tampilkanKos() {
                System.out.println("\n╔════════════════════════════════════════════════════════╗");
                System.out.printf("║ %-54s ║\n", "🏠  Nama Kos: " + nama);
                System.out.printf("║ %-54s ║\n", "💲  Harga Kos: Rp " + harga);
                System.out.println("╟────────────────────────────────────────────────────────╢");
                System.out.printf("║ %-54s ║\n", "📋  Fasilitas:");
                for (String fasilitasItem : fasilitas) {
                        System.out.printf("║    • %-49s ║\n", fasilitasItem);
                }
                System.out.println("╚════════════════════════════════════════════════════════╝");

        }
}

public class MainApp {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out
                                .println("╔════════════════════════════════════════════════════════════════════════════════════════╗");
                System.out.println(
                                "                       Selamat Datang di Aplikasi Layanan Kos                            ");
                System.out
                                .println("╚════════════════════════════════════════════════════════════════════════════════════════╝");
                // Daftar Kota dan Kos
                String[] kotaKos = { "Surabaya", "Jakarta", "Bandung", "Yogyakarta", "Malang", "Bali" };
                HashMap<String, List<Kos>> daftarKosPerKota = new HashMap<>();
                // Hasil HasMap nanti nya
                // {
                // "Surabaya": [],
                // "Jakarta": [],
                // "Bandung": []
                // }

                // Inisialisasi daftar kos untuk setiap kota dengan beberapa data awal
                for (String kota : kotaKos) {
                        daftarKosPerKota.put(kota, new ArrayList<>());
                }

                // Dftar kos
                daftarKosPerKota.get("Surabaya").add(new Kos("Kos A", 1000000.0,
                                new ArrayList<>(List.of("AC", "WiFi", "Kamar Mandi Dalam"))));
                daftarKosPerKota.get("Surabaya").add(new Kos("Kos B", 1500000.0,
                                new ArrayList<>(List.of("WiFi", "Kamar Mandi Luar", "Parkir Motor"))));
                daftarKosPerKota.get("Surabaya").add(
                                new Kos("Kos C", 1200000.0, new ArrayList<>(List.of("AC", "Parkir Motor", "Laundry"))));

                daftarKosPerKota.get("Jakarta").add(new Kos("Kos B", 1200000.0,
                                new ArrayList<>(List.of("WiFi", "Kamar Mandi Luar", "Parkir Motor"))));
                daftarKosPerKota.get("Bandung").add(new Kos("Kos C", 800000.0, new ArrayList<>(List.of("AC", "WiFi"))));

                daftarKosPerKota.get("Yogyakarta").add(new Kos("Kos D", 900000.0,
                                new ArrayList<>(List.of("WiFi", "Parkir Motor", "Kamar Mandi Luar"))));
                daftarKosPerKota.get("Yogyakarta").add(new Kos("Kos E", 1100000.0,
                                new ArrayList<>(List.of("AC", "WiFi", "Kamar Mandi Dalam", "Parkir Mobil"))));

                daftarKosPerKota.get("Malang").add(new Kos("Kos F", 1000000.0,
                                new ArrayList<>(List.of("WiFi", "Kamar Mandi Dalam", "Parkir Motor"))));
                daftarKosPerKota.get("Malang").add(new Kos("Kos G", 1300000.0,
                                new ArrayList<>(List.of("AC", "WiFi", "Kamar Mandi Luar", "Laundry"))));

                int pilihanKota;
                do {
                        System.out.println(
                                        "\n╔══════════════════════════════════════════════════════════════════════════════════════╗");
                        System.out.println(
                                        "                           Daftar Kota yang Tersedia                                    ");
                        System.out.println(
                                        "╚══════════════════════════════════════════════════════════════════════════════════════╝");

                        System.out
                                        .println("╔════╦════════════════════════════════════════════════════════════════════════════════╗");
                        System.out
                                        .println("║ No ║                          Kota                                                  ║");
                        System.out
                                        .println("╠════╬════════════════════════════════════════════════════════════════════════════════╣");

                        for (int i = 0; i < kotaKos.length; i++) {
                                System.out.printf("║ %-1d. ║ %-78s ║\n", (i + 1), kotaKos[i].toUpperCase());
                        }

                        System.out
                                        .println("╚════╩════════════════════════════════════════════════════════════════════════════════╝");

                        System.out.println(
                                        "╔══════════════════════════════════════════════════════════════════════════════════════╗");
                        System.out.print("           Masukkan Nomor Kota yang Anda pilih (0 untuk keluar): ");
                        pilihanKota = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(
                                        "╚══════════════════════════════════════════════════════════════════════════════════════╝");

                        if (pilihanKota == 0) {
                                System.out.println(
                                                "╔══════════════════════════════════════════════════════════════════════════════════════╗");
                                System.out.println(
                                                "║                   Terima kasih telah menggunakan aplikasi ini.                       ║");
                                System.out.println(
                                                "╚══════════════════════════════════════════════════════════════════════════════════════╝");
                                break;
                        }

                        if (pilihanKota < 1 || pilihanKota > kotaKos.length) {
                                System.out.println(
                                                "╔══════════════════════════════════════════════════════════════════════════════════════╗");
                                System.out.println(
                                                "║                Kota yang Anda masukkan tidak tersedia. Silakan coba lagi.            ║");
                                System.out.println(
                                                "╚══════════════════════════════════════════════════════════════════════════════════════╝");
                                continue;
                        }

                        String kotaTerpilih = kotaKos[pilihanKota - 1];
                        System.out.println(
                                        "╔══════════════════════════════════════════════════════════════════════════════════════╗");
                        System.out.printf("║                   Kota yang Anda pilih adalah: %-37s ║\n", kotaTerpilih);
                        System.out.println(
                                        "╚══════════════════════════════════════════════════════════════════════════════════════╝");

                        int pilihanMenu;
                        do {
                                System.out.println(
                                                "\n╔═════════════════════════════════════════════════════════════════════════════════════╗");
                                System.out.println(
                                                "║                                 Pilih Menu                                          ║");
                                System.out.println(
                                                "╠════╦════════════════════════════════════════════════════════════════════════════════╣");
                                System.out.println(
                                                "║ 1  ║ Tampilkan Kos                                                                  ║");
                                System.out.println(
                                                "╠════╬════════════════════════════════════════════════════════════════════════════════╣");
                                System.out.println(
                                                "║ 2  ║ Tambah Kos                                                                     ║");
                                System.out.println(
                                                "╠════╬════════════════════════════════════════════════════════════════════════════════╣");
                                System.out.println(
                                                "║ 3  ║ Booking Kos                                                                    ║");
                                System.out.println(
                                                "╠════╬════════════════════════════════════════════════════════════════════════════════╣");
                                System.out.println(
                                                "║ 4  ║ Kembali ke menu pemilihan kota                                                 ║");
                                System.out.println(
                                                "╚════╩════════════════════════════════════════════════════════════════════════════════╝");

                                System.out.println(
                                                "╔═════════════════════════════════════════════════════════════════════════════════════╗");
                                System.out.print(" Masukkan pilihan menu: ");
                                pilihanMenu = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println(
                                                "╚═════════════════════════════════════════════════════════════════════════════════════╝");

                                List<Kos> daftarKos = daftarKosPerKota.get(kotaTerpilih);

                                switch (pilihanMenu) {
                                        case 1:

                                                if (daftarKos.isEmpty()) {
                                                        System.out.println(
                                                                        "\n╔═════════════════════════════════════════════════════════════════════════════════════╗");
                                                        System.out.printf("║ %-84s ║\n",
                                                                        "  ⚠️  Belum ada kos yang tersedia di "
                                                                                        + kotaTerpilih + ". ");
                                                        System.out.println(
                                                                        "╚═════════════════════════════════════════════════════════════════════════════════════╝");

                                                } else {
                                                        for (Kos kos : daftarKos) {
                                                                kos.tampilkanKos();
                                                        }
                                                }

                                                break;

                                        case 2:
                                                System.out.println(
                                                                "\n╔═════════════════════════════════════════════════════╗");
                                                System.out.println(
                                                                "║             Tambah Data Kos Baru                    ║");
                                                System.out.println(
                                                                "╚═════════════════════════════════════════════════════╝");

                                                System.out.print("📌 Masukkan Nama Kos: ");
                                                String nama = scanner.nextLine();

                                                System.out.print("💲 Masukkan Harga Kos: ");
                                                Double harga = scanner.nextDouble();

                                                // membuat daftar array list baru untuk daftar fasilitas
                                                List<String> fasilitasList = new ArrayList<>();
                                                String fasilitas;
                                                System.out.println(
                                                                "\n🛠 Masukkan Fasilitas Kos (ketik 'selesai' jika sudah selesai):");

                                                do {
                                                        System.out.print("   ➤ ");
                                                        fasilitas = scanner.nextLine();
                                                        if (!fasilitas.equalsIgnoreCase("selesai")) {
                                                                fasilitasList.add(fasilitas);
                                                        }
                                                } while (!fasilitas.equalsIgnoreCase("selesai"));

                                                // Menambahkan kos ke daftar
                                                daftarKos.add(new Kos(nama, harga, fasilitasList));

                                                System.out.println(
                                                                "\n╔═════════════════════════════════════════════════════╗");
                                                System.out.println("        ✅ Kos berhasil ditambahkan di "
                                                                + kotaTerpilih + "      ");
                                                System.out.println(
                                                                "╚═════════════════════════════════════════════════════╝");
                                                break;

                                        case 3:
                                                System.out.println(
                                                                "\n╔══════════════════════════════════════════════════════╗");
                                                System.out.println("                📋 Booking Kos di " + kotaTerpilih
                                                                + "               ");
                                                System.out.println(
                                                                "╚══════════════════════════════════════════════════════╝");

                                                if (daftarKos.isEmpty()) {
                                                        System.out.println("⚠️  Belum ada kos yang bisa dibooking di "
                                                                        + kotaTerpilih + ".");
                                                } else {
                                                        System.out.println("\nPilih kos yang ingin Anda booking:");

                                                        // Menampilkan daftar kos
                                                        for (int i = 0; i < daftarKos.size(); i++) {
                                                                System.out.printf(" %2d. %s\n", (i + 1),
                                                                                daftarKos.get(i).nama);
                                                        }

                                                        System.out.print("\nMasukkan nomor kos yang ingin dibooking: ");
                                                        int pilihanKos = scanner.nextInt();
                                                        scanner.nextLine();

                                                        // Validasi pilihan kos
                                                        if (pilihanKos < 1 || pilihanKos > daftarKos.size()) {
                                                                System.out.println("❌ Pilihan tidak valid.");
                                                        } else {
                                                                Kos kosTerpilih = daftarKos.get(pilihanKos - 1);
                                                                System.out.println(
                                                                                "\n✅ Anda berhasil membooking kos berikut:");

                                                                System.out.println(
                                                                                "\n╔════════════════════════════════════════════╗");
                                                                System.out.println(
                                                                                "║             Detail Kos yang Dipesan        ║");
                                                                System.out.println(
                                                                                "╚════════════════════════════════════════════╝");
                                                                System.out.printf("📌 Nama Kos     : %s\n",
                                                                                kosTerpilih.nama);
                                                                System.out.printf("💲 Harga Kos    : Rp%s \n ",
                                                                                kosTerpilih.harga);
                                                                System.out.print("🔹 Fasilitas    : ");
                                                                System.out.println(String.join(", ",
                                                                                kosTerpilih.fasilitas));
                                                                System.out.println(
                                                                                "\n--------------------------------------------");

                                                                // FUngsi remove ini untuk menghapus daftar kos yanng
                                                                // telah dibooking
                                                                daftarKos.remove(kosTerpilih);
                                                                System.out.println(
                                                                                "🙏 Terima kasih sudah menggunakan layanan kami!");
                                                                System.out.println(
                                                                                "   Semoga Anda mendapatkan kos yang sesuai.");
                                                        }
                                                }
                                                break;

                                        case 4:
                                                System.out.println(
                                                                "\n╔═══════════════════════════════════════════════════╗");
                                                System.out.println(
                                                                "║          🔄 Kembali ke Menu Pemilihan Kota        ║");
                                                System.out.println(
                                                                "╚═══════════════════════════════════════════════════╝");
                                                break;

                                        default:
                                                System.out.println(
                                                                "\n╔═══════════════════════════════════════════════════╗");
                                                System.out.println(
                                                                "║             ⚠️  Pilihan Tidak Valid                ║");
                                                System.out.println(
                                                                "║       Silakan masukkan pilihan yang benar!        ║");
                                                System.out.println(
                                                                "╚═══════════════════════════════════════════════════╝");
                                                break;

                                }

                        } while (pilihanMenu != 4);

                } while (pilihanKota != 0);

                scanner.close();
        }
}
