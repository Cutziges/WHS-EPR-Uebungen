/**
 *
 * @author Sarah Grugiel
 */
public class Test {
    public static void main(String[] args) {
        int[][] array = new int[][] {{0, 1}, {2, 3, 4}};
        
        /*
        array[0][0] = 0;
        array[0][1] = 1;
        array[1][0] = 2;
        array[1][1] = 3;
*/
        
        for (int k = 0; k < array.length; ++k) {
            for (int l = 0; l < array[k].length; ++l) {
                System.out.print(array[k][l] + "\t");
            }
        }
    }
}
