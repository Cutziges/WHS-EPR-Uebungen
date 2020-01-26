/**
 *
 * @author sarantel
 */
public class Binaerdarstellung {
    public static String gibBinaerdarstellung(long zahl) {
        String binaerdarstellung = "";
        
        do {
            long rest = zahl % 2;
            zahl = zahl / 2;
            /* Ziffer an Anfang der Binärdarstellung setzen */
            binaerdarstellung = rest + binaerdarstellung;
        } while (zahl > 0);
        
        return binaerdarstellung;
    }
    
    public static void main(String[] args) {
        System.out.println(gibBinaerdarstellung(2384));
    }
}
