/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.Scanner;

/**
 *
 * @author AHO
 */
public class keamananKelas{
    keamanankelassetGet dp = new keamanankelassetGet();
    Scanner pd = new Scanner(System.in);
    
    public void keamanan(){
        System.out.println("\nKekokohan = ");
        dp.setKekokohan(pd.nextLine());
    }
    
    public void hasilkeamanan(){
        System.out.println("\nKekokohan = "+dp.getKekokohan());
    }
}
