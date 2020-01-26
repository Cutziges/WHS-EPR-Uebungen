
package wdh4;

/**
 *
 * @author sarantel
 */
public class Aufgabe61 {
    public static boolean istAufsteigend(int zahl) {
        return zahl < 10 
                ? true
                : zahl % 10 > zahl / 10 % 10
                    ? istAufsteigend(zahl / 10)
                    : false;
    }
    
    public static void main(String[] args) {
        System.out.println(istAufsteigend(123));
        System.out.println(istAufsteigend(321));
        System.out.println(istAufsteigend(1231));
        System.out.println(istAufsteigend(1));
    }
    
}
