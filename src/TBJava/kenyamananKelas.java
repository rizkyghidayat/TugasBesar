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
public class kenyamananKelas extends RuangKelas{
    
    Scanner dos = new Scanner(System.in);
    
    
    private String kebisingan;
    private String bau;
    private String kebocoran;
    private String kerusakan;
    private String keausan;

    public String getKebisingan() {
        return kebisingan;
    }

    public void setKebisingan(String kebisingan) {
        this.kebisingan = kebisingan;
        if ("tidak bising".equals(kebisingan) || "Tidak bising".equals(kebisingan))
            this.kebisingan="Sesuai";
        else if ("bising".equals(kebisingan) || "Bising".equals(kebisingan))
            this.kebisingan="tidak sesuai";
        else
            this.kebisingan="inputan salah";
    }

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
        if ("tidak bau".equals(bau) || "Tidak bau".equals(bau))
            this.bau="Sesuai";
        else if ("bau".equals(bau) || "Bau".equals(bau))
            this.bau="tidak sesuai";
        else
            this.bau="inputan salah";
    }

    public String getKebocoran() {
        return kebocoran;
    }

    public void setKebocoran(String kebocoran) {
        this.kebocoran = kebocoran;
        if ("tidak bocor".equals(kebocoran) || "Tidak bocor".equals(kebocoran))
            this.kebocoran="Sesuai";
        else if ("bocor".equals(kebocoran) || "Bocor".equals(kebocoran))
            this.kebocoran="tidak sesuai";
        else
            this.kebocoran="inputan salah";
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
        if ("tidak rusak".equals(kerusakan) || "Tidak rusak".equals(kerusakan))
            this.kerusakan="Sesuai";
        else if ("rusak".equals(kerusakan) || "Rusak".equals(kerusakan))
            this.kerusakan="tidak sesuai";
        else
            this.kerusakan="inputan salah";
    }

    public String getKeausan() {
        return keausan;
    }

    public void setKeausan(String keausan) {
        this.keausan = keausan;
        if ("tidak aus".equals(keausan) || "Tidak aus".equals(keausan))
            this.keausan="Sesuai";
        else if ("aus".equals(keausan) || "Aus".equals(keausan))
            this.keausan="tidak sesuai";
        else
            this.keausan="inputan salah";
    }
    
    //public void kenyamanan(){
    public void inputan(){
        System.out.println("\nKebisingan (bising/tidak bising) = ");
        String ba=dos.next();
        setKebisingan(ba);
        System.out.println("Bau (bau/tidak bau) = ");
        String bb=dos.next();
        setBau(bb);
        System.out.println("Kebocoran (bocor/tidak bocor) = ");
        String bc=dos.next();
        setKebocoran(bc);
        System.out.println("Kerusakan (rusak/tidak rusak) = ");
        String bd=dos.next();
        setKerusakan(bd);
        System.out.println("Keausan (aus/tidak aus) = ");
        String be=dos.next();
        setKeausan(be);
        
    }
    
    //public void hasilkenyamanan(){
    public void outputan(){
        System.out.println("\nKebisingan kelas = "+getKebisingan());
        System.out.println("Bau kelas = "+getBau());
        System.out.println("Kebocoran = "+getKebocoran());
        System.out.println("Kerusakan = "+getKerusakan());
        System.out.println("Keausan = "+getKeausan());
    }
    
}
