
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe43 {
    public static boolean istWurzel(int a, long b) {
        return b == (a * a);
    }
    
    public static void main(String[] args) {
        System.out.println(istWurzel(120, 14400));
        System.out.println(istWurzel(3, 9));
        System.out.println(istWurzel(14, 3));
        System.out.println(istWurzel(220, 10));
    }
}
