
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe102 {
     /**
     * Überprüft ob die Zahl ein Ziffernpaar enthaehlt.
     * @param zahl beliebige zahl.
     * @return boolean
     */
    public static boolean enthaeltZiffernpaar(long zahl) {
        while (zahl / 10 % 10 != zahl % 10) {
            zahl = zahl / 10;
        }
        
        return zahl != 0;
    }
    
    /**
     * Überprüft ob die Zahl ein Ziffernpaar enthaehlt.
     * @param zahl beliebige zahl.
     * @return boolean
     */
    public static boolean enthaeltZiffernpaar2(long zahl) {
        boolean enthaeltPaar = false;

        while (zahl != 0) {
            if (zahl / 10 % 10 == zahl % 10) {
                enthaeltPaar = true;
            }
            zahl = zahl / 10;
        }
        return enthaeltPaar;
    }
    
    /**
     * Methode zur Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.println("12345: " + enthaeltZiffernpaar(12345));
        System.out.println("1337: " + enthaeltZiffernpaar(1337));
        System.out.println("743809488: " + enthaeltZiffernpaar(743809488));
        System.out.println("12345: " + enthaeltZiffernpaar2(12345));
        System.out.println("1337: " + enthaeltZiffernpaar2(1337));
        System.out.println("743809488: " + enthaeltZiffernpaar2(743809488));
    }
    
}
