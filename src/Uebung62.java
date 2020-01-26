/**
 *
 * @author Sarah Grugiel
 */
public class Uebung62 {
    
    static long dreheUm(long eingabe) {
        long zahl = eingabe;
        long zahl2 = eingabe;
        long restwert;
        int zaehler = 0;
        
        while(zahl2 != 0) {
            zahl2 = zahl2 / 10;
            zaehler++;
        }
        
        long speicher[] = new long[zaehler];
        
        while(zahl != 0) {
            for(int i = 0 ; i < zaehler ; i++) {
                restwert = zahl % 10;
                speicher[i] = restwert;
                zahl = zahl / 10;
            }
        }
        
        for(int i = 0; i < zaehler ; i++){
            System.out.print(speicher[i]);
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        dreheUm(123456789);
    }
}
