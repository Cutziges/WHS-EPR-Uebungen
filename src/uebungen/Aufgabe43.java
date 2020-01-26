package uebungen;

/**
 * Wurzel Prüfung.
 * @author Sarah Grugiel
 */
public class Aufgabe43 {
    /**
     * Diese Methode prüft, ob die erste Zahl die Wurzel der zweiten Zahl ist.
     * @param a Wert, bei dem geprüft werden soll, ob es die Wurzel ist
     * @param b Der zu untersuchende Wert
     * @return Gibt an, ob der Wert die Wurzel ist, oder nicht
     */
    public static boolean istWurzel(int a, long b){
        return b == (a * a);
    }
    
    /**
     * Ausgabe.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.println(istWurzel(8,64));
    }
    
}
