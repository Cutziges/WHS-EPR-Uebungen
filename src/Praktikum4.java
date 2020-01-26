/**
 * Jahresabrechnung für Stromkosten.
 * @author Sarah Grugiel
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
        // Grundpreise pro Jahr in Euro
        double gp1 = 5.75 * 12;
        double gp2 = 9.85 * 12;
        // Verbrauchspreise pro kWh in Euro
        double vp1 = 23.49 / 100;
        double vp2 = 22.10 / 100;
    
        // Da der Grenzwert bei 3539,57kWh liegt, unterscheidet die if-Funktion
        // welcher der beiden Tarife für den jeweiligen Verbrauch der
        // günstigere Tarif ist und berechnet anhand dessen die Kosten
        if (jv < 3540) {
            // Preis von Tarif 1
            double preis = gp1 + (vp1 * jv);
            // Aufrundungsfunktion, die anschließend kürzt durch int-Parsing
            // Beispiel: 15,34567 = 1535,067 wird durch (int) = 1535
            int aufrunden = (int) (100 * preis + 0.5);
            // Verschiebung des Kommas auf die richtige Stelle
            // Beispiel: 1535 = 15,35
            preis = (double) aufrunden / 100;
            // Ausgabe
            System.out.println("Bei einem Jahresverbrauch von " + jv 
                    + "kWh liegt der Preis bei " + preis + "€");            
        } else {
            // Preis von Tarif 2
            double preis = gp2 + (vp2 * jv);
            // Aufrundungsfunktion
            int aufrunden = (int) (100 * preis + 0.5);
            // Verschiebung des Kommas
            preis = (double) aufrunden / 100;
            // Ausgabe
            System.out.println("Bei einem Jahresverbrauch von " + jv
                    + "kWh liegt der Preis bei " + preis + "€");
        }
    }
    
}