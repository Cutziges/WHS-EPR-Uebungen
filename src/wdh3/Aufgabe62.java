
package wdh3;

/**
 *
 * @author sarantel
 */
public class Aufgabe62 {
    public static long dreheUm(long zahl) {
        return umkehren(0, zahl);
    }
    
    
    public static long umkehren(long ergebnis, long zahl) {
        return zahl < 10
                ? ergebnis * 10 + zahl
                : umkehren(ergebnis * 10 + zahl % 10, zahl / 10);
    }
    
    
    public static void main(String[] args) {
        System.out.println(dreheUm(7331));
        System.out.println(dreheUm(1));
        System.out.println(dreheUm(321));
    }
}
