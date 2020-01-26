public class Uebung53 {
    static void wandleBinInDez(int bin) {
        // Eingabe übergeben
        int binZahl = bin;
        // Zu ermittelnde Dezimalzahl
        int dezZahl = 0;
        // Restwertspeicher
        int restWert = 0;
        int anzVerschiebung = 0;
        
        // While-Schleife für Berechnung
        while (binZahl != 0) {
            restWert = binZahl % 10;
            dezZahl = dezZahl + (int) (restWert * (Math.pow(2, 
                    anzVerschiebung)));
            binZahl = binZahl / 10;
            anzVerschiebung++;
        }
        
        // Ausgabe der Dezimalzahl
        System.out.print(dezZahl);
        
    }
    
    public static void main(String[] args) {
        wandleBinInDez(1001001);
    }
}
        