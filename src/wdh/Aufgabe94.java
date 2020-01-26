
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe94 {
    public static boolean istPalindrom(String text) {
        boolean palindrom = true;
        int laenge = text.length();
        String hilfs = "";
        
        for (int i = 0; i < laenge; i++) {
            if (text.charAt(i) != text.charAt(laenge - i - 1)) {
                palindrom = false;
            }
        }
        
        return palindrom;
    }
    
    public static void main(String[] args) {
        System.out.println(istPalindrom("anna"));
        System.out.println(istPalindrom("anno"));
        System.out.println(istPalindrom("tacocat"));
        System.out.println(istPalindrom("Sarah"));
        System.out.println(istPalindrom("otto"));
    }
}
