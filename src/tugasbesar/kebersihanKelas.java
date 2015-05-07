/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.Scanner;

/**
 *
 * @author AHO
 */
public class kebersihanKelas{
    kebersihankelassetGet dis = new kebersihankelassetGet();
    Scanner sid = new Scanner(System.in);
    
    public void kebersihan(){
        System.out.println("\nSirkulasi udara (lancar/tidak) = ");
        dis.setSirkulasiudara(sid.nextLine());
        System.out.println("Pencahayaan (terang/tidak) = ");
        dis.setPencahayaan(sid.nextLine());
        System.out.println("Kelembaban (lembab/tidak) = ");
        dis.setKelembaban(sid.nextLine());
        System.out.println("Suhu (sejuk/panas) = ");
        dis.setSuhu(sid.nextLine());
    }
    
    public void hasilkebersihan(){
        System.out.println("\nSirkulasi udara = "+dis.getSirkulasiudara());
        System.out.println("Pencahayaan = "+dis.getPencahayaan());
        System.out.println("Kelembaban = "+dis.getKelembaban());
        System.out.println("Suhu = "+dis.getSuhu());
    }
}
