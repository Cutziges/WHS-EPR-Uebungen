
package wdh4;

/**
 *
 * @author sarantel
 */
public class Aufgabe62 {
    public static long dreheUm(long zahl) {
        return umdrehen(0, zahl);
    }
    
    public static long umdrehen(long ergebnis, long zahl) {
        return zahl < 10
                ? 10 * ergebnis + zahl % 10
                : umdrehen(10 * ergebnis + zahl % 10, zahl / 10);
    }
    
    public static void main(String[] args) {
        System.out.println(dreheUm(7331));
    }
}
