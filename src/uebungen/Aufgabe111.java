
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe111 {
    /**
     * Methode zum rotieren von Arrayinhalten.
     * @param array Übergebenes Array
     * @param n Rotierungsschritte
     */
    public static void rotiere(int[] array, int n) {
        int[] hilfs = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            int j = (i + n) % hilfs.length;
            hilfs[j] = array[i];
        }
        
        for (int j = 0; j < hilfs.length; j++) {
            System.out.print(hilfs[j] + " ");
        }
    }
    
    /**
     * Methode zur Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        int[] array = {7, 4, 2, 5, 10, -3, 19};
        
        rotiere(array, 3);
    }
}
