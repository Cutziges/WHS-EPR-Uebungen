
public class Binaerumrechner {
    static void wandleDezInBin(int dez){
        int dezZahl = dez; // für Berechnung
        int dezZahl2 = dez; // für While-Schleife
        int anzahlStellen = 0; // für Array
        
        // Berechnet die Anzahl der Binärzahlstellen
        while(dezZahl2 != 0){
            dezZahl2 = dezZahl2 / 2;
            anzahlStellen++;
        }
        
        // Array für Binärzahl
        int[] binZahl = new int[anzahlStellen];
        
        // Einfügen der Binärzahlen ins Array
        for(int i = 0; i < anzahlStellen; i++){
            binZahl[i] = dezZahl % 2;
            dezZahl = dezZahl / 2;
        }
        
        // Ausgabe in umgekehrter Reihenfolge
        for(int i = anzahlStellen-1; i >= 0; i--){
            System.out.print(binZahl[i]);
        }
    }
    
    public static void main(String[] args){
        wandleDezInBin(4);
    }
}
