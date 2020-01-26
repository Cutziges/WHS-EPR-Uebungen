package wdh;

/**
 * Ein Baumknoten repräsentiert einen Knoten eines binären Suchbaums. Ebenso
 * repräsentiert er den durch dieses Knoten aufgespannten Baum. Ein Knoten
 * enthält als Inhalt eine Zeichenkette.
 */
public class Baumknoten {

    /**
     * Zeichen für Zeilenumbruch in Strings.
     */
    private static final char ZEILENUMBRUCH = '\n';

    /**
     * Einrückungstiefe für Textdarstellung der Baum-Traversierung.
     */
    private static final String EINRUECKUNGSTIEFE = "    ";

    /**
     * Inhalt dieses Knotens.
     */
    private String inhalt;
    private Baumknoten linkerTeilbaum;
    private Baumknoten rechterTeilbaum;

    /**
     * Erzeugt einen neuen Baumknoten für den übergebenen Inhalt. Der Knoten ist
     * ein Blatt.
     *
     * @param inhalt Wert, für den der Baumknoten erzeugt wird
     */
    public Baumknoten(String inhalt) {
        this.inhalt = inhalt;
        this.linkerTeilbaum = null;
        this.rechterTeilbaum = null;
    }
    
    public String gibInhalt() {
        return this.inhalt;
    }

    public Baumknoten gibLinkenTeilbaum() {
        return this.linkerTeilbaum;
    }
    
    public Baumknoten gibRechtenTeilbaum() {
        return this.rechterTeilbaum;
    }
    
    public void setzeLinkenTeilbaum(Baumknoten knoten) {
        this.linkerTeilbaum = knoten;
    }

    public void setzeRechtenTeilbaum(Baumknoten knoten) {
        this.rechterTeilbaum = knoten;
    }

    /**
     * Fügt dem Suchbaum mit diesem Knoten als Wurzel einen neuen Knoten für den
     * übergebenen Wert hinzu. Der Knoten wird so hinzugefügt, dass der Baum ein
     * Suchbaum bleibt.
     *
     * @param wert Wert, der dem Baum hinzugefügt wird
     */
    public void fuegeHinzu(String wert) {

        if (wert.compareTo(this.inhalt) <= 0) { // Wert ist gleich dem Inhalt,
                                                // oder liegt alphabetisch davor

            if (this.linkerTeilbaum == null) {
                this.linkerTeilbaum = new Baumknoten(wert);
            } else {
                this.linkerTeilbaum.fuegeHinzu(wert);
            }
        } else {
            if (this.rechterTeilbaum == null) { // Wert liegt alphabetisch 
                                                // hinter Inhalt
                this.rechterTeilbaum = new Baumknoten(wert);
            } else {
                this.rechterTeilbaum.fuegeHinzu(wert);
            }
        }
    }

    /**
     * Liefert den maximalen Inhalt aller Knoten des Suchbaums mit diesem Knoten
     * als Wurzel.
     *
     * @return Maximaler Wert dieses Suchbaums
     */
    private String gibMaximalenWert() {

        return (this.rechterTeilbaum == null)
                ? this.inhalt
                : this.rechterTeilbaum.gibMaximalenWert();
    }

    /**
     * Entfernt aus dem Baum mit diesem Knoten als Wurzel den Knoten mit dem
     * maximalen Inhalt.
     *
     * @return Baum ohne den Knoten mit maximalem Inhalt
     */
    private Baumknoten entferneMaximalenWert() {

        /*
         * Wurzelknoten nach dem Entfernen des Werts.
         */
        Baumknoten neueWurzel;

        if (this.rechterTeilbaum == null) {
            neueWurzel = this.linkerTeilbaum;
        } else {
            this.rechterTeilbaum = this.rechterTeilbaum.entferneMaximalenWert();
            neueWurzel = this;
        }

        return neueWurzel;
    }

    /**
     * Entfernt aus dem Suchbaum mit diesem Knoten als Wurzel den angegebenen
     * Wert, sofern er im Baum existiert.
     *
     * @param wert Wert, der aus dem Suchbaum entfernt wird (sofern er überhaupt
     * existiert)
     * @return Baum nach Entfernen des Werts
     */
    public Baumknoten entferne(String wert) {

        /*
         * Wurzelknoten nach dem Entfernen des Werts.
         */
        Baumknoten neueWurzel = this;

        if ((wert.compareTo(this.inhalt) < 0)
                && (this.linkerTeilbaum != null)) {

            /*
             * Wert liegt alphabetisch vor dem Inhalt dieses Knotens. Das
             * Entfernen wird im linken Teilbaum durchgeführt.
             */
            this.linkerTeilbaum = this.linkerTeilbaum.entferne(wert);

        } else if ((wert.compareTo(this.inhalt) > 0)
                && (this.rechterTeilbaum != null)) {

            /*
             * Wert liegt alphabetisch hiner dem Inhalt dieses Knotens. Das
             * Entfernen wird im rechten Teilbaum durchgeführt.
             */
            this.rechterTeilbaum = this.rechterTeilbaum.entferne(wert);

        } else if (wert.equals(this.inhalt)) {

            /*
             * Wert ist gleich dem Inhalt dieses Knotens. Dieser Knoten wird
             * entfernt.
             */
            if (this.rechterTeilbaum == null) {

                /*
                 * Baum ohne diesen Knoten ist der linke Teilbaum, da der rechte
                 * leer ist.
                 */
                neueWurzel = this.linkerTeilbaum;

            } else if (this.linkerTeilbaum == null) {

                /*
                 * Baum ohne diesen Knoten ist der rechte Teilbaum, da der linke
                 * leer ist.
                 */
                neueWurzel = this.rechterTeilbaum;

            } else {

                /*
                 * Beide Teilbäume sind nicht leer. Der größte Inhalt des linken
                 * Teilbaums wird zum Inhalt dieses Knotens. Der entsprechende
                 * Knoten aus dem linken Teilbaum wird entfernt.
                 */
                this.inhalt = this.linkerTeilbaum.gibMaximalenWert();
                this.linkerTeilbaum =
                        this.linkerTeilbaum.entferneMaximalenWert();
            }
        }

        return neueWurzel;
    }

    /**
     * Gibt an, ob der übergebene Wert im Baum enthalten ist.
     *
     * @param wert Wert, für den geprüft wird, ob er im Suchbaum enthalten ist
     * @return <code>true</code> genau dann, wenn der Wert enthalten ist
     */
    public boolean istEnthalten(String wert) {

        boolean istEnthalten;

        if (wert.compareTo(this.inhalt) < 0) {
            istEnthalten = (this.linkerTeilbaum != null)
                    && linkerTeilbaum.istEnthalten(wert);
        } else if (wert.compareTo(this.inhalt) > 0) {
            istEnthalten = (this.rechterTeilbaum != null)
                    && rechterTeilbaum.istEnthalten(wert);

        } else {
            istEnthalten = true; // Wert ist in diesem Knoten enthalten
        }

        return istEnthalten;
    }
}
