
package whd2;

/**
 *
 * @author sarantel
 */
public class Aufgabe94 {
    public static boolean istPalindrom(String text) {
        boolean palindrom = true;
        int laenge = text.length();
        
        for (int i = 0; i < laenge; i++) {
            if (text.charAt(i) != text.charAt(laenge - i - 1)) {
                palindrom = false;
            }
        }
        
        return palindrom;
    }
    
    
    public static void main(String[] args) {
        System.out.println(istPalindrom("Anna"));
        System.out.println(istPalindrom("AnnA"));
        System.out.println(istPalindrom("Sarah"));
    }
}
