
package wdh;

/**
 *
 * @author Sarah
 */
public class Uhrzeit {
    
    private int stunden;
    private int minuten;
    
    public Uhrzeit(int h, int m) {
        this.stunden = h;
        this.minuten = m;
    }
    
    public String berechneDifferenz (Uhrzeit a) {
        int sDifferenz = 0;
        int mDifferenz = 0;
        String s;
        
        if (this.stunden - a.stunden > 0) {
            sDifferenz = this.stunden - a.stunden;
        } else {
            sDifferenz = a.stunden - this.stunden;
        }
        
        if (this.minuten - a.minuten > 0) {
            mDifferenz = this.minuten - a.minuten;
        } else {
            mDifferenz = a.minuten - this.minuten;
        }
        
        
        if (sDifferenz > 0) {
            s = ("Differenz: " + sDifferenz + " Stunden und " 
                    + mDifferenz + " Minuten.");
            System.out.println(s);
        } else {
            s = ("Differenz: " + mDifferenz + " Minuten.");
            System.out.println(s);
        }
        
        return s;
    }
    
    public boolean vorUhrzeit (Uhrzeit a) {
        boolean liegtDavor = true;
        
        if (a.stunden < this.stunden) {
           liegtDavor = false;
        } else if (a.stunden == this.stunden && a.minuten > this.minuten) {
            liegtDavor = false;
        }
        
        return liegtDavor;
    }
    
}
