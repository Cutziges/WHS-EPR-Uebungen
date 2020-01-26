/**
 * Berechnung der Fibonacci Funktion.
 * @author Sarah Grugiel
 */
public class Uebung63 { 
    /**
     * Diese Methode berechnet basierend auf Eingabe n die Fibonacci Funktion.
     * @param n Wert für die Fibonacci Funktion
     * @return Ergebniswert
     */
    static long fib(int n) {  
        long b;
        
        // Falls n = 0 oder 1
        if (n <= 1) {
            b = n;
            //return b;
            
        // Falls Zahl > 1
        } else {
            // a hat am Anfang der Schleife den Wert fib(i-2)
            long a = 0;
            // b hat am Anfang der Schleife den Wert fib(i-1)
            b = 1;
            // Zähler für die Iterationen
            long i = 2;
            
            // Schleife für alle Werte von 2 bis n
            while (i <= n) {
                // Wert von fib(i-1)
                long aa = b;
                // Wert von fib(i)
                long bb = a + b;
                // Vorbereitung für den nächsten Durchgang
                a = aa;
                // Vorbereitung für den nächsten Durchgang
                b = bb;
                // Erhöhung des Zählers
                i++;
            }
            //return b;
        }
        return b;
    }
    
    /**
     * Main Methode für die Ausgabe der Fibonacci Funktion.
     * @param args argumente
     */
    public static void main(String[] args) {
        System.out.print(fib(7));
    }
}
