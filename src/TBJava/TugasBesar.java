/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TBJava;

/**
 *
 * @author AHO
 */
public class TugasBesar {
    
    
   /* public TugasBesar(){
        super.kondisi();
        System.out.println("kfgnsdkfjgs");
        kondisi();
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TugasBesar m = new TugasBesar();
        // TODO code application logic here
        kondisikelas ting = new kondisikelas();
        saranaPrasarana tong = new saranaPrasarana();
        LingkunganKelas teng = new LingkunganKelas();
        kebersihanKelas tang = new kebersihanKelas();
        kenyamananKelas tung = new kenyamananKelas();
        keamananKelas zonk = new keamananKelas();
        
        ting.kondisi();
        tong.sarana();
        teng.lingkungan();
        tang.kebersihan();
        tung.kenyamanan();
        zonk.keamanan();
        
        ting.hasilkondisi();
        tong.hasil();
        teng.hasillingkungan();
        tang.hasilkebersihan();
        tung.hasilkenyamanan();
        zonk.keamanan();  
    }
    //@Override
    /*public void kondisi(){
        System.out.println("sadsasdcgsdrgsd");
    }*/
}
