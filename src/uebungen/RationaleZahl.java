
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class RationaleZahl {
    /**
     * Ein Zähler.
     */
    private long zaehler;
    /**
     * Ein Nenner.
     */
    private long nenner;
    /**
     * Konstruktor.
     * @param zahl übergebene Zahl
     */
    public RationaleZahl(long zahl) {
        this.zaehler = zahl;
        this.nenner = 1;
    }
    
    /**
     * Konstruktor.
     * @param zaehler Zähler
     * @param nenner Nenner
     */
    public RationaleZahl(long zaehler, long nenner) {
        long teiler = ggT(zaehler, nenner);
   
        this.zaehler = zaehler / teiler;
        this.nenner = nenner / teiler;
    }
    
    /**
     * Berechnet den größten gemeinsamen Teiler.
     * @param a Übergebener Zähler
     * @param b Übergebener Nenner
     * @return ggT
     */
    public long ggT(long a, long b) {
        long ergebnis = 1;
        
        if (a % b == 0) {
            ergebnis = b;
        } else {
            ergebnis = ggT(b, a % b);
        }
        return ergebnis;
    }
    
    /**
     * Addiert die rationalen Zahlen miteinander.
     * @param x Übergebenes Objekt
     * @return Rückgegebenes neues Objekt
     */
    public RationaleZahl addiere(RationaleZahl x) {
        long hilfsZaehler = this.zaehler * x.nenner 
                + x.zaehler * this.nenner;
        long hilfsNenner = this.nenner * x.nenner;
        long ggT = ggT(hilfsZaehler, hilfsNenner);
        long neuerZaehler = hilfsZaehler / ggT;
        long neuerNenner = hilfsNenner / ggT;
        
        return new RationaleZahl(neuerZaehler, neuerNenner);
    }
    
    /**
     * Methode zur textuellen Ausgabe der Brüche etc.
     * @return gibt den Text aus
     */
    public String gibAlsText() {
        String text;
        
        if (this.nenner != 1) {
            text = this.zaehler + "/" + this.nenner;
            System.out.println(text);
        } else {
            text = "" + this.zaehler;
            System.out.println(text);
        }
        return text;
    }
    
}
