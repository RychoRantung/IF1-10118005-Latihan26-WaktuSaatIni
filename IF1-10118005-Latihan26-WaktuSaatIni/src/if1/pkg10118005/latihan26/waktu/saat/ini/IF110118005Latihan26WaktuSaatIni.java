/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan26.waktu.saat.ini;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program :Program berisi program yang menampilkan waktu saat ini
 */
public class IF110118005Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");
        String formattedDate = date.format(dateFormatted);
        System.out.println("Hari ini adalah hari : " + formattedDate);
    }
    
}
