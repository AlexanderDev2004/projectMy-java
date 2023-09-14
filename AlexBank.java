import java.util.Scanner;
import javax.swing.InputMap;

public class AlexBank {

    public static void main(String[] args) {
        Scanner Input= new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.println("Masukan Jumlah tabungan Anda");
        jml_tabungan_awal= Input.nextInt();
        System.out.println("Masukan Lama menambung");
        lama_menabung= Input.nextInt();
        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga+jml_tabungan_awal;
        System.out.println("Jumlah tabungan Akhir Anda Adalah : " + jml_tabungan_akhir);
    }
}