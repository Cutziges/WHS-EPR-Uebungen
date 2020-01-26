
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe64 {
    
    public static long sortiere(long a) {
        
        return a < 10
                ? a
                : mische(a, 0);
    }
    
    public static long mische(long a, long b) {
        return (a % 10) < (a / 10)
                ? (a % 100) < (a / 100)
                    ? a
                    : b
                : mische(b, a / 10);
    }
    
    /**
     * Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.println(sortiere(21));
        System.out.println(sortiere(504030209));
        
    }
}
