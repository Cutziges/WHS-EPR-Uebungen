package wdh;

/**
 * Diese Klasse veranschaulicht durch Testaufrufe die Funktionsweise der
 * Klassen BinaererSuchbaum und Baumknoten.
 */
public class BinaererSuchbaumTest {

    /**
     * Liefert Baum mit Zeichenfolgen als Knoteninhalten. Der Parameter enthält
     * die Zeichenfolgen, jeweils durch Komma oder Leerzeichen getrennt.
     *
     * @param bauminhalte Daten (durch Komma oder Leerzeichen getrennt), die im
     * Baum abgelegt werden
     * @return Suchbaum mit den übergebenen Inhalten
     */
    private static BinaererSuchbaum erzeugeBaum(String bauminhalte) {

        BinaererSuchbaum baum = new BinaererSuchbaum();

        java.util.StringTokenizer tokenizer
                = new java.util.StringTokenizer(bauminhalte, ", ");

        /*
         * Token dem Baum hinzufügen.
         */
        while (tokenizer.hasMoreTokens()) {
            baum.fuegeHinzuRekursiv(tokenizer.nextToken());
        }

        return baum;
    }

    /**
     * Testet Methode zum rekursiven Hinzufügen von Inhalten in den Baum.
     */
    private static void testeRekursivesHinzufuegen() {

        BinaererSuchbaum baum;

        baum = new BinaererSuchbaum();  // leerer Baum
        System.out.println();

        /*
         * Inhalte sind vorsortiert. Baum degeneriert zur Liste.
         */
        baum = erzeugeBaum("Auto, Birne, Dach, Fisch, Maus, Pech, Vogel");
        System.out.println();

        /*
         * Inhalte sind umgekehrt vorsortiert. Baum degeneriert zur Liste.
         */
        baum = erzeugeBaum("Vogel, Pech, Maus, Fisch, Dach, Birne, Auto");
        System.out.println();

        /*
         * Reihenfolge führt zu ausgeglichenem Baum.
         */
        baum = erzeugeBaum("Fisch, Birne, Auto, Dach, Pech, Maus, Vogel");
        System.out.println();
    }
    
    /**
     * Testet Methoden zum Entfernen von Inhalten aus dem Baum.
     */
    private static void testeEntfernen() {

        BinaererSuchbaum baum;

        baum = new BinaererSuchbaum();
        baum.entferne("Maus");
        System.out.println();

        /*
         * Reihenfolge führt zu ausgeglichenem Baum.
         */
        baum = erzeugeBaum("Fisch, Birne, Auto, Dach, Pech, Maus, Vogel");
        System.out.println();

        baum.entferne("Fisch");
        System.out.println();

        baum.entferne("Auto");
        System.out.println();

        baum.entferne("Vogel");
        System.out.println();

        baum.entferne("Pech");
        System.out.println();
    }

    /**
     * @param args wird nicht verwendet
     */
    public static void main(String[] args) {

        testeRekursivesHinzufuegen();
        testeEntfernen();
    }
}
