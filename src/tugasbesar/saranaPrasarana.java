/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author AHO
 */
import java.util.Scanner;
public class saranaPrasarana {
    saranaPrasaranasetget anu = new saranaPrasaranasetget();
    Scanner scan=new Scanner(System.in);
    
    public void sarana(){
        System.out.println("Jumlah Steker = ");
        anu.setJumlahsteker(scan.nextInt());
        System.out.println("Kondisi steker (baik/tidak baik)= ");
        anu.setKondisisteker(scan.next());
        System.out.println("Posisi steker (pojok ruang/dekat dosen) = ");
        anu.setPosisisteker(scan.next());
        
        System.out.println("Jumlah kebel LCD = ");
        anu.setJumlahkabellcd(scan.nextInt());
        System.out.println("Kondisi kabel LCD (berfungsi/tidak berfungsi) = ");
        anu.setKondisikabellcd(scan.next());
        System.out.println("Posisi kabel LCD (dekat dosen/jauh) = ");
        anu.setPosisikabellcd(scan.next());
        
        System.out.println("Jumlah lampu = ");
        anu.setJumlahlampu(scan.nextInt());
        System.out.println("Kondisi lampu (baik/tidak) = ");
        anu.setKondisilampu(scan.next());
        System.out.println("Posisi lampu (atap ruang/dinding)= ");
        anu.setPosisilampu(scan.next());
    }
    public void hasil(){
        System.out.println("Jumlah steker = "+anu.getJumlahsteker());
        System.out.println("Kondisi = "+anu.getKondisisteker());
        System.out.println("Posisi = "+anu.getPosisisteker());
        System.out.println("\nJumlah kabel LCD = "+anu.getJumlahkabellcd());
        System.out.println("Kondisi kabel LCD = "+anu.getKondisikabellcd());
        System.out.println("Posisi kabel LCD = "+anu.getPosisikabellcd());
        System.out.println("\nJumlah lampu = "+anu.getPosisilampu());
        System.out.println("Kondisi kabel = "+anu.getKondisilampu());
        System.out.println("Posisi kabel = "+anu.getPosisilampu());
 }
}
