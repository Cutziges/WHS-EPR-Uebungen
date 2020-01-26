
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe103 {
    /**
     * Methode zur Überprüfung, ob übergebener String eine Ziffer enthält.
     * @param s Übergebener String
     * @return Rückgabe
     */
    public static boolean enthaeltZiffer(String s) {
        int i = 0;
        
        while (i < s.length() && (s.charAt(i) > '9' || s.charAt(i) < '0')) {
            i++;
        }
        
        return i != s.length();
    }
    
    
    /**
     * Methode zur Überprüfung, ob übergebener String eine Ziffer enthält.
     * @param s Übergebener String
     * @return Rückgabe
     */
    public static boolean enthaeltZiffer2(String s) {
        int i = 0;
        boolean enthaeltZiffer = false;
        
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                enthaeltZiffer = true;
            }
            i++;
        }
        
        return enthaeltZiffer;
    }
    
    /**
     * Methode zur Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    
    public static void main(String[] args) {
        String test = "Test";
        String test2 = "Te5t";
        String test3 = "Dies ist ein Test!";
        String test4 = "Dies ist 1 weiterer Test";
        String test5 = "Dies ist der lätzte Test";
        
        System.out.println("Keine: " + enthaeltZiffer(test));
        System.out.println("Ziffer: " + enthaeltZiffer(test2));
        System.out.println("Keine: " + enthaeltZiffer(test3));
        System.out.println("Ziffer: " + enthaeltZiffer(test4));
        System.out.println("Keine: " + enthaeltZiffer(test5));
        System.out.println();
        System.out.println("Keine: " + enthaeltZiffer2(test));
        System.out.println("Ziffer: " + enthaeltZiffer2(test2));
        System.out.println("Keine: " + enthaeltZiffer2(test3));
        System.out.println("Ziffer: " + enthaeltZiffer2(test4));
        System.out.println("Keine: " + enthaeltZiffer2(test5));
    }
}
