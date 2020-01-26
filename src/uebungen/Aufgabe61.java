
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe61 {
    
    /**
     * Prüfe, ob die aufeinander folgenden Ziffern größer werden.
     * @param a Zu prüfende Ziffernfolge
     * @return Angabe, ob aufsteigend oder nicht
     */
    public static boolean istAufsteigend(int a) {
        int hilfs = a % 10;
        
        return a > 10
                ? a % 10 >= ((a / 10) % 10)
                    ? istAufsteigend(a / 10)
                    : false
                : true;
    }
    
    /**
     * Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.println(istAufsteigend(5));
        System.out.println(istAufsteigend(123));
        System.out.println(istAufsteigend(321));
        System.out.println(istAufsteigend(111223344));
        System.out.println(istAufsteigend(4442215));
    }
}
