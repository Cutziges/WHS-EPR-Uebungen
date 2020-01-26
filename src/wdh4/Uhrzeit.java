
package wdh4;

/**
 *
 * @author sarantel
 */
public class Uhrzeit {
    private int minuten;
    private int stunden;
    
    public Uhrzeit (int s, int m) {
        this.stunden = s;
        this.minuten = m;
    }
    
    public Uhrzeit addiere (int m) {
        int neueMinuten;
        int neueStunden;
        
        if (this.minuten + m > 60) {
            neueMinuten = (this.minuten + m) % 60;
            neueStunden = (1 + this.stunden) % 24;
        } else {
            neueMinuten = this.minuten + m;
            neueStunden = this.stunden;
        }
        
        return(new Uhrzeit(neueStunden, neueMinuten));
    }
    
    public String gibText () {
        String s;
        
        if (this.minuten < 10) {
            s = "" + this.stunden + ":" + "0" + this.minuten;
            System.out.println(s);
        } else {
            s = "" + this.stunden + ":" + this.minuten;
            System.out.println(s);
        }
        
        return s;
    }
}
