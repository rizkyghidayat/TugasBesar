/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TBJava;

/**
 *
 * @author Danang
 */
abstract public class keamanankelassetGet {
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
    
    abstract void inputan();
    abstract void outputan();
}
