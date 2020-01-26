
package whd2;

/**
 *
 * @author sarantel
 */
public class Aufgabe91 {
    
    /*
    // Rekursive Lösung
    public static int quersumme(int zahl) {
        return zahl < 10
                ? zahl
                : zahl % 10 + quersumme(zahl / 10);
    }
    */
    
    // Lösung ohne Rekursion
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
        System.out.println(quersumme(123));
        System.out.println(quersumme(23));
        System.out.println(quersumme(1));
    }
}
