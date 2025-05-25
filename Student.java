public class Student {
    private String nrp;
    private String nama;
    private String jurusan;

    public Student() {
        // Default constructor
    }
    public Student(String nrp, String nama, String jurusan) {
        this.nrp = nrp;
        this.nama = nama;
        this.jurusan = jurusan;
    }
    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void tampilkanData() {
        System.out.println("NRP: " + nrp);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }

    public static void main(String[] args) {
        Student mhs = new Student();
        mhs.setNrp("123456789");
        mhs.setNama("Budi Santoso");
        mhs.setJurusan("Teknik Informatika");
        mhs.tampilkanData();
    }
}