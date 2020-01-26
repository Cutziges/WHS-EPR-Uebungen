
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe44 {
    public static float erhoeheBetrag(float betrag, int ps) {
        float ergebnis = betrag + ((ps / betrag) * 100);
        
        return ergebnis;
    }
    
    public static void main(String[] args) {
        System.out.println(erhoeheBetrag(100, 5));
        System.out.println(erhoeheBetrag(100, 3));
        System.out.println(erhoeheBetrag(100, 18));
    }
}
