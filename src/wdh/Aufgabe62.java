
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe62 {
    public static long dreheUm(long n) {
        return abschneiden(0, n);
    }
    
    public static long abschneiden(long ergebnis, long n) {
        return n < 10
                ? ergebnis * 10 + n
                : abschneiden(ergebnis * 10 + n % 10, n / 10);
    }
    
    public static void main(String[] args) {
        System.out.println(dreheUm(123456));
        System.out.println(dreheUm(1337));
        System.out.println(dreheUm(987654321));
    }
}
