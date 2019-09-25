package modul_2.exr6;

/**
 *
 * @author Dell
 */
public class Pegawai {
    String nama;
    int nip;
    double gaji;
    public void setPegawai(String nama, int nip, double gaji) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
        System.out.println("Nama : " + nama + "\n" +
                            "NIP : " + nip + "\n" +
                            "Gaji : " + gaji + "\n");
    }
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();
        Pegawai pegawai3 = new Pegawai();
        Pegawai pegawai4 = new Pegawai();
        Pegawai pegawai5 = new Pegawai();
        pegawai1.setPegawai("Irfan",13449,3000000);
        pegawai2.setPegawai("Nayla",323909,3500000);
        pegawai3.setPegawai("Sulis",666323,4000000);
        pegawai4.setPegawai("Raihan",51231,4500000);
        pegawai5.setPegawai("Daffa",798312,5000000);
    }   
}