
package uebungen;

/**
 *
 * @author sarantel
 */
public class Praktikum4 {
    /**
     * Diese Methode berechnet den günstigsten Preis für den jeweiligen
     * Jahresverbrauch des Haushalts, gemessen an zwei verschiedenen Tarifen.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        // Jahresverbrauch in kWh
        int jv = 3536;
        // Grundpreise von Tarif 1 und 2 im Jahr
        double gp1 = 5.75 * 12;
        double gp2 = 9.85 * 12;
        // Verbrauchspreise von Tarif 1 und 2
        double vp1 = 23.49 / 100;
        double vp2 = 22.10 / 100;

        // Tarif 1
        double tarif1 = gp1 + (vp1 * jv);
        // Aufrundungsfunktion, die anschließend kürzt durch int-Parsing
        // Beispiel: 15,34567 = 1535,067 wird durch (int) = 1535
        int aufrunden1 = (int) (100 * tarif1 + 0.5);
        // Verschiebung des Kommas auf die richtige Stelle
        // Beispiel: 1535 = 15,35
        double ergebnis1 = (double) aufrunden1 / 100;


        // Tarif 2
        double tarif2 = gp2 + (vp2 * jv);
        // Aufrundungsfunktion, die anschließend kürzt durch int-Parsing
        // Beispiel: 15,34567 = 1535,067 wird durch (int) = 1535
        int aufrunden2 = (int) (100 * tarif2 + 0.5);
        // Verschiebung des Kommas auf die richtige Stelle
        // Beispiel: 1535 = 15,35
        double ergebnis2 = (double) aufrunden2 / 100;

        // Berechneter preis
        double vergleich = jv < 3540
                ? ergebnis1
                : ergebnis2;
        
        System.out.println(vergleich);
    }
    
}
