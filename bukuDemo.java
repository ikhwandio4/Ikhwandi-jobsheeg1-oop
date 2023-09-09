package tugas_p1;

public class bukuDemo {

        public static void main(String[] args) {
            // Membuat objek Buku
            buku buku1 = new buku();
            buku1.setJudul("Pemrograman Java");
            buku1.setPenulis("John Doe");
            buku1.setTahunTerbit(2021);

            // Membuat objek Novel
            novel novel1 = new novel();
            novel1.setJudul("Harry Potter");
            novel1.setPenulis("J.K. Rowling");
            novel1.setTahunTerbit(1997);
            novel1.setGenre("Fantasy");

            // Memanggil metode InfoBuku dan InfoNovel
            System.out.println("Info Buku:");
            buku1.InfoBuku();
            buku1.Baca();
            buku1.Pinjam("indra");

            System.out.println("\nInfo Novel:");
            novel1.InfoNovel();
            novel1.Baca();
            novel1.Pinjam("angga");

        }
    }


