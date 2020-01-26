
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe112 {
    /**
     * Methode zum Zusammenfügen und Sortieren von zwei Arrays in einem Array.
     * @param a Array 1
     * @param b Array 2
     * @return Sortiertes und zusammengefügtes Array
     */
    public static int[] mische(int[] a, int[] b) {
        int laenge = a.length + b.length;
        int[] ergebnis = new int[laenge];
        
        for (int i = 0; i < a.length; i++) {
            ergebnis[i] = a[i];
        }
        
        for (int j = 0; j < b.length; j++) {
            ergebnis[j + a.length] = b[j];
        }
        
        for (int j = 0; j < ergebnis.length; j++) {
            for (int i = 0; i < ergebnis.length - 1; i++) {
                if (ergebnis[i] > ergebnis[i + 1]) {
                    int hilfs = ergebnis[i];

                    ergebnis[i] = ergebnis[i + 1];
                    ergebnis[i + 1] = hilfs;
                }
            }
        }
        
        for (int j = 0; j < ergebnis.length; j++) {
            System.out.print(ergebnis[j] + " ");
        }
        
        return ergebnis;
    }
    
    /**
     * Methode zur Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        int[] a = {-10, -5, 0, 2, 2, 3, 7};
        int[] b = {-4, 0, 1, 2, 5, 6};
        
        mische(a, b);
        System.out.println("\n-10 -5 -4 0 0 1 2 2 2 3 5 6 7?");
        System.out.println("Falls ja, dann hast du alles richtig gemacht.");
    }
}
