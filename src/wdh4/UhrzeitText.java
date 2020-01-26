
package wdh4;

/**
 *
 * @author sarantel
 */
public class UhrzeitText {
    public static void main(String[] args) {
        Uhrzeit z1 = new Uhrzeit(23, 59);
        Uhrzeit z2 = new Uhrzeit(13, 37);
        
        Uhrzeit z3 = z1.addiere(5);
        z1.gibText();
        z3.gibText();
        
    }
    
}
