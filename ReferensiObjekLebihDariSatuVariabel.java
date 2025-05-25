public class ReferensiObjekLebihDariSatuVariabel {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1; // l2 mengacu pada objek yang sama dengan l1 [cite: 25, 26]

        System.out.println(l1.getJari2()); // 5 [cite: 26]
        System.out.println(l2.getJari2()); // 5 [cite: 26]

        l2.setJari2(10); // Mengubah jari-jari melalui l2

        System.out.println(l1.getJari2()); // 10 [cite: 26]
        System.out.println(l2.getJari2()); // 10 [cite: 26]
    }
}