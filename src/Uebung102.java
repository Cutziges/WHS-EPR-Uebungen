/**
 *
 * @author Sarah Grugiel
 */
public class Uebung102 {

    public static boolean enthaeltZiffernpaar(long zahl) {
        while (zahl != 0) {
            return false;
        }
        return zahl % 10 == zahl % 100 / 10
                ? true
                : enthaeltZiffernpaar(zahl / 10);
    }
    
    /**
     * Prüft, ob eine übergebene Zahl zwei aufeinanderfolgende gleiche Ziffern
     * enthält und gibt in diesem Fall true wieder.
     * @param zahl Übergebene Zahl
     * @return Angabe, ob zwei aufeinanderfolgende Ziffern vorliegen
     */
    /*
    public static boolean enthaeltZiffernpaar(long zahl) {
        boolean enthaeltPaar = false;
        
        while (zahl != 0) {
            if ((zahl % 10) == (zahl % 100) / 10) {
                enthaeltPaar = true;
                zahl = zahl / 10;
            } else {
                zahl = zahl / 10;
            }
        }
        return enthaeltPaar;
    }
    */
    
    /**
     * Methode zur Ausgabe der Prüfung.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.println(enthaeltZiffernpaar(1337));
        System.out.println(enthaeltZiffernpaar(1234));
        System.out.println(enthaeltZiffernpaar(114563));
        System.out.println(enthaeltZiffernpaar(11));
    }
}