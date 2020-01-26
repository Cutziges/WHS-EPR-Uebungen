
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Praktikum6 {
    /**
     * Nicht die eleganteste Lösung zum Verketten.
     * @param a Zahl am Anfang
     * @param b Verkettete Zahl
     * @return Krasser Shit
     */
    public static long verkette(long a, long b) {
        return b > -1 && b < 0.5
                ? verkette(a * 10, -1)
                : b == -1
                    ? a
                    : b < 10
                        ? verkette((a * 10) + b, -1)
                        : b < 100
                            ? verkette((a * 10) + (b / 10), b % 10)
                            : b < 1000
                                ? verkette((a * 10) + (b / 100), b % 100)
                                : verkette((a * 10) + (b / 1000), b % 1000);
    }
    
    /**
     * Überprüft ob übergebene Zahl in Ziffernfolge enthalten ist.
     * @param a ZIffernfolge
     * @param b übergebene Zahl
     * @return Wahrheitswert, ob enthalten oder nicht
     */
    public static boolean enthaelt(long a, int b) {
        boolean enthalten = false;
        
        return a == 0 && b != 0
                ? enthalten
                : a % 10 == b
                    ? enthalten = true
                    : enthaelt(a / 10, b);
    }
    
     /**
     * Überprüft wie oft übergebene Zahl in Ziffernfolge enthalten ist.
     * @param a Ziffernfolge
     * @param b übergebene Zahl
     * @return Wert wie oft Zahl enthalten ist
     */
    public static int gibAnzahl(long a, int b) {
        int zaehler = 0;
        
        return a == 0
                ? zaehler
                : a % 10 == b
                    ? zaehler++
                    : gibAnzahl(a / 10, b);
    }
    
    /**
     * Filtert die übergebene Ziffer aus der Zahlenfolge heraus.
     * @param zahl Zahlenfolge
     * @param ziffer übergebene Ziffer
     * @return Gefilterte Ziffernfolge
     */
    public static long filter(long zahl, int ziffer) {
        return zahl < 10
                ? zahl == ziffer
                    ? 0
                    : zahl
                : (zahl % 10 == ziffer)
                    ? filter((zahl / 10), ziffer)
                    : 10 * filter((zahl / 10), ziffer) + (zahl % 10);
    }
    
    /**
     * Methode zur Ausgabe.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.println(filter(13232, 3));
        System.out.println(filter(3333, 3));
        System.out.println(filter(1332, 4));
        System.out.println(filter(1000, 0));
        System.out.println(filter(1, 1));
        System.out.println(filter(0, 0));
        System.out.println(filter(0, 5));
        /*
        System.out.println(gibAnzahl(4711, 1));
        System.out.println(enthaelt(4711, 1));
        System.out.println(enthaelt(4711, 2));
        System.out.println(enthaelt(789, 9));
        System.out.println(enthaelt(0, 0));
        System.out.println(verkette(4711, 1));
        System.out.println(verkette(521, 0));
        System.out.println(verkette(521, 1320));
        System.out.println(verkette(0, 521));
        System.out.println(verkette(0, 0));
*/
    }
}
