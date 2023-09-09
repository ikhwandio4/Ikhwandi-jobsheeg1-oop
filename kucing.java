package tugas_p1;

public class kucing {


        private String warna;
        private int umur;
        private String jenis;

        public void setWarna(String newValue) {
            warna = newValue;
        }

        public void setUmur(int newValue) {
            umur = newValue;
        }

        public void setJenis(String newValue) {
            jenis = newValue;
        }
    public void Suara() {
        System.out.println("Kucing " + warna + " mengeluarkan suara 'Meong'.");
    }

        public void cetakStatus() {
            System.out.println("Warna: " + warna);
            System.out.println("Umur: " + umur + "th");
            System.out.println("Jenis: " + jenis );

        }
    }


