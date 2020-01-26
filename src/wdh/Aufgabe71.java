
package wdh;

/**
 * Nicht der eigentlichen Aufgabe entsprechend.
 * @author Sarah Grugiel
 */
public class Aufgabe71 {
    public static int anzahlZiffern(int zahl) {
        int zaehler = 0;
        int laenge = berechneLaenge(zahl);
        
        
        if (zahl > 10) {
            // Ermittelt die Länge des Arrays
            int[] liste = new int[laenge];

            // Befüllt das Array
            for (int i = 0; i < laenge; i++) {
                liste[i] = zahl % 10;
                zahl = zahl / 10;
            }

            for (int i = 0; i < laenge; i++) {
                int hilfs = 0;

                // Sortiert die Ziffern im Array der Größe nach
                for (int j = 0; j < liste.length - 1; j++) {
                    if (liste[j] > liste[j + 1]) {
                        hilfs = liste[j];
                        liste[j] = liste[j + 1];
                        liste[j + 1] = hilfs;
                    }
                }
            }

            // Zählt die unterschiedlichen Ziffern
            for (int i = 0; i <= 0; i++) {
                for (int j = 0; j < laenge - 1; j++) {
                    if (liste[j] != liste[j + 1]) {
                        zaehler++;
                    }
                }
            }

            if (liste[laenge - 1] != liste[laenge - 2]) {
                zaehler++;
            }
        } else {
            zaehler = 1;
        }
        
        return zaehler;
    }
    
    public static int berechneLaenge(int zahl) {
        int schleife = zahl;
        int laenge = 1;
        
        for (int i = 0; i < schleife; i++) {
                laenge++;
                schleife = schleife / 10;
            }
        
        return laenge;
    }
    
    public static void main(String[] args) {
        System.out.println(anzahlZiffern(0));
        System.out.println(anzahlZiffern(1));
        System.out.println(anzahlZiffern(1337));
        System.out.println(anzahlZiffern(1234));
        System.out.println(anzahlZiffern(1033));
        System.out.println(anzahlZiffern(273904781));
    }
}
