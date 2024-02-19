package Dicoding.days1;
// pakages di Gunakan untuk mengetahui file tempat mereka berasal
import java.util.Date;
import java.time.LocalDate;


public class main {
    private static final String DateUtils = null;

    public static void main(String[] args) {
        System.out.println("Hello");
        dram.dram();
        mobil.BanMobil();

        LocalDate today = LocalDate.now();
        System.out.println("Hari ini = " + today);
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Besok = " + tomorrow);
    }
    
}