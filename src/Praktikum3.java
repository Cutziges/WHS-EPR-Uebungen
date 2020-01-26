/**
 *
 * @author Sarah Grugiel
 */
public class Praktikum3 {
    public static void main(String[] args) {
        int reiskoerner = 3;
        int prozErhoehung = reiskoerner * (1 / 2);
        int gesamt = 0;
        
        for (int i = 1; i < 9; i++) {
            //int anzahl = reiskoerner + prozErhoehung;
            System.out.println("Feld Nr. " + i + " hat " 
                    + (reiskoerner + prozErhoehung) + " Reiskörner");
            gesamt += (reiskoerner + prozErhoehung);
            reiskoerner = reiskoerner + i;
        }
        System.out.println("Gesamt " + gesamt);

    }
    
}
