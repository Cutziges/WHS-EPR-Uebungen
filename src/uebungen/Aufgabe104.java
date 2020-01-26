
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe104 {
    /**
     * Methode zur Überprüfung ob erster String größer als zweiter String ist.
     * @param s1 erster String
     * @param s2 zweiter String
     * @return Ergebnis
     */
    public static boolean istGroesser(String s1, String s2) {
        int i = 0;
        
        while (i < s1.length() && s1.charAt(i) > s2.charAt(i)) {
            i++;
        }
        
        return i == s1.length();
    }
    
    
    /**
     * Methode zur Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.println(istGroesser("1234", "1233"));
        System.out.println(istGroesser("4321", "1234"));
        System.out.println(istGroesser("5678", "4320"));
        System.out.println(istGroesser("ZZZZ", "AAAA"));
    }
}
