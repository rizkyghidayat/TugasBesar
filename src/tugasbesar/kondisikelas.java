/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import com.sun.java_cup.internal.runtime.Symbol;
import java.util.Scanner;

/**
 *
 * @author AHO
 */
public class kondisikelas{
    kondisikelassetget kond=new kondisikelassetget();
    Scanner konds = new Scanner(System.in);
    
    public void kondisi(){
        System.out.println("Nama ruang = ");
        kond.setNamaruangan(konds.nextLine());
        System.out.println("Lokasi ruang = ");
        kond.setLokasiruaangan(konds.nextLine());
        System.out.println("Program studi = ");
        kond.setProgramstudi(konds.nextLine());
        System.out.println("Fakultas = ");
        kond.setFakultas(konds.nextLine());
        System.out.println("\nPanjang ruang = ");
        kond.setPanjang(konds.nextInt());
        System.out.println("Lebar ruang = ");
        kond.setLebar(konds.nextInt());
        System.out.println("Jumlah kursi = ");
        kond.setJumlahkursi(konds.nextInt());
        System.out.println("jumlah pintu = ");
        kond.setJumlahpintu(konds.nextInt());
        System.out.println("Jumlah jendela = ");
        kond.setJumlahjendela(konds.nextInt());
        
    }
    
    public void hasilkondisi(){
        System.out.println("Ruangan "+kond.getNamaruangan());
        System.out.println(kond.getLokasiruaangan());
        System.out.println("Jurusan "+kond.getProgramstudi());
        System.out.println("fakultas "+kond.getFakultas());
        System.out.println("\nPanjang ruang "+kond.getPanjang());
        System.out.println("Lebar ruang "+kond.getLebar());
      //  System.out.println("Kesesuaian ruangan = "+kond.bentuk(int panjang,int lebar));
    }
    
}
