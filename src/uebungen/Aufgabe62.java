
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe62 {
    
    /**
     * Übergibt Variable an eigentliche Methode.
     * @param zahl übergebene Zahl
     * @return Aufruf der abschneiden Methode
     */
    private static long dreheUm(long zahl) {
        return abschneiden(0, zahl);
    }
    
    /**
     * Schneidet Zahl am Ende ab und fügt sie am Anfang hinzu.
     * @param ergebnis Zahl am Ende
     * @param zahl Übergebene Zahl
     * @return Ergebnis
     */
    private static long abschneiden(long ergebnis, long zahl) {
        return (zahl < 10)
                ? ergebnis * 10 + zahl
                : abschneiden(ergebnis * 10 + zahl % 10, zahl / 10);
    } 
    
    /**
     * Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.println(dreheUm(0));
        System.out.println(dreheUm(1));
        System.out.println(dreheUm(155));
        System.out.println(dreheUm(123456789));
    }
}
