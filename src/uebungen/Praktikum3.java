
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Praktikum3 {
    public static void main (String[] args){
        int prozent = 50;
        int startKoerner = 3;
        int erhoehung = 1 / 2;
        
        int feld1 = startKoerner;
        int feld2 = feld1 * erhoehung;
        int feld3 = feld2 * erhoehung;
        int feld4 = feld3 * erhoehung;
        int feld5 = feld4 * erhoehung;
        int feld6 = feld5 * erhoehung;
        int feld7 = feld6 * erhoehung;
        int feld8 = feld7 * erhoehung;
        int gesamt = feld1 + feld2 + feld3 + feld4 + feld5 + feld6 + feld7 
                + feld8;
        
        System.out.println("1. Feld: " + feld1);
        System.out.println("2. Feld: " + feld2);
        System.out.println("3. Feld: " + feld3);
        System.out.println("4. Feld: " + feld4);
        System.out.println("5. Feld: " + feld5);
        System.out.println("6. Feld: " + feld6);
        System.out.println("7. Feld: " + feld7);
        System.out.println("8. Feld: " + feld8);
        System.out.println("Gesamtanzahl: " + gesamt);
    }
    
}
