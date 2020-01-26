/**
 *
 * @author Sarah Grugiel
 */
public class Reiskoerner {
    
    /**
     * Methode zur Berechnung und Ausgabe der Anzahl von Reiskörnern.
     * @param args wird nicht verwendet
     */
    public static void main(String[] args) {
        // Anzahl der Reiskörner auf dem ersten Feld
        int reiskoerner = 3;
        // Prozentuale Erhöhung der Reiskörnner
        int prozErhoehung = reiskoerner * (1 / 2);
        // Variable für die Gesamtanzahl der Reiskörner
        int gesamt = 0;
        
        
        // Schleife zur Berechnung der Reiskörner auf dem Feld
        for (int i = 1; i < 9; i++) {
            System.out.println("Feld Nr." + i + " hat " + (reiskoerner 
                    + prozErhoehung) + " Reiskörner");
            gesamt += (reiskoerner + prozErhoehung);
            reiskoerner = reiskoerner + i;
        }
        System.out.println("Gesamtanzahl " + gesamt);

    }
}
