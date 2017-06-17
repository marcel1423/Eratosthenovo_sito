/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erhartovo_sito;

/**
 *
 * @author mnovak
 */
public class Erhartovo_sito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pole[] = new int[10000000];
        int citac = 0;

        for (int i = 2; i < 10000000; i ++ ) {
          //  System.out.println("pole[i]: " + pole[i]);
            if ( pole[i] == 0) {
                System.out.println("Prvocislo je: " + i);
                citac++;
                for ( int j = 2 *i; j < 10000000; j += i) {
                pole[j] = 1;
            }
            }
           
        }
        System.out.println("Celkem je: " + citac + " prvocisel.");

      
    }
    
}
