public class DemoKelas {
    public static void main (String[] args){
        Siswa fikri = new Siswa("fikri");

        Kelas k = new Kelas(fikri);

        Siswa nella = new Siswa ("nella");
        k.tambahDiBelakang(nella);
        k.tambahDiBelakang(new Siswa("ican"));
        k.tambahDiBelakang(new Siswa("manda"));
        k.tambahDiBelakang(new Siswa("zuto"));
        k.tampilkanSemua();
    }
}