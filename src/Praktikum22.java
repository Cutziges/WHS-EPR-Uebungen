
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 *
 * @author sarantel
 */
public class Praktikum22 {
    public static void rechneDMinEuro(int eingabe) {
        int dm = eingabe;
        double wk = 1.95583;
        double ergebnis = (dm / wk);
        
        int euro = (int) ergebnis;
        System.out.println(dm + " Mark sind umgerechnet " + euro + " Euro.");
    }
    
    public static void main (String args[]) {
        rechneDMinEuro(100);
        rechneDMinEuro(10000);
    }
    
}
