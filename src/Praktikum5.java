/**
 * 
 * @author Sarah Grugiel
 */
public class Praktikum5 {
    /**
     * Methode zur Ausgabe der Farbwerte.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        
        System.out.println(invertiere(000) + " sollte 255255255 sein");
        System.out.println(invertiere(10128255) + " sollte 245127000 sein");
        System.out.println(gibNaechsteFarbe(101112) + " sollte 101113 sein");
        System.out.println(gibNaechsteFarbe(10128255) + " sollte 10129000 sein");
        System.out.println(gibNaechsteFarbe(0255255) + " sollte 100 sein");
        System.out.println(gibNaechsteFarbe(255255255) + " sollte 0 sein");
    }
    
    /**
     * Methode für den roten Farbanteil.
     * Die Farbe wird im Format rrrgggbbb übergeben und daher wird die Farbe
     * durch 1000000 dividiert, um nur den vorderen (roten) Teil vor dem Komma
     * zu haben. Durch den Typen int wird der Nachkommaanteil abgeschnitten und
     * nur der rote Farbanteil bleibt übrig
     * 
     * Beispiel: 255155100 / 1000000 = 255,155100 und 255 wird rot zugewiesen
     * 
     * @param farbe Übergebener Farbwert rrrgggbbb
     * @return Rückgabe des roten Farbanteils
     */
    public static int berechneRot(int farbe) {
        
        int rot = (farbe / 1000000);
        
        return rot;
    }

    /**
     * Methode für den grünen Farbanteil.
     * Rot wird hierbei nochmal berechnet, damit es anschließend vom Farbanteil
     * abgezogen werden kann, sodass nur noch der grüne Teil übrig bleibt.
     * Hierzu wird von farbe der rote Teil abgezogen, aufgrund des int Wertes
     * muss dieser mit 1000000 multipliziert werden, damit nur der vordere Teil,
     * sprich rrr, abgezogen wird. Um dann den grün Wert vorne stehen zu haben
     * wird mit 1000 dividiert.
     * 
     * Beispiel: 255155100 - rot * 1000000 = 155100
     *              155100 / 1000          = 155.100
     * und 155 wird grün zugewiesen, da es sich um einen int-Wert handelt.
     * 
     * @param farbe Übergebener Farbwert rrrgggbbb
     * @return Rückgabe des grünen Farbanteils
     */
    public static int berechneGruen(int farbe) {
        
        int rot = (farbe / 1000000);
        int gruen = ((farbe - rot * 1000000) / 1000);
        
        return gruen;
    }

    /**
     * Methode für den blauen Farbanteil.
     * Rot und grün werden hierbei nochmal berechnet, damit sie anschließend 
     * vom Farbanteil abgezogen werden können, sodass nur noch der blaue Teil
     * übrig bleibt.
     * 
     * Beispiel: 255155100 - rot  * 1000000 = 155100
     *              155100 - grün *    1000 =    100
     * 
     * @param farbe Übergebener Farbwert rrrgggbbb
     * @return Rückgabe des blauen Farbanteils
     */
    public static int berechneBlau(int farbe) {
        
        int rot = (farbe / 1000000);
        int gruen = (farbe - rot * 1000000) / 1000;
        int blau = (farbe - rot * 1000000) - gruen * 1000;
        
        return blau;
    }

    /**
     * Liefert die invertierte Farbe der übergebenen Farbe.
     * Bei der invertierten Farbe ist jeder einzelne Farbanteil invertiert:
     * aus 0 wird 255, aus 1 wird 254 usw.
     * 
     * @param farbe Übergebener Farbwert rrrgggbbb
     * @return Invertierter Farbwert
     */
    public static int invertiere(int farbe) {
        int rot = 255 - berechneRot(farbe);
        int gruen = 255 - berechneGruen(farbe);
        int blau = 255 - berechneBlau(farbe);
        int invertierteFarbe = (((rot * 1000000) + gruen * 1000) + blau);
       
        return invertierteFarbe;
    }

    
    /**
     * Kopierte Methode aus dem Internet mit Fehlern.
     * Sollte von dem Cutzigen nochmal genauer überdacht werden!
     * @param farbe Übergebener Farbwert rrrgggbbb
     * @return Nächster Farbwert rrrgggbbb
     */
    public static int gibNaechsteFarbe(int farbe) {

        System.out.println("FARBE==" + farbe);
        int rot = (berechneRot(farbe));
        int gruen = (berechneGruen(farbe));
        int blau = (berechneBlau(farbe));
        
        int b = (blau == 255) ? (blau % 255) : (blau + 1);
        int g = (blau == 255) 
                ? ((gruen == 255) ? (gruen % 255) : (gruen + 1))
                : (gruen);
        int r = (gruen == 255)
                ? ((rot == 255) ? (rot % 255) : (rot + 1))
                : (rot);

        
        System.out.println("===================");
        System.out.println("Rot alt: " + rot + " Rot neu: " + r);
        System.out.println("Grun alt: " + gruen + " Grün neu: " + g);
        System.out.println("Blau alt: " + blau + " Blau neu: " + b);
        System.out.println("===================");
        /*
        nächste Farbe zu (10; 11; 12) berechnen (10; 11; 13)
        nächste Farbe zu (10; 128; 255) berechnen (10; 129; 0)
        nächste Farbe zu (0; 255; 255) berechnen (1; 0; 0)
        nächste Farbe zu (255; 255; 255) berechnen (0; 0; 0)

        rot = (blau == 255) && (gruen == 255) ? (rot + 1) : (rot);
        gruen = (rot == 255) && (blau == 255) ? (gruen + 1) : (gruen);
        blau = (rot == 255) && (gruen == 255) ? (blau + 1) : (blau);
        /*
        gruen = (rot == 255) && (blau == 255) ? (gruen + 1) : (gruen);
        rot = (blau == 255) && (gruen == 255) ? (rot + 1) : (rot);
        rot = (blau == 255) && (gruen == 255) && (rot == 255) ? (rot = 0) : (rot);
        */
        //int wert = (((rot * 1000000) + gruen * 1000) + blau);
        int wert = (((r * 1000000) + g * 1000) + b);
        
        return wert;
    }
    
}
