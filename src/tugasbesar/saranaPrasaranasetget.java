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
public class saranaPrasaranasetget {
    private int jumlahsteker;
    private String kondisisteker;
    private String posisisteker;
    private int jumlahkabellcd;
    private String kondisikabellcd;
    private String posisikabellcd;
    private int jumlahlampu;
    private String kondisilampu;
    private String posisilampu;
    private int jumlahkipasangin;
    private String kondisikipasangin;
    private String posisikipasangin;
    private int jumlahac;
    private String kondisiac;
    private String posisiac;
    private String pilihssid;
    private String bandwidth;
    private String login;
    private int jumlahcctv;
    private String kondisicctv;
    private String posisicctv;
    Scanner sken = new Scanner(System.in);

    public int getJumlahsteker() {
        return jumlahsteker;
    }

    public void setJumlahsteker(int jumlahsteker) {
        this.jumlahsteker = jumlahsteker;
    }

    public String getKondisisteker() {
        return kondisisteker;
    }

    public void setKondisisteker(String kondisisteker) {
        this.kondisisteker = kondisisteker;
		if("Baik".equals(kondisisteker) || "baik".equals(kondisisteker))
			this.kondisisteker="sesuai";
		else if("Tidak baik".equals(kondisisteker) || "tidak baik".equals(kondisisteker))
			this.kondisisteker="tidak sesuai";
		else 
			this.kondisisteker="inputan salah";
    }

    public String getPosisisteker() {
        return posisisteker;
    }

    public void setPosisisteker(String posisisteker) {
        this.posisisteker = posisisteker;
        if("Dipojok ruang".equals(posisisteker) || "Dekat dosen".equals(posisisteker) || "dipojok ruang".equals(posisisteker) || "dekat dosen".equals(posisisteker))
			this.posisisteker="sesuai";
		else 
			this.posisisteker="tidak sesuai";
    }

    public int getJumlahkabellcd() {
        return jumlahkabellcd;
    }

    public void setJumlahkabellcd(int jumlahkabellcd) {
        this.jumlahkabellcd = jumlahkabellcd;
    }

    

    public String getKondisikabellcd() {
        return kondisikabellcd;
    }

    public void setKondisikabellcd(String kondisikabellcd) {
        this.kondisikabellcd = kondisikabellcd;
        if("Berfungsi".equals(kondisikabellcd) || "berfungsi".equals(kondisikabellcd))
			this.kondisikabellcd="sesuai";
		else if("Tidak berfungsi".equals(kondisikabellcd) || "tidak befungsi".equals(kondisikabellcd))
			this.kondisikabellcd="tidak sesuai";
		else 
			this.kondisikabellcd="inputan salah";
    }

    public String getPosisikabellcd() {
        return posisikabellcd;
    }

    public void setPosisikabellcd(String posisikabellcd) {
        this.posisikabellcd = posisikabellcd;
        if("Dekat dosen".equals(posisikabellcd) || "dekat dosen".equals(posisikabellcd) || "Pojok ruang".equals(posisikabellcd) ||"pojok ruang".equals(posisikabellcd))
			this.posisikabellcd="sesuai";
		else 
			this.posisikabellcd="tidak sesuai";
    }

    public int getJumlahlampu() {
        return jumlahlampu;
    }

    public void setJumlahlampu(int jumlahlampu) {
        this.jumlahlampu = jumlahlampu;
    }

    public String getKondisilampu() {
        return kondisilampu;
    }

    public void setKondisilampu(String kondisilampu) {
        this.kondisilampu = kondisilampu;
        if("Baik".equals(kondisilampu) || "baik".equals(kondisilampu))
			this.kondisilampu="sesuai";
		else if("Tidak baik".equals(kondisilampu) || "tidak baik".equals(kondisilampu))
			this.kondisilampu="tidak sesuai";
		else 
			this.kondisilampu="inputan salah";
    }

    public String getPosisilampu() {
        return posisilampu;
    }

    public void setPosisilampu(String posisilampu) {
        this.posisilampu = posisilampu;
         if("Atap ruang".equals(posisilampu) || "atap ruang".equals(posisilampu))
			this.posisilampu="sesuai";
		else 
			this.posisilampu="tidak sesuai";
        
    }

    public int getJumlahkipasangin() {
        return jumlahkipasangin;
    }

    public void setJumlahkipasangin(int jumlahkipasangin) {
        this.jumlahkipasangin = jumlahkipasangin;
    }

    public String getKondisikipasangin() {
        return kondisikipasangin;
    }

    public void setKondisikipasangin(String kondisikipasangin) {
        this.kondisikipasangin = kondisikipasangin;
        if("Baik".equals(kondisikipasangin) || "baik".equals(kondisikipasangin))
			this.kondisikipasangin="sesuai";
		else if("Tidak baik".equals(kondisikipasangin) || "tidak baik".equals(kondisikipasangin))
			this.kondisikipasangin="tidak sesuai";
		else 
			this.kondisikipasangin="inputan salah";
    }

    public String getPosisikipasangin() {
        return posisikipasangin;
    }

    public void setPosisikipasangin(String posisikipasangin) {
        this.posisikipasangin = posisikipasangin;
        if("Atap ruang".equals(posisikipasangin) || "atap ruang".equals(posisikipasangin))
			this.posisikipasangin="sesuai";
		else 
			this.posisikipasangin="tidak sesuai";
    }

    public int getJumlahac() {
        return jumlahac;
    }

    public void setJumlahac(int jumlahac) {
        this.jumlahac = jumlahac;
    }

    public String getKondisiac() {
        return kondisiac;
    }

    public void setKondisiac(String kondisiac) {
        this.kondisiac = kondisiac;
        if("Baik".equals(kondisiac) || "baik".equals(kondisiac))
			this.kondisiac="sesuai";
		else if("Tidak baik".equals(kondisiac) || "tidak baik".equals(kondisiac))
			this.kondisiac="tidak sesuai";
		else 
			this.kondisiac="inputan salah";
    }

    public String getPosisiac() {
        return posisiac;
    }

    public void setPosisiac(String posisiac) {
        this.posisiac = posisiac;
         if("Dibelakang".equals(posisiac) || "dibelakang".equals(posisiac) || "Disamping".equals(posisiac) || "disamping".equals(posisiac))
			this.posisiac="sesuai";
		else 
			this.posisiac="tidak sesuai";
    }

    public String getPilihssid() {
        return pilihssid;
    }

    public void setPilihssid(String pilihssid) {
        this.pilihssid = pilihssid;
        if("UMM hotspot".equals(pilihssid) || "umm hotspot".equals(pilihssid))
			this.pilihssid="sesuai";
		else 
			this.pilihssid="tidak sesuai";
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
        if ("bisa".equals(login) || "Bisa".equals(login))
            this.login="sesuai";
        else
            this.login="tidak sesuai";
    }
    
    public int getJumlahcctv() {
        return jumlahcctv;
    }

    public void setJumlahcctv(int jumlahcctv) {
        this.jumlahcctv = jumlahcctv;
    }

    public String getKondisicctv() {
        return kondisicctv;
    }

    public void setKondisicctv(String kondisicctv) {
        this.kondisicctv = kondisicctv;
        if("Baik".equals(kondisicctv) || "baik".equals(kondisicctv))
			this.kondisicctv="sesuai";
		else if("Tidak baik".equals(kondisicctv) || "tidak baik".equals(kondisicctv))
			this.kondisicctv="tidak sesuai";
		else 
			this.kondisicctv="inputan salah";
    }

    public String getPosisicctv() {
        return posisicctv;
    }

    public void setPosisicctv(String posisicctv) {
        this.posisicctv = posisicctv;
        if("Belakang".equals(posisicctv) || "belakang".equals(posisicctv) || "depan".equals(posisicctv) || "Depan".equals(posisicctv))
			this.posisicctv="sesuai";
		else 
			this.posisicctv="tidak sesuai";
    }
    
    
    
}
