
/**
 * Der Zweck dieser Klasse ist es, Code-Beispiele für endrekursiv
 * definierte Methoden zu geben.
 */
public class Endrekursion {

    /**
     * Liefert die Quersumme von <code>zahl</code> zzgl.
     * dem Wert von <code>summe</code>. Übergibt man für
     * <code>summe</code> 0, erhält man die Quersumme von
     * <code>zahl</code>.
     *
     * @param zahl  Zahl, deren Quersumme berechnet wird;
     *        es muss gelten: zahl &gt;= 0
     * @param summe  Summe
     * @return Quersumme von <code>zahl</code> plus <code>summe</code>
     */
    private static int quersumme(int zahl, int summe) {
        
//        System.out.println("Zur Ablaufkontrolle: " + zahl + " " + summe);

        return (zahl == 0)
               ? summe
               : quersumme(zahl / 10, summe + zahl % 10);
    }
    
    /**
     * Liefert die Quersumme von <code>zahl</code>.
     *
     * @param zahl  Zahl, deren Quersumme berechnet wird;
     *        es muss gelten: zahl &gt;= 0
     * @return Quersumme von <code>zahl</code>
     */
    public static int quersumme(int zahl) {
        
        return quersumme(zahl, 0);
    }

    /**
     * Prüft, ob <code>n</code> durch eine Zahl aus dem Intervall
     * {<code>teiler</code>, ..., <code>n</code>-1}
     * teilbar ist. Übergibt man für <code>teiler</code> 2, prüft die
     * Methode, ob <code>n</code> eine Prinzahl ist.
     * 
     * @param n  Zahl, deren Teilbarkeit geprüft wird
     * @param teiler  untere Grenze für das Intervall der Zahlen,
     *        durch die geteilt wird
     * @return <code>true</code> genau dann, wenn <code>n</code> durch
     *         keine Zahl aus dem Intervall teilbar ist
     */
    public static boolean istPrimzahl(int n, int teiler) {
  
        return (teiler == n)
               || (n % teiler != 0) && istPrimzahl(n, teiler + 1);
    }
    
    /**
     * Liefert die Summe aller Zahlen von startwert bis
     * zielwert zzgl. dem Wert von Summe. Übergibt man für
     * <code>summe</code> 0, erhält man die Summe aller Zahlen
     * von startwert bis zielwert.
     *
     * @param startwert  Wert, ab dem summiert wird
     * @param zielwert  Wert, bis zu dem summiert wird
     * @param summe  Summe
     * @return Summe aller Zahlen von startwert bis zielwert
     *         plus summe
     */
    public static int summe(int startwert, int zielwert, int summe) {

        return (startwert > zielwert)
               ? summe
               : summe(startwert, zielwert - 1, summe + zielwert);
    }

    /**
     * Liefert den größten gemeinsamen Teiler zweier positiver,
     * ganzer Zahlen.
     *
     * @param n  erste Zahl
     * @param m  zweite Zahl
     * @return größter gemeinsamer Teiler beider Zahlen
     */
    public static int ggT(int n, int m) {

        /* endrekursive Realisierung nach Euklid */

        return (m == 0)
               ? n
               : ggT(m, n % m);
    }
    
    /**
     * Berechnet das Produkt aus <code>f</code> und der Fakultät von
     * <code>n</code>. Als Spezialfall berechnet die Methode die Fakultät von
     * <code>n</code>, wenn für <code>f</code> 1 übergeben wird.
     *
     * @param n Zahl, deren Fakultät mit <code>f</code> multipliziert wird
     * @param f Zahl, die mit der Fakultät von <code>n</code> multipliziert wird
     * @return Produkt aus <code>f</code> und der Fakultät von <code>n</code>
     */
    public static long fakultaet(int n, long f) {
        
        return (n == 0)
                ? f
                : fakultaet(n - 1, f * n);
    }

    /**
     * Führt die Methoden dieser Klasse mit beispielhaften
     * Parametern aus und gibt die Ergebnisse auf dem Bildschirm
     * aus.
     *
     * @param args  wird nicht verwendet
     */
    public static void main(String[] args) {

        System.out.println(quersumme(2031, 0));

        System.out.println(istPrimzahl(41, 2));
        
        System.out.println(summe(4, 8, 0));

        System.out.println(ggT(24, 18));
        
        System.out.println(fakultaet(0, 1));
        System.out.println(fakultaet(1, 1));
        System.out.println(fakultaet(4, 1));
    }
}