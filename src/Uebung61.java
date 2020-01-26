/**
 *
 * @author Sarah Grugiel
 */
public class Uebung61 {

    static boolean istAufsteigend(int eingabe) {
        // Übergabe der Eingabe
        int zahl = eingabe;
        
        // Eingabezahl für While-Schleife, die 0 wird
        int zahl2 = eingabe; 
        
        // Zähler für Anzahl der Ziffern um diese dem Array zu übergeben
        int anzStellen = 0;
        
        // Einzelne Ziffer der ganzen Zahl
        int restWert;
        
        // 
        boolean istAufsteigend = true;

        // Berechnung der Array-Größe
        while (zahl2 != 0) {
            zahl2 = zahl2 / 10;
            anzStellen++;
        }

        // Array zur Speicherung der einzelnen Ziffern
        int[] speicher = new int[anzStellen];

        // Einfügen der Ziffern in das Array
        while (zahl != 0) {
            for (int i = anzStellen - 1; i >= 0; i--) {
                restWert = zahl % 10;
                speicher[i] = restWert;
                zahl = zahl / 10;
            }
        }

        // Vergleich der Ziffern
        for (int i = 0; i < anzStellen - 1; i++) {
            if (speicher[i] > speicher[i + 1]) {
                istAufsteigend = false;
            }
        }
        return istAufsteigend;
    }

    // System.out.println(Arrays.toString(speicher));
    // return true;
    
    /**
     * Main Methode für die Ausgabe, ob true oder false.
     * @param args argumente
     */
    public static void main(String[] args) {
        System.out.print(istAufsteigend(1144435));
    }
}