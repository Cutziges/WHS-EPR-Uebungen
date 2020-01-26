/**
 *
 * @author Sarah Grugiel
 */
public class Uebung9 {
    
    /**
     * Berechnet die Quersumme einer eingegebenen Zahl iterativ.
     * @param x Eingegebene Zahl
     * @return Quersumme
     */
    public static int quersumme(int x) {
        int summe = 0;
        int zahl = x;
        int temp = 0;
        
        if (zahl < 10) {
            summe = zahl;
        } else {
            while (zahl != 0) {
                summe += (zahl % 10);
                zahl = zahl / 10;
            }
        }
    
        return summe;
    }
    
    public static boolean istPrimzahl(int x) {
        boolean primzahl = true;
        int zahl = x;
        
        for (int i = 2; i < zahl; i++) {
            if ((zahl % i) == 0) {
                primzahl = false;
            }
        }
        return primzahl;
    }
    
    /**
     * Prüft, ob die Ziffern der eingegebenen Zahl absteigend sind.
     * @param x Eingegebene Zahl
     * @return Angabe, ob absteigend oder nicht
     */
    public static boolean istAbsteigend(int x) {
        int zahl = x;
        boolean absteigend = false;
        
        if ((zahl % 10) <= ((zahl % 100) / 10)) {
            absteigend = true;
        }
        zahl = (zahl / 10);
        
        return absteigend;
    }
    
    /**
     * Überprüft ob der eingegebene String ein Palindrom ist.
     * @param text Eingegebener String
     * @return Angabe, ob Palindrom oder nicht
     */
    public static boolean istPalindrom(String text) {
        boolean palindrom = false;
        int n = text.length();
        
        for (int i = 0; i < n / 2; i++) {
            if (text.charAt(i) == text.charAt(n - i - 1)) {
                palindrom = true;
            }
        }
        return palindrom;
    }
    
    /**
     * Methode zur Ausgabe und Testen der anderen Methoden.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        System.out.println("Quersumme: " + quersumme(8));
        System.out.println("Quersumme: " + quersumme(28346));
        System.out.println("Ist Primzahl: " + istPrimzahl(8));
        System.out.println("Ist Primzahl: " + istPrimzahl(11));
        System.out.println("Ist Primzahl: " + istPrimzahl(2457));
        System.out.println("Ist absteigend: " + istAbsteigend(123));
        System.out.println("Ist absteigend: " + istAbsteigend(321));
        System.out.println("Ist absteigend: " + istAbsteigend(1111111));
        System.out.println("Ist ein Palindrom: " + istPalindrom("anna"));
        System.out.println("Ist ein Palindrom: " + istPalindrom("alsds"));
        System.out.println("Ist ein Palindrom: "
                + istPalindrom("012345678-876543210"));
    }
    
}
