/**
 * Lösung der Übung 7.1 bei der wir einen Algorithmus entwickeln sollen,
 * welcher die Anzahl der Ziffern zählt.
 * @author Sarah Grugiel
 */
public class Uebung71 {
    
    /**
     * Zählt die Anzahl der Ziffern der Ziffernfolge.
     * @param eingabe Übergebener Wert
     * @return Gibt den Zählwert wieder
     */
    public static int anzahlZiffern(int eingabe) {
        int zahl = eingabe;
        int zahl2 = eingabe;
        int laenge = 0;
        int zaehler = 1;
        
        // Größe des Arrays berechnen
        while (zahl2 != 0) {
            zahl2 = zahl2 / 10;
            laenge++;
        }
        
        // Array und Variable für dessen Länge
        int[] array = new int[laenge];
        int n = array.length;
        
        // Ziffernfolge als einzelne Ziffern an Array übergeben
        while (zahl != 0) {
            for (int i = 0; i < n; i++) {
                int temp = zahl % 10;
                array[i] = temp;
                zahl = zahl / 10;
            }
        }
        
        // Sortiert die Ziffern des Arrays nach ihrer Größe
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        // Vergleicht die Ziffern des Arrays
        for (int i = 0; i < n - 1; i++) {
            // Zählt bei neuer Ziffer hoch
            if (array[i] != array[i + 1]) {
                zaehler++;
            } else {
                // Bleibt konstant bei gleicher Ziffer
                zaehler = zaehler;
            }
        }
        
        // Augabe
        System.out.print("Anzahl der verschiedenen Ziffern: " + zaehler);
        System.out.println();
        return zaehler;
    }
    
    /**
     * Main Methode zum Zählen der Ziffern.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        anzahlZiffern(1213352);
    }
}
