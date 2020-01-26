
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe111 {
    public static void rotiere(int[] zahl, int n) {
        int laenge = zahl.length;
        int[] ergebnis = new int[laenge];
        
        for (int i = 0; i < laenge; i++) {
            int j = (i + n) % laenge;
            ergebnis[j] = zahl[i];
        }
        
        for (int i = 0; i < laenge; i++) {
            System.out.print(ergebnis[i] + " ");
        }
        System.out.println(); // dient nur der Ausgabe, zum Überprüfen
    }
    
    
    
    public static void main(String[] args) {
        int[] array1 = {7, 4, 2, 5, 10, -3, 19};
        
        rotiere(array1, 3);
        System.out.println("10 -3 19 7 4 2 5?");
        System.out.println("Dann haste alles richtig gemacht.");
    }
}
