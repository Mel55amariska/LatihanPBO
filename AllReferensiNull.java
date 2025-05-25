public class AllReferensiNull {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());

        l1 = null;
        l2 = null;
        l3 = null; // Maka l1, l2 dan l3 sudah tidak mereferensi lagi ke objek lingkaran dan objek lingkaran akan dihapus oleh Garbage Collection [cite: 11]

        System.out.println("\nSetelah mengatur semua referensi ke null:");
        // Mencoba mencetak akan menyebabkan NullPointerExceptions
        // if (l1 != null) System.out.println(l1.getJari2()); else System.out.println("l1 adalah null");
        // if (l2 != null) System.out.println(l2.getJari2()); else System.out.println("l2 adalah null");
        // if (l3 != null) System.out.println(l3.getJari2()); else System.out.println("l3 adalah null");

        System.out.println("Semua referensi (l1, l2, l3) sekarang null.");
        System.out.println("Objek Lingkaran yang sebelumnya diacu oleh l1, l2, dan l3 kini memenuhi syarat untuk garbage collection.");
    }
}