
package wdh3;

/**
 *
 * @author sarantel
 */
public class Aufgabe91 {
    public static int quersumme(int zahl) {
        int ergebnis = 0;
        
        while (zahl > 0) {
            ergebnis = ergebnis + zahl % 10;
            zahl = zahl / 10;
        }
        
        return ergebnis;
    }
    
    
    public static void main(String[] args) {
        System.out.println(quersumme(123));
    }
}
