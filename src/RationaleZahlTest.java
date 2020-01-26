/**
 * Klasse zur Ausgabe der RationaleZahl Klasse.
 * @author Sarah Grugiel
 */
public class RationaleZahlTest {
    public static void main(String[] args) {
        RationaleZahl r1 = new RationaleZahl(2, 8);
        RationaleZahl r2 = new RationaleZahl(5, 6);
        RationaleZahl ergebnis1 = r1.addiere(r2);
        RationaleZahl ergebnis2 = r2.addiere(r1);
        
        RationaleZahl r3 = new RationaleZahl(17, 4)
                .addiere(new RationaleZahl(7, 4));
        
        RationaleZahl r4 = new RationaleZahl(100002, 4)
                .addiere(new RationaleZahl(5));
        
        RationaleZahl r5 = new RationaleZahl(11, 2108303)
                .addiere(new RationaleZahl(31, 2117009))
                .addiere(new RationaleZahl(47, 2134421));
        
        RationaleZahl r6 = new RationaleZahl(3L, 3037000510L)
                .addiere(new RationaleZahl(7L, 3037000500L));
        
        RationaleZahl r7 = new RationaleZahl(10957693037L, 10967535067L)
                .addiere(new RationaleZahl(10961461793L, 10967639796L));
        
        r1.gibAlsText();
        ergebnis1.gibAlsText();
        ergebnis2.gibAlsText();
        r3.gibAlsText();
        r4.gibAlsText();
        r5.gibAlsText();
        r6.gibAlsText();
        r7.gibAlsText();
    }
    
}
