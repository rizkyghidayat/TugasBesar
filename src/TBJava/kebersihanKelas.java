/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TBJava;

import java.util.Scanner;

/**
 *
 * @author Danang
 */
public class kebersihanKelas extends RuangKelas{
    Scanner as = new Scanner(System.in);
    
    
    private String sirkulasiudara;
    private String pencahayaan;
    private String kelembaban;
    private String suhu;

    Scanner baru=new Scanner(System.in);
    
    public String getSirkulasiudara() {
        return sirkulasiudara;
    }

    public void setSirkulasiudara(String sirkulasiudara) {
        this.sirkulasiudara = sirkulasiudara;
        if("lancar".equals(sirkulasiudara) || "Lancar".equals(sirkulasiudara))
            this.sirkulasiudara="sesuai";
        else
            this.sirkulasiudara="tidak sesuai";
            }

    public String getPencahayaan() {
        return pencahayaan;
    }

    public void setPencahayaan(String pencahayaan) {
        this.pencahayaan = pencahayaan;
        if("terang".equals(pencahayaan) || "Terang".equals(pencahayaan))
            this.pencahayaan="sesuai";
        else
            this.pencahayaan="tidak sesuai";
    }

    public String getKelembaban() {
        return kelembaban;
    }

    public void setKelembaban(String kelembaban) {
        this.kelembaban = kelembaban;
        if("Tidak lembab".equals(kelembaban) || "tidak lembab".equals(kelembaban))
            this.kelembaban="sesuai";
        else if("lembab".equals(kelembaban) || "Lembab".equals(kelembaban))
            this.kelembaban="tidak sesuai";
        else
            this.kelembaban="inputan salah";
    }

    public String getSuhu() {
        return suhu;
    }

    public void setSuhu(String suhu) {
        this.suhu = suhu;
        if("sejuk".equals(suhu) || "Sejuk".equals(suhu))
            this.suhu="sesuai";
        else if("Panas".equals(suhu) || "panas".equals(suhu))
            this.suhu="tidak sesuai";
        else
            this.suhu="inputan salah";
    }
    
    
    
    
    
    //public void kebersihan(){
    public void inputan(){
        System.out.println("\nSirkulasi udara (lancar/tidak) = ");
        String ab=as.next();
        setSirkulasiudara(ab);
        System.out.println("Pencahayaan (terang/tidak) = ");
        String ac=as.next();
        setPencahayaan(ac);
        System.out.println("Kelembaban (lembab/tidak) = ");
        String ad=as.next();
        setKelembaban(ad);
        System.out.println("Suhu (sejuk/panas) = ");
        String ae=as.next();
        setSuhu(ae);
    }
    
    //public void hasilkebersihan(){
    public void outputan(){
        System.out.println("\nSirkulasi udara = "+getSirkulasiudara());
        System.out.println("Pencahayaan = "+getPencahayaan());
        System.out.println("Kelembaban = "+getKelembaban());
        System.out.println("Suhu = "+getSuhu());
    }
}
