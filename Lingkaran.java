public class Lingkaran {
    private int jari2; // radius

    public Lingkaran(int jari2) {
        this.jari2 = jari2;
    }
    public int getJari2() {
        return jari2;
    }
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
    // Method untuk menghitung luas lingkaran
    public double getLuas() {
        return Math.PI * jari2 * jari2;
    }
    // Method untuk menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jari2;
    }
    // Method main untuk demo penggunaan
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran(7);
        System.out.println("Jari-jari: " + ling.getJari2());
        System.out.println("Luas: " + ling.getLuas());
        System.out.println("Keliling: " + ling.getKeliling());
    }
}