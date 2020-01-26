/**
 *
 * @author Sarah Grugiel
 */
public class Praktikum23 {
    public static void rechneMinutenInStunden(int eingabe) {
        int minuten = eingabe;
        
        int stunden = ((minuten / 60) * 100) + (minuten % 60);
        System.out.println(stunden);
    }
    
    public static void main(String args[]) {
        rechneMinutenInStunden(5);
        rechneMinutenInStunden(59);
        rechneMinutenInStunden(60);
        rechneMinutenInStunden(61);
        rechneMinutenInStunden(825);
    }
    
}
