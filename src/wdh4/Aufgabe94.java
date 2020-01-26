
package wdh4;

/**
 *
 * @author sarantel
 */
public class Aufgabe94 {
    public static boolean istPalindrom(String text) {
        int i = 0;
        boolean palindrom = true;
        
        while (i < text.length()) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                palindrom = false;
            }
            
            i++;
        }
        return palindrom;
    }
    
    
    public static void main(String[] args) {
        System.out.println(istPalindrom("Anna"));
        System.out.println(istPalindrom("AnnA"));
        System.out.println(istPalindrom("AnIna"));
    }
}
