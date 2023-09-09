package tugas_p1;

public class novel extends buku {

        private String genre;

        public void setGenre(String newValue) {
            genre = newValue;
        }

        public void InfoNovel() {
            InfoBuku(); // Memanggil metode InfoBuku() dari kelas Buku
            System.out.println("Genre: " + genre);
        }

}

