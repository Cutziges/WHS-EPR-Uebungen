
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe93 {
    
    public static boolean istAbsteigend(int zahl) {
        boolean absteigend = true;
        
        while (zahl > 10) {
            if (!((zahl / 10 % 10) <= (zahl % 10))) {
                absteigend = false;
            }
            zahl = zahl / 10;
        }
        return absteigend;
    }
    
    /**
     * Methode zur Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    
    public static void main(String[] args) {
        System.out.println(istAbsteigend(10));
        System.out.println(istAbsteigend(123));
        System.out.println(istAbsteigend(321));
        System.out.println(istAbsteigend(8342));
    }
}
