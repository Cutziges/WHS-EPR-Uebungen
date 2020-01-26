
package wdh3;

/**
 *
 * @author sarantel
 */
public class Aufgabe61 {
    public static boolean istAufsteigend(int zahl) {
        boolean aufsteigend = true;
        
        while (zahl > 0) {
            if (zahl % 10 < zahl / 10 % 10) {
                aufsteigend = false;
            }
            
            zahl = zahl / 10;
        }
        
        return aufsteigend;
    }
 
    
    public static void main(String[] args) {
        System.out.println(istAufsteigend(123));
        System.out.println(istAufsteigend(321));
        System.out.println(istAufsteigend(1));
        System.out.println(istAufsteigend(113256));
    }
}
