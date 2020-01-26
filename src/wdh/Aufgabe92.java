
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe92 {
    public static boolean istPrimzahlMitAbbruchvariable(int zahl) {
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
    
    
    
    public static boolean istPrimzahlOhneAbbruchvariable(int zahl) {
        int teiler = 2;
        
        while (teiler < zahl && zahl % teiler > 0) {
            teiler++;
        }
        
        return teiler == zahl;
    }
    
    
    public static void main(String[] args){
        System.out.println(istPrimzahlMitAbbruchvariable(13));
        System.out.println(istPrimzahlMitAbbruchvariable(11));
        System.out.println(istPrimzahlMitAbbruchvariable(1352));
        System.out.println(istPrimzahlMitAbbruchvariable(120));
        System.out.println();
        System.out.println(istPrimzahlOhneAbbruchvariable(13));
        System.out.println(istPrimzahlOhneAbbruchvariable(11));
        System.out.println(istPrimzahlOhneAbbruchvariable(1352));
        System.out.println(istPrimzahlOhneAbbruchvariable(120));
    }
}
