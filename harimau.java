package tugas_p1;


    public class harimau extends kucing {
        private boolean berbulu;


        public void setBerbulu(boolean newValue) {
            berbulu = newValue;
        }



        public void Kecam() {
            System.out.println("Harimau " + " mengeluarkan suara 'Grrr' saat kecam.");
        }

        public void cetakStatus() {
            super.cetakStatus(); // Memanggil metode cetakStatus dari kelas Kucing
            System.out.println("Berbulu: " + berbulu);

        }
    }


