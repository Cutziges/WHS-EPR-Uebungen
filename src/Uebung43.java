/**
 * Prüfung von Wurzeln.
 * @author Sarah Grugiel
 */
public class Uebung43 {
    /**
     * Diese Methode prüft, ob die erste Zahl die Wurzel der zweiten Zahl ist.
     * @param a Wert, bei dem geprüft werden soll, ob es die Wurzel ist
     * @param b Der zu untersuchende Wert
     * @return Gibt an, ob der Wert die Wurzel ist, oder nicht
     */
    public static boolean istWurzel(int a, long b) {
        return (Math.sqrt(b) == a); 
    }
    
    /**
     * Ausgabe des Ergebnisses - wenn die eingegebene Zahl die Wurzel der
     * zweiten Zahl ist, dann liefert das Ergebnis 'true'.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.print(istWurzel(7, 49));
    }
    
}
