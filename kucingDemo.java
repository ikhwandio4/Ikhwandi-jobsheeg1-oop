package tugas_p1;

public class kucingDemo {
    public static void main(String[] args) {
       kucing kc=new kucing();
       harimau hr=new harimau();

       kc.setWarna("orange");
       kc.setJenis("persia");
       kc.setUmur(2);
       kc.Suara();
       kc.cetakStatus();


       hr.setWarna("belang");
       hr.setJenis("sumatera");
       hr.setUmur(10);
       hr.Kecam();
       hr.setBerbulu(true);
       hr.cetakStatus();

    }
}
