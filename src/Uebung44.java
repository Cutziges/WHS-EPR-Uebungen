/**
 * Klasse zur Erhöhung eines Betrages um einen bestimmten Prozentsatz.
 * @author Sarah Grugiel
 */

public class Uebung44 {
    /**
     * Berechnung des neuen Zinswertes, welche auf zwei Nachkommastellen
     * gerundet ausgegeben wird.
     * @param a Betrag
     * @param b Prozentsatz
     * @return Gibt den erhöhten Wert zurück
     */
    public static float erhoeheBetrag(float a, int b) {
        // Berechneter Zinssatz
        float zins = (b * a) / 100;
        // Berechneter Zinswert: Betrag + Zinssatz
        float zinswert = a + zins;
        // Ergebnis: Auf zwei Nachkommastellen gerundeter Zinswert
        float ergebnis = (Math.round(zinswert * 100) / 100.0F);

        return ergebnis;
    }
    
   /**
    * Ausgabe des neuen Betrags.
    * @param args wird nicht genutzt
    */
    public static void main(String[] args) {
        System.out.print("Der neue Wert lautet: " + erhoeheBetrag(150.80F, 19));
    }

    
}
