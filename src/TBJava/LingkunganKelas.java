/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TBJava;

/**
 *
 * @author Danang
 */

import java.util.Scanner;

public class LingkunganKelas extends RuangKelas{
    
    Scanner sob = new Scanner(System.in);
    
    private String kondisilantai;
    private String kondisidinding;
    private String kondisiatap;
    private String kondisipintu;
    private String kondisijendela;
    
    
    
    public String getKondisilantai() {
        return kondisilantai;
    }

    public void setKondisilantai(String kondisilantai) {
        this.kondisilantai = kondisilantai;
        //String kondlantai = scan.nextLine();
		if("Bersih".equals(kondisilantai) || "bersih".equals(kondisilantai))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondisilantai) || "kotor".equals(kondisilantai))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisidinding() {
        return kondisidinding;
    }

    public void setKondisidinding(String kondisidinding) {
        this.kondisidinding = kondisidinding;
        //String konddinding = scan.nextLine();
		if("Bersih".equals(kondisidinding) || "bersih".equals(kondisidinding))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondisidinding) || "kotor".equals(kondisidinding))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisiatap() {
        return kondisiatap;
    }

    public void setKondisiatap(String kondisiatap) {
        this.kondisiatap = kondisiatap;
        //String kondatap = scan.nextLine();
		if("Bersih".equals(kondisiatap) || "bersih".equals(kondisiatap))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondisiatap) || "kotor".equals(kondisiatap))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisipintu() {
        return kondisipintu;
    }

    public void setKondisipintu(String kondisipintu) {
        this.kondisipintu = kondisipintu;
        //String kondpintu = scan.nextLine();
		if("Bersih".equals(kondisipintu) || "bersih".equals(kondisipintu))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondisipintu) || "kotor".equals(kondisipintu))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisijendela() {
        return kondisijendela;
    }

    public void setKondisijendela(String kondisijendela) {
        this.kondisijendela = kondisijendela;
        //String kondjendela = scan.nextLine();
		if("Bersih".equals(kondisijendela) || "bersih".equals(kondisijendela))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondisijendela) || "kotor".equals(kondisijendela))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }
    
    
    
    
    //public void lingkungan(){
    //@Override
            
    public void inputan(){
        System.out.println("Kondisi lantai (bersih/kotor) = ");
        String ab = sob.nextLine();
        setKondisilantai(ab);
                
        System.out.println("Kondisi dinding (bersih/kotor) = ");
        String cd = sob.nextLine();
        setKondisidinding(cd);
                
        System.out.println("Kondisi atab (bersih/kotor) = ");
        String ef = sob.nextLine();
        setKondisiatap(ef);
        
        System.out.println("Kondisi Pintu (bersih/kotor) = ");
        String gh = sob.nextLine();
        setKondisipintu(gh);
        
        System.out.println("Kondisi jendela (baik/buruk) = ");
        String ij = sob.nextLine();
        setKondisijendela(ij);
        
    }
    
        public void outputan(){
        System.out.println("\nLantai = "+getKondisilantai());
        System.out.println("Dinding = "+getKondisidinding());
        System.out.println("Atap = "+getKondisiatap());
        System.out.println("Pintu = "+getKondisipintu());
        System.out.println("Jendela = "+getKondisijendela());
    }
}
