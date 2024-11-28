package Kos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MainApp {
        private static HashMap<String, List<Kos>> daftarKosPerKota = new HashMap<>();
        private static String[] kotaKos = { "Surabaya", "Jakarta", "Bandung", "Yogyakarta", "Malang", "Bali" };

        static class Kos {
                String nama;
                Double harga;
                List<String> fasilitas;

                public Kos(String nama, Double harga, List<String> fasilitas) {
                        this.nama = nama;
                        this.harga = harga;
                        this.fasilitas = fasilitas;
                }

                /**
                 * Tampilkan detail dari sebuah Kos.
                 */
                public void tampilkanKos() {
                        System.out.println("\n╔════════════════════════════════════════════════════════╗");
                        System.out.printf("║ %-54s ║\n", "🏠  Nama Kos: " + nama);
                        System.out.printf("║ %-54s ║\n", "💲  Harga Kos: " + formatRupiah(harga));
                        System.out.println("╟────────────────────────────────────────────────────────╢");
                        System.out.printf("║ %-54s ║\n", "📋  Fasilitas:");
                        for (String fasilitasItem : fasilitas) {
                                System.out.printf("║    • %-49s ║\n", fasilitasItem);
                        }
                        System.out.println("╚════════════════════════════════════════════════════════╝");
                }
        }

        /**
         * Inisialisasi data kos di tiap kota.
         */
        public static void inisialisasiData() {
                for (String kota : kotaKos) {
                        daftarKosPerKota.put(kota, new ArrayList<>());
                }
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

        }

        public static void tampilkanKotaRekursif(int indeks) {
                // Jika indeks sama dengan panjang array kota, hentikan rekursi
                if (indeks >= kotaKos.length) {
                        return;
                }

                System.out.printf("  %d. ❖ %s\n", (indeks + 1), kotaKos[indeks]);

                // Panggil fungsi rekursif untuk indeks berikutnya
                tampilkanKotaRekursif(indeks + 1);
        }

        /**
         * Menampilkan menu kota ke pengguna. Menu ini berisi header, subjudul,
         * daftar kota, dan footer yang meminta pengguna untuk memilih nomor kota
         * yang ingin dibooking.
         */
        public static void tampilkanMenuKota() {
                // Header menu
                System.out.println("╔════════════════════════════════════════════════╗");
                System.out.println("║             ★ Selamat Datang ★                 ║");
                System.out.println("║       Di Aplikasi Layanan Kos Kami 🏠          ║");
                System.out.println("╚════════════════════════════════════════════════╝");

                // Subjudul
                System.out.println("\n📜 Daftar Kota yang Tersedia:");

                // Daftar kota
                tampilkanKotaRekursif(0);

                // Footer dan prompt
                System.out.println("-------------------------------------------");
                System.out.print("👉 Pilih nomor kota (0 untuk keluar): ");

        }

        public static void tampilkanMenuUtama(String kotaTerpilih) {
                System.out.println("\n╔════════════════════════════════════════════════╗");
                System.out.printf("       ★ Menu Utama - Kota: %s ★          \n", kotaTerpilih);
                System.out.println("╚════════════════════════════════════════════════╝");

                // Daftar menu
                System.out.println("📋 Pilihan Menu:");
                System.out.println("  1. 🏠 Tampilkan Kos");
                System.out.println("  2. ➕ Tambah Kos");
                System.out.println("  3. 📅 Booking Kos");
                System.out.println("  4. 🔍 Manipulasi Substring");
                System.out.println("  5. ❓ Manipulasi Contains");
                System.out.println("  6. 🔡 Manipulasi ToLower");
                System.out.println("  7. 🔠 Manipulasi ToUpper");
                System.out.println("  8. ✏️ Manipulasi Replace");
                System.out.println("  9. 📏 Manipulasi Length");
                System.out.println(" 10. ⬅️ Kembali ke Menu Kota");

                // Footer prompt
                System.out.print("\n🌟 Pilih menu: ");

        }

        public static void tampilkanDaftarKos(String kotaTerpilih) {
                List<Kos> daftarKos = daftarKosPerKota.get(kotaTerpilih);
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
        }

        public static void tambahKos(String kotaTerpilih, Scanner scanner) {
                System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
                System.out.printf("            ✨ Tambah Kos Baru - Kota: %s ✨              \n", kotaTerpilih);
                System.out.println("╚════════════════════════════════════════════════════════════════╝");

                // Input nama kos
                System.out.print("🏠 Masukkan Nama Kos: ");
                String nama = scanner.nextLine();

                // Input harga kos
                System.out.print("💰 Masukkan Harga Kos: ");
                Double harga = scanner.nextDouble();
                scanner.nextLine();

                // Input fasilitas kos
                List<String> fasilitas = new ArrayList<>();
                System.out.println("\n🔧 Masukkan Fasilitas (ketik 'selesai' untuk selesai):");
                while (true) {
                        System.out.print("➤ ");
                        String input = scanner.nextLine();
                        if (input.equalsIgnoreCase("selesai")) {
                                break;
                        }
                        fasilitas.add(input);
                }

                // Tambah kos ke daftar
                daftarKosPerKota.get(kotaTerpilih).add(new Kos(nama, harga, fasilitas));

                // Konfirmasi penambahan kos
                System.out.println("\n✅ Kos berhasil ditambahkan!");
                System.out.println("╔════════════════════════════════════════════════════════════════╗");
                System.out.println("║              🎉 Detail Kos yang Ditambahkan 🎉                 ║");
                System.out.println("╚════════════════════════════════════════════════════════════════╝");
                System.out.printf(" 🏠 Nama: %-50s \n", nama);
                System.out.printf(" 💰 Harga: %-50s \n", formatRupiah(harga));
                System.out.println(" 🛠️  Fasilitas:");
                for (String fasilitasKos : fasilitas) {
                        System.out.printf("   - %-50s \n", fasilitasKos);
                }

        }

        public static void bookingKos(String kotaTerpilih, Scanner scanner) {
                List<Kos> daftarKos = daftarKosPerKota.get(kotaTerpilih);
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
                                System.out.printf("💲 Harga Kos    : %s\n ", formatRupiah(kosTerpilih.harga));
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
        }

        public static void manipulasiSubstring(Scanner scanner, String kotaTerpilih) {
                List<Kos> daftarKos = daftarKosPerKota.get(kotaTerpilih);

                if (daftarKos.isEmpty()) {
                        System.out.println("🚫 Tidak ada kos di kota ini untuk dimanipulasi.");
                        return;
                }

                System.out.println("╔════════════════════════════════════════════════════╗");
                System.out.println("║           ✂️ Pilih Kos untuk Dimanipulasi ✂️         ║");
                System.out.println("╚════════════════════════════════════════════════════╝");
                for (int i = 0; i < daftarKos.size(); i++) {
                        System.out.printf(" %d. 🏠 %s\n", (i + 1), daftarKos.get(i).nama);
                }
                System.out.print("\n👉 Pilih nomor kos: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                if (pilihan < 1 || pilihan > daftarKos.size()) {
                        System.out.println("⚠️ Pilihan tidak valid.");
                        return;
                }

                Kos kosTerpilih = daftarKos.get(pilihan - 1);

                System.out.print("\n✍️ Masukkan jumlah karakter yang akan dihapus dari belakang: ");
                int jumlahKarakter = scanner.nextInt();
                scanner.nextLine();

                if (jumlahKarakter >= kosTerpilih.nama.length()) {
                        System.out.println("⚠️ Jumlah karakter yang akan dihapus terlalu banyak!");
                        return;
                }

                // Memanipulasi nama kos
                kosTerpilih.nama = kosTerpilih.nama.substring(0, kosTerpilih.nama.length() - jumlahKarakter);

                System.out.println("\n✅ Nama kos berhasil dimanipulasi!");
                System.out.println("╔════════════════════════════════════════════════╗");
                System.out.printf(" Nama kos baru: %-30s \n", kosTerpilih.nama);
                System.out.println("╚════════════════════════════════════════════════╝");

                System.out.println("\n✨ Data kos berhasil diperbarui!");
        }

        public static void manipulasiContains(Scanner scanner, String kotaTerpilih) {
                List<Kos> daftarKos = daftarKosPerKota.get(kotaTerpilih);

                if (daftarKos.isEmpty()) {
                        System.out.println("🚫 Tidak ada kos di kota ini.");
                        return;
                }

                System.out.println("╔══════════════════════════════════════════════╗");
                System.out.println("║        🔍 Cari Nama Kos yang Diinginkan      ║");
                System.out.println("╚══════════════════════════════════════════════╝");
                System.out.print("\n✍️ Masukkan nama atau sebagian nama kos: ");
                String inputKos = scanner.nextLine(); // Input dari pengguna

                boolean ditemukan = false;
                System.out.println("\n📋 Kos yang mengandung \"" + inputKos + "\":");

                System.out.println("╔══════════════════════════════════════════════╗");
                for (Kos kos : daftarKos) {
                        // Mengecek apakah nama kos mengandung inputKos
                        if (kos.nama.contains(inputKos)) {
                                ditemukan = true;
                                System.out.printf(" 🏠 %-40s \n", kos.nama); // Menampilkan kos yang mengandung input
                        }
                }
                System.out.println("╚══════════════════════════════════════════════╝");

                if (!ditemukan) {
                        System.out.println("🚫 Tidak ada kos yang mengandung nama tersebut.");
                } else {
                        System.out.println("✅ Pencarian selesai!");
                }
        }

        public static void manipulasiLoworUp(Scanner scanner, String kotaTerpilih, boolean toLowerCase) {
                List<Kos> daftarKos = daftarKosPerKota.get(kotaTerpilih);

                if (daftarKos.isEmpty()) {
                        System.out.println("🚫 Tidak ada kos di kota ini.");
                        return;
                }

                String operasi = toLowerCase ? "Lowercase" : "Uppercase";
                System.out.println("╔════════════════════════════════════════════════════════╗");
                System.out.println("║        🔡 Ubah Nama Kos Menjadi " + operasi + "              ║");
                System.out.println("╚════════════════════════════════════════════════════════╝");
                System.out.println("\n📋 Pilih kos yang ingin diubah menjadi " + operasi + ":");

                // Menampilkan daftar kos
                System.out.println("╔════════════════════════════════════════════════════════╗");
                for (int i = 0; i < daftarKos.size(); i++) {
                        System.out.printf("║ %2d. %-50s ║\n", (i + 1), daftarKos.get(i).nama);
                }
                System.out.println("╚════════════════════════════════════════════════════════╝");

                System.out.print("\n✍️ Pilih nomor kos: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                // Validasi pilihan
                if (pilihan < 1 || pilihan > daftarKos.size()) {
                        System.out.println("🚫 Pilihan tidak valid.");
                        return;
                }

                Kos kosTerpilih = daftarKos.get(pilihan - 1);

                // Mengubah nama kos berdasarkan operasi yang dipilih (Lowercase atau Uppercase)
                if (toLowerCase) {
                        kosTerpilih.nama = kosTerpilih.nama.toLowerCase();
                } else {
                        kosTerpilih.nama = kosTerpilih.nama.toUpperCase();
                }

                // Menampilkan hasil perubahan
                System.out.println("\n✅ Nama kos berhasil diubah menjadi " + operasi + ":");
                System.out.println("╔════════════════════════════════════════════════════════╗");
                System.out.printf("║ 🏠 Nama kos sekarang: %-32s ║\n", kosTerpilih.nama);
                System.out.println("╚════════════════════════════════════════════════════════╝");
        }

        public static void manipulasiReplace(Scanner scanner, String kotaTerpilih) {
                List<Kos> daftarKos = daftarKosPerKota.get(kotaTerpilih);

                if (daftarKos.isEmpty()) {
                        System.out.println("🚫 Tidak ada kos di kota ini.");
                        return;
                }

                // Menampilkan Header dengan Border
                System.out.println("╔════════════════════════════════════════════════════════╗");
                System.out.println("║   🔄 Manipulasi Nama Kos (Replace) di Kota: " + kotaTerpilih + "   ║");
                System.out.println("╚════════════════════════════════════════════════════════╝");

                // Menampilkan daftar kos
                System.out.println("\n📋 Pilih kos yang ingin dimanipulasi:");
                System.out.println("╔════════════════════════════════════════════════════════╗");
                for (int i = 0; i < daftarKos.size(); i++) {
                        System.out.printf("║ %2d. %-50s ║\n", (i + 1), daftarKos.get(i).nama);
                }
                System.out.println("╚════════════════════════════════════════════════════════╝");

                // Memilih kos
                System.out.print("\n✍️ Pilih nomor kos yang ingin diubah: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                // Validasi pilihan
                if (pilihan < 1 || pilihan > daftarKos.size()) {
                        System.out.println("🚫 Pilihan tidak valid.");
                        return;
                }

                Kos kosTerpilih = daftarKos.get(pilihan - 1);

                // Meminta input substring yang ingin diganti dan penggantiannya
                System.out.print("\n🔍 Masukkan bagian nama kos yang ingin diganti: ");
                String oldSubstring = scanner.nextLine();
                System.out.print("🔄 Masukkan pengganti nama kos: ");
                String newSubstring = scanner.nextLine();

                // Mengganti bagian nama kos yang sesuai dengan input
                if (kosTerpilih.nama.contains(oldSubstring)) {
                        kosTerpilih.nama = kosTerpilih.nama.replace(oldSubstring, newSubstring);

                        // Menampilkan hasil perubahan
                        System.out.println("\n✅ Nama kos berhasil diubah menjadi:");
                        System.out.println("╔════════════════════════════════════════════════════════╗");
                        System.out.printf("║ 🏠 Nama kos sekarang: %-32s ║\n", kosTerpilih.nama);
                        System.out.println("╚════════════════════════════════════════════════════════╝");
                } else {
                        System.out.println("❌ Bagian nama kos yang dimaksud tidak ditemukan.");
                }
        }

        public static void manipulasiLength(Scanner scanner, String kotaTerpilih) {
                List<Kos> daftarKos = daftarKosPerKota.get(kotaTerpilih);

                if (daftarKos.isEmpty()) {
                        System.out.println("🚫 Tidak ada kos di kota ini.");
                        return;
                }

                // Menampilkan Header dengan Border
                System.out.println("╔════════════════════════════════════════════════════════╗");
                System.out.println("║  📏 Hitung Jumlah Karakter Nama Kos di Kota: " + kotaTerpilih + "  ║");
                System.out.println("╚════════════════════════════════════════════════════════╝");

                // Menampilkan daftar kos
                System.out.println("\n📋 Pilih kos yang ingin dihitung jumlah karakternya:");
                System.out.println("╔════════════════════════════════════════════════════════╗");
                for (int i = 0; i < daftarKos.size(); i++) {
                        System.out.printf("║ %2d. %-50s ║\n", (i + 1), daftarKos.get(i).nama);
                }
                System.out.println("╚════════════════════════════════════════════════════════╝");
                // Memilih kos

                System.out.print("\n✍️ Pilih nomor kos yang ingin dihitung jumlah karakternya: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                // Validasi pilihan
                if (pilihan < 1 || pilihan > daftarKos.size()) {
                        System.out.println("🚫 Pilihan tidak valid.");
                        return;
                }

                Kos kosTerpilih = daftarKos.get(pilihan - 1);

                // Menghitung jumlah karakter nama kos
                int panjangNamaKos = kosTerpilih.nama.length();

                // Menampilkan hasil perhitungan
                System.out.println("\n✅ Jumlah karakter dalam nama kos \"" + kosTerpilih.nama + "\" adalah: "
                                + panjangNamaKos);

                // Tampilan hasil dengan border
                System.out.println("╔════════════════════════════════════════════════════════╗");
                System.out.printf("║ 📏 Nama kos: %-41s ║\n", kosTerpilih.nama);
                System.out.printf("║ 🔢 Jumlah karakter: %-34d ║\n", panjangNamaKos);
                System.out.println("╚════════════════════════════════════════════════════════╝");
        }

        // public static String formatRupiah(double harga) {
        // // Membuat instance DecimalFormat
        // DecimalFormat kursIndonesia = (DecimalFormat)
        // DecimalFormat.getCurrencyInstance();
        // DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        // formatRp.setCurrencySymbol("Rp. ");
        // formatRp.setMonetaryDecimalSeparator(',');
        // formatRp.setGroupingSeparator('!');

        // // Mengatur simbol dan pemisah dalam format
        // kursIndonesia.setDecimalFormatSymbols(formatRp);

        // // Mengembalikan string yang terformat
        // return kursIndonesia.format(harga);
        // }

        static void KembaliMenuKota() {
                // Menampilkan header dengan border
                System.out.println("╔════════════════════════════════════════════════════════╗");
                System.out.println("║   🔙 Kembali ke Menu Kota                              ║");
                System.out.println("╚════════════════════════════════════════════════════════╝");
        }

        public static String formatRupiah(double harga) {
                String currency = "Rp.";
                DecimalFormatSymbols symbols = new DecimalFormatSymbols();
                symbols.setGroupingSeparator('.');
                symbols.setDecimalSeparator(',');

                DecimalFormat formatter = new DecimalFormat("#,##0.00", symbols);
                return currency + " " + formatter.format(harga);

        }

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                inisialisasiData();

                while (true) {
                        tampilkanMenuKota();
                        int pilihanKota = scanner.nextInt();
                        scanner.nextLine();
                        if (pilihanKota == 0) {
                                System.out.println("Terima kasih telah menggunakan aplikasi.");
                                break;
                        }
                        if (pilihanKota < 1 || pilihanKota > kotaKos.length) {
                                System.out.println("Pilihan kota tidak valid.");
                                continue;
                        }
                        String kotaTerpilih = kotaKos[pilihanKota - 1];

                        while (true) {
                                tampilkanMenuUtama(kotaTerpilih);
                                int pilihanMenu = scanner.nextInt();
                                scanner.nextLine();

                                switch (pilihanMenu) {
                                        case 1 -> tampilkanDaftarKos(kotaTerpilih);
                                        case 2 -> tambahKos(kotaTerpilih, scanner);
                                        case 3 -> bookingKos(kotaTerpilih, scanner);
                                        case 4 -> manipulasiSubstring(scanner, kotaTerpilih);
                                        case 5 -> manipulasiContains(scanner, kotaTerpilih);
                                        case 6 -> manipulasiLoworUp(scanner, kotaTerpilih, true);
                                        case 7 -> manipulasiLoworUp(scanner, kotaTerpilih, false);
                                        case 8 -> manipulasiReplace(scanner, kotaTerpilih);
                                        case 9 -> manipulasiLength(scanner, kotaTerpilih);
                                        case 10 -> KembaliMenuKota();
                                        default -> System.out.println("Pilihan menu tidak valid.");
                                }
                                if (pilihanMenu == 10)
                                        break;
                        }
                }
                scanner.close();
        }

}
