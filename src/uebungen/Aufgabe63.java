
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe63 {
    /**
     * Methode mit Baumrekursion.
     * @param n Übergebene Zahl
     * @return Fibonacci Folge
     */
    /*
    public static int fib(int n) {
        return (n <= 1)
                ? n
                : fib(n - 1) + fib(n - 2);
    }
    */
    
    public static int fib(int n) {
        // geistiger Durchfall von Sarah
        int m = (n - 1);
        
        return n <= 1
                ? n
                : m - 1 + fib(n - 2);
    }
    
    /**
     * Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.println(fib(4) + " sollte 3 sein");
        System.out.println(fib(5) + " sollte 5 sein");
        System.out.println(fib(6) + " sollte 8 sein");
    }
}
