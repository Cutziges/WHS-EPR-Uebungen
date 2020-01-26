
package whd2;

/**
 *
 * @author sarantel
 */
public class Aufgabe92 {
    
    /*
    public static boolean istPrimzahl(int zahl) {
        int teiler = 2;
        
        while (teiler != zahl && zahl % teiler != 0) {
            teiler++;
        }
        
        return teiler == zahl;
    } */
    
    public static boolean istPrimzahl(int zahl) {
        boolean keinePrimzahl = false;
        int teiler = 2;
        
        while (teiler < zahl && !keinePrimzahl) {
            if (zahl % teiler == 0) {
                keinePrimzahl = true;
            }
            teiler++;
        }
        
        return !keinePrimzahl;
    }
    
    public static void main(String[] args) {
        System.out.println(istPrimzahl(11));
        System.out.println(istPrimzahl(12));
    }
}
