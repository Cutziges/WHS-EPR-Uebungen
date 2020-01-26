
package wdh3;

/**
 *
 * @author sarantel
 */
public class Aufgabe94 {
    
    public static boolean istPalindrom(String text) {
        boolean palindrom = true;
        int i = 0;
        
        while (i < text.length()) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                palindrom = false;
            }
            
            i++;
        }
        
        return palindrom;
    }
    
    public static void main(String[] args) {
        System.out.println(istPalindrom("HannaH"));
        System.out.println(istPalindrom("Sarah"));
        System.out.println(istPalindrom("HloeH"));
    }
}
