package SoalLatihan;

public class Mahasiswa {
    private int nim;
    private String nama;
    private String jurusan;
    private double ipk;

    Mahasiswa(){
        this.nim = 99;
        this.nama = " ";
        this.jurusan = "TI";
        this.ipk = 4.0;
    }
    Mahasiswa (int nim,String nama,String jurusan,double ipk){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
// setter
    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // getter

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public double getIpk() {
        return ipk;
    }
    public void setAll (int nim,String nama,String jurusan,double ipk){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim=" + nim +
                ", nama='" + nama + '\'' +
                ", jurusan='" + jurusan + '\'' +
                ", ipk=" + ipk +
                '}';
    }
}
