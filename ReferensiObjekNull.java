public class ReferensiObjekNull {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());

        l2 = null; // l2 tidak lagi mereferensi ke objek Lingkaran

        // System.out.println(l2.getJari2()); // Baris ini akan menyebabkan NullPointerException
        System.out.println("l2 adalah null, tidak dapat mengakses properti."); // Sebagai gantinya, cetak pesan
        System.out.println(l1.getJari2());
        System.out.println(l3.getJari2());
    }
}

class Lingkaran {
    private double jari2;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    public double getJari2() {
        return jari2;
    }
}