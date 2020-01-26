
package wdh4;

/**
 *
 * @author sarantel
 */
public class Aufgabe92 {
    public static boolean istPrimzahlOhneAbbruch(int zahl) {
        int teiler = 2;
        
        while (teiler < zahl && zahl % teiler != 0) {
            teiler++;
        }
        
        return teiler == zahl;
    }
    
      public static boolean istPrimzahlMitAbbruch(int zahl) {
        boolean teilerGefunden = false;
        int teiler = 2;
        
        while (teiler < zahl && !teilerGefunden) {
            if (zahl % teiler == 0) {
                teilerGefunden = true;
            }
            teiler++;
        }
        
        return !teilerGefunden;
    }
    
    public static void main(String[] args) {
        System.out.println(istPrimzahlOhneAbbruch(1337));
        System.out.println(istPrimzahlOhneAbbruch(11));
        System.out.println(istPrimzahlOhneAbbruch(8));
        System.out.println(istPrimzahlOhneAbbruch(13));
        System.out.println();
        System.out.println(istPrimzahlMitAbbruch(1337));
        System.out.println(istPrimzahlMitAbbruch(11));
        System.out.println(istPrimzahlMitAbbruch(8));
        System.out.println(istPrimzahlMitAbbruch(13));
    }
}
