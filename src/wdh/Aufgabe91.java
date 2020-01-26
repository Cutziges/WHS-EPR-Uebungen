
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe91 {
    public static int quersumme(int zahl) {
        int ergebnis = 0;
        
        while (zahl != 0) {
            int hilfs = zahl % 10;
            ergebnis = ergebnis + hilfs;
            zahl = zahl / 10;
        }
        
        return ergebnis;
    }
    
    public static void main(String[] args) {
        System.out.println(quersumme(12345));
        System.out.println(quersumme(123));
        System.out.println(quersumme(50043));
        
    }
    
}
