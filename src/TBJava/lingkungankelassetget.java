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
abstract public class lingkungankelassetget {
    Scanner scan = new Scanner(System.in);
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
        String kondlantai = scan.nextLine();
		if("Bersih".equals(kondlantai) || "bersih".equals(kondlantai))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondlantai) || "kotor".equals(kondlantai))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisidinding() {
        return kondisidinding;
    }

    public void setKondisidinding(String kondisidinding) {
        this.kondisidinding = kondisidinding;
        String konddinding = scan.nextLine();
		if("Bersih".equals(konddinding) || "bersih".equals(konddinding))
			System.out.println("Sesuai");
		else if("Kotor".equals(konddinding) || "kotor".equals(konddinding))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisiatap() {
        return kondisiatap;
    }

    public void setKondisiatap(String kondisiatap) {
        this.kondisiatap = kondisiatap;
        String kondatap = scan.nextLine();
		if("Bersih".equals(kondatap) || "bersih".equals(kondatap))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondatap) || "kotor".equals(kondatap))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisipintu() {
        return kondisipintu;
    }

    public void setKondisipintu(String kondisipintu) {
        this.kondisipintu = kondisipintu;
        String kondpintu = scan.nextLine();
		if("Bersih".equals(kondpintu) || "bersih".equals(kondpintu))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondpintu) || "kotor".equals(kondpintu))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }

    public String getKondisijendela() {
        return kondisijendela;
    }

    public void setKondisijendela(String kondisijendela) {
        this.kondisijendela = kondisijendela;
        String kondjendela = scan.nextLine();
		if("Bersih".equals(kondjendela) || "bersih".equals(kondjendela))
			System.out.println("Sesuai");
		else if("Kotor".equals(kondjendela) || "kotor".equals(kondjendela))
			System.out.println("Tidak Sesuai");
		else 
			System.out.println("Input Salah");
    }
    
    abstract void inputan();
    abstract void outputan();
    
}
