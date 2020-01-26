
package wdh3;

/**
 *
 * @author sarantel
 */
public class RationaleZahl {
    private long zaehler;
    private long nenner;
    
    public RationaleZahl(long zahl) {
        this.zaehler = zahl;
        this.nenner = 1;
    }
    
    public RationaleZahl(long zaehler, long nenner) {
        long teiler = ggT(zaehler, nenner);
        
        this.zaehler = zaehler / teiler;
        this.nenner = nenner / teiler;
    }
    
    public long ggT(long a, long b) {
        long ergebnis = 1;
        
        if (a % b == 0) {
            ergebnis = b;
        } else {
            ggT(b, a % b);
        }
        
        return ergebnis;
    }
    
    public RationaleZahl addiere(RationaleZahl x) {
        long hilfsZaehler = this.zaehler * x.nenner + x.zaehler * this.nenner;
        long hilfsNenner = this.nenner * x.nenner;
        long teiler = ggT(hilfsZaehler, hilfsNenner);
        
        long neuerZaehler = hilfsZaehler / teiler;
        long neuerNenner = hilfsNenner / teiler;
        
        return(new RationaleZahl(neuerZaehler, neuerNenner));
    }
    
}
