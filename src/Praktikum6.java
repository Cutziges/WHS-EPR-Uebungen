/**
 *
 * @author Sarah Grugiel
 */
public class Praktikum6 {
    
    /**
     * Prüft, ob die eingegebene Ziffer in der eingegebenen Zahl vorkommt.
     * @param a eingegebene Zahl
     * @param b eingegebene Ziffer
     * @return Rückgabe, ob vorhanden (true) oder nicht (false)
     */
    public static boolean enthaelt(long a, int b) {
        long vzahl = a % 10;
        long zahl = a;
        int ziffer = b;
        
        return (vzahl != 0) 
                ? (ziffer == vzahl)
                    ? true
                    : enthaelt((zahl / 10), ziffer)
                : (ziffer == vzahl);
    }
    
    public static int zaehler = 0;
    
    public static int gibAnzahl(long a, int b) {
        
        long zahl = a;
        long rest = zahl % 10;
        int ziffer = b;

        while (zahl != 0) {
            if (ziffer == rest) {
                zaehler++;
            }
            gibAnzahl((zahl / 10), ziffer);
        }
        
        return zaehler;
    }
    

    public static long filter(long zahl, int ziffer) {
        return ((zahl / 10) == 0)
                ? (zahl % 10 == ziffer)
                    ? 0 
                    : (zahl % 10)
                : (zahl % 10 == ziffer)
                    ? filter((zahl / 10), ziffer)
                    : 10 * filter((zahl / 10), ziffer) + (zahl % 10);
    }
    
    public static void main(String[] args) {
        System.out.println(enthaelt(4711, 1));
        System.out.println(enthaelt(4711, 2));
        System.out.println(enthaelt(789, 9));
        System.out.println(enthaelt(0, 0));
        System.out.println(filter(1332, 3));
        System.out.println(filter(3333, 3));
        System.out.println(filter(1332, 4));
        System.out.println(filter(1000, 0));
        System.out.println(filter(1, 1));
        System.out.println(filter(0, 0));
        System.out.println(filter(0, 5));
        System.out.println(gibAnzahl(1337, 3));
    }
}
