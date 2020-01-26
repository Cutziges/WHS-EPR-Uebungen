
package whd2;

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
        
        for (int j = 0; j < laenge; j++) {
            System.out.print(ergebnis[j] + " ");
        }
    }
    
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        rotiere(array, 2);
    }
}
