/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TBJava;

import java.util.Scanner;

/**
 *
 * @author XOC
 */
public class keamananKelas extends RuangKelas{
    Scanner pd = new Scanner(System.in);
    
    
    private String kekokohan;
    private String kuncipintu;
    private String kuncijendela;
    private String keamanan;

    public String getKekokohan() {
        return kekokohan;
    }

    public void setKekokohan(String kekokohan) {
        this.kekokohan = kekokohan;
        if ("kokoh".equals(kekokohan) || "Kokoh".equals(kekokohan))
            this.kekokohan="Sesuai";
        else if ("tidak kokoh".equals(kekokohan) || "Tidak kokoh".equals(kekokohan))
            this.kekokohan="tidak sesuai";
        else
            this.kekokohan="inputan salah";
    }

    public String getKuncipintu() {
        return kuncipintu;
    }

    public void setKuncipintu(String kuncipintu) {
        this.kuncipintu = kuncipintu;
        if ("ada".equals(kuncipintu) || "Ada".equals(kuncipintu))
            this.kuncipintu="Sesuai";
        else if ("tidak ada".equals(kuncipintu) || "Tidak ada".equals(kuncipintu))
            this.kuncipintu="tidak sesuai";
        else
            this.kuncipintu="inputan salah";
    }

    public String getKuncijendela() {
        return kuncijendela;
    }

    public void setKuncijendela(String kuncijendela) {
        this.kuncijendela = kuncijendela;
        if ("ada".equals(kuncijendela) || "Ada".equals(kuncijendela))
            this.kuncipintu="Sesuai";
        else if ("tidak ada".equals(kuncijendela) || "Tidak ada".equals(kuncijendela))
            this.kuncijendela="tidak sesuai";
        else
            this.kuncijendela="inputan salah";
    }

    public String getKeamanan() {
        return keamanan;
    }

    public void setKeamanan(String keamanan) {
        this.keamanan = keamanan;
        if ("aman".equals(keamanan) || "Aman".equals(keamanan))
            this.keamanan="Sesuai";
        else if ("tidak aman".equals(keamanan) || "Tidak aman".equals(keamanan))
            this.keamanan="tidak sesuai";
        else
            this.keamanan="inputan salah";
    }
    
    
    
    
    
    //public void keamanan(){
    public void inputan(){
        System.out.println("\nKekokohan (kokoh/tidak kokoh) = ");
        String ca=pd.next();
        setKekokohan(ca);
        System.out.println("Kunci pintu (ada/tidak ada)= ");
        String cb=pd.next();
        setKuncipintu(cb);
        System.out.println("Kunci jendela (ada/tidak ada)= ");
        String cc=pd.next();
        setKuncijendela(cc);
        System.out.println("Keamanan (aman/tidak aman) = ");
        String cd=pd.next();
        setKeamanan(cd);
    }
    
    //public void hasilkeamanan(){
    public void outputan(){
        System.out.println("\nKekokohan = "+getKekokohan());
        System.out.println("Kunci pintu = "+getKuncipintu());
        System.out.println("Kunci jendela = "+getKuncijendela());
        System.out.println("Kaamanan = "+getKeamanan());
    }
}
