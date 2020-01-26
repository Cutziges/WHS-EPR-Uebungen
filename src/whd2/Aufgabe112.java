
package whd2;

import java.util.Arrays;

/**
 *
 * @author sarantel
 */
public class Aufgabe112 {
    public static int[] mische(int[] a, int[] b) {
        int laenge = a.length + b.length;
        int[] zwErgebnis = new int[laenge];
        
        for (int i = 0; i < a.length; i++) {
            zwErgebnis[i] = a[i];
        }
        
        for (int j  = 0; j < b.length; j++) {
            zwErgebnis[j + a.length] = b[j];
        }
        
        return sortiere(zwErgebnis);
    }
    
    public static int[] sortiere (int[] array) {
        int laenge = array.length;
        
        for (int l = 0; l < laenge; l++) {
            for (int k = 0; k < laenge - 1; k++) {
                int hilfs = 0;

                if (array[k] > array[k + 1]) {
                    hilfs = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = hilfs;
                }
            }
        }
        
        return array;
    }
    
    public static void main(String[] args) {
        int[] a1 = {1, 3, 6, 2};
        int[] a2 = {3, 6, 9, 8};
        
        System.out.println(Arrays.toString(mische(a1, a2)));
    }
}
