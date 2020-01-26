package uebungen;

import wdh.*;

/**
 * Ein Objekt dieser Klasse repräsentiert einen binären Suchbaum, dessen Knoten
 * Zeichenketten enthalten.
 */
public class BinaererSuchbaum {

    /**
     * Wurzelknoten dieses Suchbaums.
     */
    private Baumknoten wurzel;

    /**
     * Erzeugt einen leeren Suchbaum.
     */
    public BinaererSuchbaum() {

        this.wurzel = null;
    }

    // Traversierungen --------------------------------------------------------
    
    /**
     * Durchläuft die Knoten dieses Baums in Inorder-Reihenfolge und gibt deren
     * Inhalt aus.
     *
     * @return Inhalte der Inorder-Traversierung, jeweils ein Knoteninhalt pro
     * Zeile
     */
    public String gibInorderfolge() {

        return (this.wurzel == null)
                ? ""
                : this.wurzel.gibInorderfolge();
    }

    /**
     * Liefert die Preorder-Folge dieses Baums in eingerückter Form.
     *
     * @return Preorder-Folge in eingerückter Form mit einem Element pro Zeile
     */
    public String gibPreorderfolge() {

        return (this.wurzel == null)
                ? "(leer)"
                : this.wurzel.gibPreorderfolge();
    }

    /**
     * Gibt an, ob der übergebene Wert im Baum enthalten ist.
     *
     * @param wert Wert, für den geprüft wird, ob er im Suchbaum enthalten ist
     * @return <code>true</code> genau dann, wenn der Wert enthalten ist
     */
    public boolean istEnthalten(String wert) {

        /*
         * Wert ist enthalten, wenn Baum nicht leer ist und der durch die Wurzel
         * aufgespannte Baum den Wert enthält.
         */
        return (this.wurzel != null) && this.wurzel.istEnthalten(wert);
    }

    /**
     * Fügt dem Suchbaum einen neuen Knoten für den übergebenen Wert hinzu. Der
     * Knoten wird so hinzugefügt, dass der Baum ein Suchbaum bleibt.
     *
     * @param wert Wert, der dem Baum hinzugefügt wird
     */
    public void fuegeHinzuRekursiv(String wert) {

        if (this.wurzel == null) {

            /*
             * Baum ist leer. Ersten Knoten erzeugen.
             */
            this.wurzel = new Baumknoten(wert);

        } else {

            /*
             * Baum ist nicht leer. Wurzel bleibt beim Einfügen unverändert.
             */
            this.wurzel.fuegeHinzu(wert);
        }
    }

    /**
     * Fügt dem Suchbaum einen neuen Knoten für den übergebenen Wert hinzu. Der
     * Knoten wird so hinzugefügt, dass der Baum ein Suchbaum bleibt.
     *
     * @param wert Wert, der dem Baum hinzugefügt wird
     */
    public void fuegeHinzuIterativ(String wert) {

        /*
         * Blatt für übergebenen Wert erzeugen.
         */
        Baumknoten knoten = new Baumknoten(wert);

        /*
         * Baum von der Wurzel zu dem Knoten durchlaufen, an den der neue Knoten
         * als Kind angefügt werden muss.
         */
        
        /*
         * Enthält stets den Knoten, mit dem verglichen wird, ob der Wert rechts
         * oder links davon eingefügt werden muss.
         */
        Baumknoten aktuellerKnoten = this.wurzel;

        /*
         * Vater des aktuellen Knotens. Enthält schließlich den Knoten, an dem
         * der Knoten für den einzufügenden Wert eingefügt wird.
         */
        Baumknoten vater = null;

        /*
         * Gibt an, ob beim Abstieg im Baum nach rechts verzweigt wurde. true
         * genau dann, wenn nach rechts verzweigt wurde. Wird benötigt, um am
         * Ende entscheiden zu können, ob der neue Knoten linkes oder rechtes
         * Kind von vater wird.
         */
        boolean nachRechtsVerzweigt = false;

        /*
         * Solange im Baum absteigen, wie noch kein Blatt erreicht ist.
         */
        while (aktuellerKnoten != null) {

            /*
             * Zum linken oder rechten Kind verzweigen. Aktueller Knoten wird
             * dann zum Vater dieses Kindes.
             */
            vater = aktuellerKnoten;

            if (wert.compareTo(aktuellerKnoten.gibInhalt()) <= 0) {

                /*
                 * Der einzufügende Wert ist kleiner oder gleich dem Inhalt des
                 * aktuellen Knotens. Der neue Knoten muss im linken Teilbaum
                 * eingefügt werden.
                 */
                nachRechtsVerzweigt = false;
                aktuellerKnoten = aktuellerKnoten.gibLinkenTeilbaum();

            } else {

                /*
                 * Der einzufügende Wert ist größer als der Inhalt des aktuellen
                 * Knotens. Der neue Knoten muss im rechten Teilbaum eingefügt
                 * werden.
                 */
                nachRechtsVerzweigt = true;
                aktuellerKnoten = aktuellerKnoten.gibRechtenTeilbaum();
            }
        }

        if (vater == null) {

            /*
             * Die obige Schleife wurde nicht durchlaufen. Der Baum ist leer.
             */
            this.wurzel = knoten;

        } else if (nachRechtsVerzweigt) {

            /*
             * Die letzte Verzweigung erfolgte nach rechts. Der neue Knoten wird
             * rechtes Kind des Vaterknotens.
             */
            vater.setzeRechtenTeilbaum(knoten);

        } else {

            /*
             * Der neue Knoten wird linkes Kind des Vaterknotens.
             */
            vater.setzeLinkenTeilbaum(knoten);
        }
    }

    /**
     * Entfernt aus dem Suchbaum den angegebenen Wert, sofern er im Baum
     * existiert. Gibt es keinen Knoten mit diesem Wert, bleibt der Baum
     * unverändert.
     *
     * @param wert Wert, der aus dem Baum entfernt wird
     */
    public void entferne(String wert) {

        if (this.wurzel != null) {
            this.wurzel = this.wurzel.entferne(wert);
        }
    }
}
