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
abstract public class kebersihankelassetGet {
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

    
    abstract void inputan();
    abstract void outputan();
    
    
}
