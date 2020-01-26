
package wdh4;

/**
 *
 * @author sarantel
 */
public class Aufgabe105 {
    public static boolean istOhneDoppelte(String s) {
        int i = s.length() - 1;
        
        while (i > 0 && (s.charAt(i) != s.charAt(i - 1))) {
            i--;
        }
        
        return i == 0;
    }
    
    public static boolean istOhneDoppelte2(String s) {
        int i = s.length() - 1;
        boolean keineDoppelten = true;
        
        while (i > 0) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                keineDoppelten = false;
            }
            
            i--;
        }
        
        return keineDoppelten;
    }
    
    
    public static void main(String[] args) {
        System.out.println(istOhneDoppelte("Römer"));
        System.out.println(istOhneDoppelte("Sommer"));
        System.out.println();
        System.out.println(istOhneDoppelte2("Römer"));
        System.out.println(istOhneDoppelte2("Sommer"));
    }
}
