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
public class kenyamananKelas {
    kenyamanankelassetget sod = new kenyamanankelassetget();
    Scanner dos = new Scanner(System.in);
    
    public void kenyamanan(){
        System.out.println("\nKebisingan (bising/tidak bising) = ");
        sod.setKebisingan(dos.nextLine());
    }
    
    public void hasilkenyamanan(){
        System.out.println("\nKebisingan = "+sod.getKebisingan());
    }
    
}
