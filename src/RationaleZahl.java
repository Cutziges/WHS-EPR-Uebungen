/**
 * Praktikum 8 Aufgabe.
 * @author Sarah Grugiel
 */

public class RationaleZahl {
    // m / n wobei m der Zähler ist
    long zaehler;
    
    // m / n wobei n der Nenner ist
    long nenner;
    
    /**
     * Rationale Zahl, welche ganzzahlig ist.
     * Zur weiteren Verwendung muss der Nenner 1 gesetzt werden, da sonst die
     * anderen Methoden nicht richtig greifen würden.
     * @param a Ganzzahlige rationale Zahl
     */
    public RationaleZahl(long a) {
        this.zaehler = a;
        this.nenner = 1;
    }
    
    /**
     * Rationale Zahl, welche nicht ganzzahlig ist.
     * @param a Zähler m von m / n
     * @param b Nenner n von m / n
     */
    public RationaleZahl(long a, long b) {
        long ggT = ggT(a, b);
        this.zaehler = a / ggT;
        this.nenner = b / ggT;
    }
    
    /**
     * Addition der rationalen Zahlen.
     * Die addierten Zähler und Nenner werden mittels Ergebnis der ggT-Methode
     * gekürzt und anschließend als ein neues Objekt zurück gegeben.
     * @param x Rationale Zahl
     * @return Gibt das Ergebnis der Addition in gekürzter Form zurück
     */
    public RationaleZahl addiere(RationaleZahl x) {
        long zwNenner = this.nenner * x.nenner;
        long zwZaehler = this.zaehler * x.nenner + x.zaehler * this.nenner;
        long ggT = ggT(zwNenner, zwZaehler);
        long neuerNenner = zwNenner / ggT;
        long neuerZaehler = zwZaehler / ggT;
        
        return new RationaleZahl(neuerZaehler, neuerNenner);
    }
 
    /**
     * Berechnet den größten gemeinsamen Teiler zweier übergebenen Zahlen.
     * @param a Zahl 1
     * @param b Zahl 2
     * @return ggT von Zahl 1 und 2
     */
    private long ggT(long a, long b){
        if (0 == a % b) {
            return b;
        }
        return ggT(b, a % b);
    }
    
    /**
     * Gibt die Zähler und Nenner der rationalen Zahl aus.
     * @return Gibt den String zurück
     */
    public String gibAlsText() {
        String s = new String();
        
        if (this.nenner != 1) {
            s = (this.zaehler + "/" + this.nenner);
            System.out.println(s);
        } else {
            s = ("" + this.zaehler);
            System.out.println(s);
        }
        
        return s;
    }
    
    
}