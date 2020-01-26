
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe105 {
    public static boolean istOhneDoppelte(String s) {
        int i = s.length() - 1;
        
        while (i > 0 && s.charAt(i) != s.charAt(i - 1)) {
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
        String test1 = "Sommer";
        String test2 = "Römer";
        String test3 = "SSkaliert";
        
        System.out.println("Sommer: " + istOhneDoppelte(test1));
        System.out.println("Römer: " + istOhneDoppelte(test2));
        System.out.println("SSkaliert: " + istOhneDoppelte(test3));
        System.out.println();
        System.out.println("Sommer: " + istOhneDoppelte2(test1));
        System.out.println("Römer: " + istOhneDoppelte2(test2));
        System.out.println("SSkaliert: " + istOhneDoppelte2(test3));
        
    }
    
}
