
package uebungen;

/**
 *
 * @author sarantel
 */
public class Aufgabe44 {
    /**
     * Methode zur Erhöhung eines Betrages um einen Prozentsatz.
     * @param a Betrag
     * @param b Prozentsatz, um den der Betrag erhöht werden soll
     * @return Rückgabe des neuen Betrags
     */
    public static float erhoeheBetrag(float a, int b) {
        // Berechneter Zinssatz
        float zins = (b * a) / 100;
        // Berechneter Zinswert: Betrag + Zinssatz
        float zinswert = a + zins;
        
        // Aufrundungshilfsvariable, die anschließend kürzt durch int-Parsing
        // Beispiel: 15,34567 = 1535,067 wird durch (int) = 1535
        int aufrunden = (int) (100 * zinswert + 0.5);
        // Verschiebung des Kommas auf die richtige Stelle
        // Beispiel: 1535 = 15,35
        float ergebnis = (float) aufrunden / 100;
        
        return ergebnis;
    }
    
    /**
     * Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.println(erhoeheBetrag(8.532f, 64));
    }
}
