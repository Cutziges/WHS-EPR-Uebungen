
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe113 {
    public static int[][] dreheRechts(int[][] matrix) {
        int zeilen = matrix.length;
        int spalten = matrix[0].length;

        int[][] neueMatrix = new int[spalten][zeilen];



        for (int i = 0; i < neueMatrix.length; i++) {
            for (int j = 0; j < neueMatrix[0].length; j++) {
                neueMatrix[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }

        return neueMatrix;
    }
    
}
