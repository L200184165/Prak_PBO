package modul_2.exr4;

/**
 *
 * @author Dell
 */
public class NonVoidMethod {
    public String getNama() {
        String nama = "Irfan";
        return nama;
    }

    public String getNIM() {
        String nim = "L200184165";
        return nim;
    }

    public static void main(String[] args) {
        NonVoidMethod nonvoidmethod = new NonVoidMethod();
        System.out.println("Nama : " + nonvoidmethod.getNama());
        System.out.println("NIM : " + nonvoidmethod.getNIM());
    }
}
