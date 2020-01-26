/**
 * Diese Klasse führt mit Hilfe von Ausdrücken einfache Berechnungen
 * durch und gibt die Ergebnisse auf dem Bildschirm aus.
 * Die Ausdrücke enthalten Operatoren zur Typkonvertierung.
 * Der Zweck dieser Klasse ist, Code-Beispiele für die Anwendung
 * von expliziter und impliziter Typkonvertierung zu zeigen.
 */
public class Typkonvertierung {

    /**
     * Führt die Berechnungen durch und gibt die Ergebnisse
     * auf dem Bildschirm aus.
     *
     * @param args  wird nicht verwendet
     */
    public static void main(String[] args) {

        /* Explizite Typkonvertierung
         */

        /* 3 wird in Typ double gewandelt.
         */
        System.out.println("double + (double)int: " + (2.5 + (double) 3));
        System.out.println("Nur double: " + (2.5 + 3.0));

        /* 5 wird in Typ double gewandelt. Erst danach wird dividiert.
         * Ergebnistyp ist double.
         */
        System.out.println("(double)int / double: " + ((double) 5) / 2.0);

        /* Die Division ist geklammert. Erst wird dividiert, dann wird
         * das Ergebnis in Typ double gewandelt.
         */
        System.out.println("(double)int / int: " + (double) (5 / 2));

        /* Bei der Konvertierung einer Gleitkommazahl in eine
         * ganze Zahl wird der Nachkommaanteil abgeschnitten.
         */
        System.out.println("(int)double: " + (int) 4.1);
        System.out.println("(int)double: " + (int) (5.1 + 3.0));

        /* Bei der Konvertierung einer ganzen Zahl von einem breiteren
         * in einen schmaleren Typ werden von der internen Darstellung
         * des Ausgangswerts die hintersten n Stellen abgeschnitten, wobei
         * n die interne Darstellungslänge des Zieltyps ist.
         */
        System.out.println("(short)kp: " +(short) 0x0000FFFF);
        System.out.println("(short)kp: " + (short) 0xFFFF0001);

        /* Liegt eine Gleitkommazahl, die in eine ganze Zahl
         * gewandelt werden soll, außerhalb des Wertebereichs des
         * ganzzahligen Typs, wird am größten bzw. kleinsten Wert
         * dieses Typs "abgeschnitten".
         */
        System.out.println("(int)float: " + (int)2E9F);
        System.out.println("(int)float: " + (int) 1E10F);
        System.out.println("(int)-float: " + (int) -1E10F);


        /* Implizite Typkonvertierung
         */

        /* Addition bewirkt einen Überlauf.
         */
        System.out.println("Überlauf bei int: " + (1_000_000_000 + 2_000_000_000));

        /* Jetzt mit einem Operanden vom Typ long. Der andere Operand
         * wird automatisch von int nach long gewandelt. Die Operation
         * wird im Wertebereich von long ausgeführt, deshalb kein Überlauf.
         */
        System.out.println("Kein Überlauf bei long: " + (1_000_000_000 + 2_000_000_000L));

        /* 2 wird in Typ des anderen Operanden, also double, gewandelt.
         * Das Ergebnis der Operation ist vom Typ double.
         */
        System.out.println(2.5 * 2);

        /* Erst wird dividiert, Ergebnis 2, dann wird implizit in Typ
         * des anderen Operanden, also double, gewandelt. Das Ergebnis
         * der Operation ist vom Typ double.
         */
        System.out.println(5 / 2 - 1.0);

        /* Bei der Konvertierung von ganzzahligen in Gleitkommawerte
         * kann Genauigkeit verloren gehen.
         */
        System.out.println("long plus float: " + (100_000_000_000L + 0F));

        /* Wahrheitswerte lassen sich nicht in nummerische
         * Typen konvertieren.
         */
        // System.out.println(true + 2);

        /* Typverträgliche Zuweisungen, da Ausdrücke auf der rechten Seite
         * sog. konstante Ausdrücke sind und ihre Werte im Wertebereich der
         * Variablentypen liegen.
         */
        short s = 100;
        byte b = 50 + 60;
    }
}
