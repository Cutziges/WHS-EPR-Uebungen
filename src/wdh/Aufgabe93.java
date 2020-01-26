
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe93 {
    public static boolean istAbsteigend(int zahl) {
        boolean absteigend = true;
        
        while (zahl > 10) {
            if (!(zahl % 10 <= zahl / 10 % 10)) {
                absteigend = false;
            }
            zahl = zahl / 10;
        }
        
        return absteigend;
    }
    
    
    public static void main(String[] args) {
        System.out.println(istAbsteigend(123456789));
        System.out.println(istAbsteigend(876554321));
        System.out.println(istAbsteigend(654821));
        System.out.println(istAbsteigend(98701));
        System.out.println(istAbsteigend(9877654));
        System.out.println(istAbsteigend(97340));
    }
}
