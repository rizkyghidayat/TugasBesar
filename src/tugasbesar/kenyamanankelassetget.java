/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author AHO
 */
public class kenyamanankelassetget {
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


    
    
}
