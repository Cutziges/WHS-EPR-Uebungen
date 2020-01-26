
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe61 {
    public static boolean istAufsteigend(int zahl) {
        int hilfs = zahl % 10;
        
        return zahl > 10
                ? ((hilfs) >= zahl / 10 % 10)
                    ? istAufsteigend(zahl / 10)
                    : false
                :true;
    }
    
    public static void main(String[] args) {
        System.out.println(istAufsteigend(12345));
        System.out.println(istAufsteigend(54321));
        System.out.println(istAufsteigend(1144478));
        System.out.println(istAufsteigend(1144438));
        System.out.println(istAufsteigend(4));
    }
}
