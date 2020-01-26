
package uebungen;

/**
 *
 * @author sarantel
 */
public class Aufgabe42 {
    
    public static long f(long a, int b) {
        // return (a > b || a <= b) ? a + b : a / 2.0; 
        // geht nicht wegen double > long
        
        /*
        double d;
        d = (a > b) ? a / b : b / a;
        return d;
        // geht auch nicht wegen double > long
        */
        
        // return (a > b) ? a / b : b / a;
        // funktioniert
        
        // return (a > b) ? 2 * b : a - 'b';
        // funktioniert
        
        return b;
    }
    
    public static void main(String[] args) {
        System.out.println(f(f(f(1, 2), 3), 4));
    }
}
