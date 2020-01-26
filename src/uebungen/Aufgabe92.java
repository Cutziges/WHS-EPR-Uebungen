
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe92 {
    /**
     * Testet, ob übergeben Zahl Primzahl ist.
     * Ohne Break und mit "Abbruchvariable"
     * @param n Übergebene Zahl
     */
    public static void testePrimzahlMitAbbruchvariable(int n) {
        boolean teilerGefunden = false;
        
        int teiler = 2;
        
        while ((teiler < n) && !teilerGefunden) {
            if (n % teiler == 0) {
                teilerGefunden = true;
            }
            
            teiler++;
        }
        
        System.out.println(n + " ist Primzahl: " + !teilerGefunden);
    }

    /**
     * Testet, ob übergeben Zahl Primzahl ist.
     * Ohne Break und ohne Abbruchvariable
     * @param n Übergebene Zahl
     */
    public static void testePrimzahlOhneBreak(int n) {
        int teiler = 2;
        
        while ((teiler < n) && (n % teiler > 0)) {
            teiler++;
        }
        
        /* Wenn n == teiler, dann war n durch alle Zahlen zwischen
        * 2 und n-1 nur mit Rest teilbar, d.h. n ist eine Primzahl. */
        System.out.println(n + " ist Primzahl: " + (n == teiler));
    }
    
    /**
     * Methode zur Ausgabe der Zahl.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        testePrimzahlMitAbbruchvariable(3);
        testePrimzahlMitAbbruchvariable(12);
        testePrimzahlMitAbbruchvariable(123);
        testePrimzahlOhneBreak(3);
        testePrimzahlOhneBreak(12);
        testePrimzahlOhneBreak(39);
        testePrimzahlOhneBreak(123);
    }
}
