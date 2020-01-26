
package wdh4;

/**
 *
 * @author sarantel
 */
public class Aufgabe111 {
    public static void rotiere(int[] array, int n) {
        int laenge = array.length;
        int[] ergebnis = new int[laenge];
        
        for (int i = 0; i < laenge; i++) {
            int verschiebung = (i + n) % laenge;
            
            ergebnis[verschiebung] = array[i];
        }
        
        for (int i = 0; i < laenge; i++) {
            System.out.print(ergebnis[i] + " ");
        }
    }
    
    
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        
        rotiere(a1, 2);
    }
}
