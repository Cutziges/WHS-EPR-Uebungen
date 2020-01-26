
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class RationaleZahlTest {
    public static void main(String[] args){
        RationaleZahl test1 = new RationaleZahl(2, 8);
        RationaleZahl test2 = new RationaleZahl(5, 6);
        
        RationaleZahl test3 = test1.addiere(test2);
        RationaleZahl test4 = test2.addiere(test1);
        
        RationaleZahl test5 = new RationaleZahl(17, 4)
                .addiere(new RationaleZahl(7, 4));
        RationaleZahl test6 = new RationaleZahl(100002, 4)
                .addiere(new RationaleZahl(5, 1));
        
        
        test1.gibAlsText();
        test2.gibAlsText();
        test3.gibAlsText();
        test4.gibAlsText();
        test5.gibAlsText();
        test6.gibAlsText();
    }
    
}
