package tugasbesar;

import java.util.Scanner;

public class LingkunganKelas{
    lingkungankelassetget sid = new lingkungankelassetget();
    Scanner sob = new Scanner(System.in);
    
    public void lingkungan(){
        System.out.println("Kondisi lantai (bersih/kotor) = ");
        sid.setKondisilantai(sob.nextLine());
        System.out.println("Kondisi dinding (bersih/kotor) = ");
        sid.setKondisidinding(sob.nextLine());
        System.out.println("Kondisi atap (bersih/kotor) = ");
        sid.setKondisiatap(sob.nextLine());
        System.out.println("Kondisi pintu (bersih/kotor) = ");
        sid.setKondisipintu(sob.nextLine());
        System.out.println("Kondisi jendela (bersih/kotor) = ");
        sid.setKondisijendela(sob.nextLine());
    }
    
    public void hasillingkungan(){
        System.out.println("\nLantai = "+sid.getKondisilantai());
        System.out.println("Dinding = "+sid.getKondisidinding());
        System.out.println("Atap = "+sid.getKondisiatap());
        System.out.println("Pintu = "+sid.getKondisipintu());
        System.out.println("Jendela = "+sid.getKondisijendela());
    }
}
