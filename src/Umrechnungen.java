/**
 *
 * @author Sarah Grugiel
 */
public class Umrechnungen {
    
    /**
     * Speicherung der Variablen.
     * @param c Celsius Variable
     * @param euro Euro Variable
     * @param stunden Stunden Variable
     */
    static int c = 0;
    static int euro = 0;
    static int stunden = 0;
    
    /**
     * Methode zur Umrechnung von Fahrenheit in Celsius.
     * @param fahrenheit Übergebener Wert, der umgerechnet wird
     */
    public static void rechneFinC(int fahrenheit) {
        c = ((fahrenheit - 32) * 5) / 9;
        System.out.println(c);
    }
    
    /**
     * Methode zur Umrechnung von schweizer Franken (CHF) in Euro.
     * @param chf Eingegebener CHF-Wert
     */
    public static void rechneCHFinEuro(int chf) {
        euro = (chf * 10000) / 11401;
        System.out.println(euro);
    }
    
    /**
     * Methode zur Umrechnung von Minuten in Stunden.
     * @param minuten Eingegebener Minutenwert.
     */
    public static void rechneMinutenInStunden(int minuten) {
        stunden = ((minuten / 60) * 100) + (minuten % 60);
        System.out.println(stunden);
    }
    
    /**
     * Main-Methode zur Überprüfung der Umrechnungen.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        rechneFinC(40);
        rechneFinC(41);
        rechneCHFinEuro(100);
        rechneCHFinEuro(10000);
        rechneMinutenInStunden(5);
        rechneMinutenInStunden(59);
        rechneMinutenInStunden(60);
        rechneMinutenInStunden(61);
        rechneMinutenInStunden(825);
    }
}
