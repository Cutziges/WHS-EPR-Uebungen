
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe64 {
    public static long sortiere(long zahl) {
        return mische(0, zahl);
    }
    
    public static long mische(long ergebnis, long n) {
        return n < 10
                ? n
                : mische(13,37);
    }
    
        public static void main(String[] args) {
        System.out.println(sortiere(13542));
        System.out.println(sortiere(1337));
        System.out.println(sortiere(504030209));
    }
}
