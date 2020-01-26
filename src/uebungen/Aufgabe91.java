
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe91 {
    public static int quersumme(int x) {
        int summe = 0;
        int zahl = x;
        
        if (zahl < 10) {
            summe = zahl;
        } else {
            while (zahl != 0) {
                summe += (zahl % 10);
                zahl = zahl / 10;
            }
        }
    
        return summe;
    }
    
    public static void main(String[] args) {
        System.out.println(quersumme(12345));
    }
}
