package tugas_p1;

public class buku {


        private String judul;
        private String penulis;
        private int tahunTerbit;

        public void setJudul(String newValue) {
            judul = newValue;
        }

        public void setPenulis(String newValue) {
            penulis = newValue;
        }

        public void setTahunTerbit(int newValue) {
            tahunTerbit = newValue;
        }

        public void InfoBuku() {
            System.out.println("Judul: " + judul);
            System.out.println("Penulis: " + penulis);
            System.out.println("Tahun Terbit: " + tahunTerbit);
        }

        public void Baca() {
            System.out.println("Sedang membaca buku " + judul);
        }

        public void Pinjam(String peminjam) {
            System.out.println("Buku " + judul + " dipinjam oleh " + peminjam);
        }
    }

