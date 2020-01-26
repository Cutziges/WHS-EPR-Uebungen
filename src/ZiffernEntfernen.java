/**
 *
 * @author Sarah Grugiel
 */
public class ZiffernEntfernen {
    
    /**
     * Entfernt aus einer übergebenen Zahl die ungeraden Ziffern und gibt die
     * gekürzte Zahl wieder zurück.
     * @param a Übergebene Zahl
     * @return Zahl ohne ungerade Ziffern
     */
    public static int entferneUngeradeZiffern(int a) {
        int anzahl = 0;
        int schleife = a;
        
        // Schleife zur Errechnung der Array-Größe
        // Berechnet dazu die Anzahl der geraden Ziffern
        while (schleife != 0) {
            if (schleife % 2 == 0) {
                anzahl++;
                schleife = schleife / 10;
            } else {
                schleife = schleife / 10;
            }
        }
        
        // Array zur Speicherung der geraden Ziffern
        int[] gerade = new int[anzahl];
        
        // Füllt das Array mit den geraden Ziffern
        while (a != 0) {
            for (int i = 0; i < anzahl; i++) {
                if (a % 2 == 0) {
                    for (int j = anzahl - 1; j >= 0; j--) {
                        int c = a % 10;
                        gerade[j] = c;
                        a = (a / 10);
                    }
                } else {
                    a = (a / 10);
                }
            }
        }
        
        // Variable zur Speicherung der neuen Zahl ohne ungerade Ziffern
        int geradeZahl = 0;
        
        // Übergabe der geraden Zahlen aus dem Array an die Variable
        for (int i = 0; i < gerade.length; i++) {
            geradeZahl = geradeZahl * 10 + gerade[i];
        }
        
        // Rückgabe der Zahl ohne ungerade Ziffern
        return geradeZahl;
    }
    
    /**
     * Methode zur Ausgabe der Zahl.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        int zahl = 14267;
        
        System.out.println("Eingegebene Zahl " + zahl + " ohne ungerade Ziffern: " 
                + entferneUngeradeZiffern(zahl));
    }
    
}