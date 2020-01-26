package wdh;

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

    /**
     * Gibt an, ob der übergebene Wert im Baum enthalten ist.
     *
     * @param wert Wert, für den geprüft wird, ob er im Suchbaum enthalten ist
     * @return <code>true</code> genau dann, wenn der Wert enthalten ist
     */
    public boolean istEnthalten(String wert) {
        return (this.wurzel != null) 
                && this.wurzel.istEnthalten(wert);
    }

    /**
     * Fügt dem Suchbaum einen neuen Knoten für den übergebenen Wert hinzu. Der
     * Knoten wird so hinzugefügt, dass der Baum ein Suchbaum bleibt.
     *
     * @param wert Wert, der dem Baum hinzugefügt wird
     */
    public void fuegeHinzuRekursiv(String wert) {

        if (this.wurzel == null) {
            // Baum ist leer, ersten Knoten (Wurzel) erzeugen
            this.wurzel = new Baumknoten(wert);
        } else {
            // Setzt den Wert dort, wo er hingehört (links / rechts)
            this.wurzel.fuegeHinzu(wert);
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
