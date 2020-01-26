
package wdh3;

/**
 *
 * @author sarantel
 */
public class Zahlenspielerei {
    public static long filter(long zahl, int ziffer) {
        return zahl < 10
                ? zahl == ziffer
                    ? 0
                    : zahl
                : zahl % 10 == ziffer
                    ? filter(zahl / 10, ziffer)
                    : 10 * (filter(zahl / 10, ziffer)) + zahl % 10;
    }
    
    
    public static void main(String[] args) {
        System.out.println(filter(1337, 3));
        System.out.println(filter(1337, 0));
        System.out.println(filter(1, 3));
    }
}
