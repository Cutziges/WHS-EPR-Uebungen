
package uebungen;

/**
 *
 * @author sarantel
 */
public class Aufgabe94 {
    
    /**
     * Überprüft, ob der übergebene String ein Palindrom ist.
     * @param text übergebener String
     * @return Rückgabe
     */
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
    
    
    /**
     * Methode zur Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    
    public static void main(String[] args) {
        System.out.println(istPalindrom("anna"));
        System.out.println(istPalindrom("oma"));
        System.out.println(istPalindrom("tacocat"));
    }
}
