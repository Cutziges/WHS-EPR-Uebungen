
package wdh4;

/**
 *
 * @author sarantel
 */
public class Klausur {
    public static int immerZweiteZiffer(int zahl) {
        return zahl < 10
                ? zahl % 10
                : zahl % 10 + 10 * (immerZweiteZiffer(zahl / 100));
    }
    
    public static int[][] dreieck(int[] zahl) {
        int zeilen = zahl.length;
        int spalten = zahl.length;
        
        int[][] matrix = new int[zeilen][spalten];
        
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < zeilen; j++) {
                matrix[j][i] = zahl[i];
            }
        }
        
        for (int k = 0; k < zeilen; k++) {
            for (int l = 0; l < spalten; l++) {
                System.out.println(matrix[k][l]);
            }
        }
        return matrix;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        dreieck(a);
        /*
        System.out.println(immerZweiteZiffer(107));
        System.out.println(immerZweiteZiffer(1027));
        System.out.println(immerZweiteZiffer(1127));
        System.out.println(immerZweiteZiffer(1324));
*/
        
    }
}
