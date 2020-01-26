
package whd2;

/**
 *
 * @author sarantel
 */
public class Aufgabe103 {
    public static boolean enthaeltZiffer(String s) {
        int i = 0;
        
        while (i < s.length() && (s.charAt(i) < '0' || s.charAt(i) > '9')) {
            i++;
        }
        
        return i != s.length();
    }
    
    public static boolean enthaeltZiffer2(String s) {
        int i = 0;
        boolean enthaeltZiffer = false;
        
        while (i < s.length()) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                enthaeltZiffer = true;
            }
            
            i++;
        }
        
        return enthaeltZiffer;
    }
    
    public static void main(String[] args) {
        System.out.println(enthaeltZiffer("Hallo ich bin ein Test"));
        System.out.println(enthaeltZiffer("Hallo ich bin 1 Test"));
        System.out.println(enthaeltZiffer("Hallo ich bin ein Test!"));
        System.out.println();
        System.out.println(enthaeltZiffer2("Hallo ich bin ein Test"));
        System.out.println(enthaeltZiffer2("Hallo ich bin 1 Test"));
        System.out.println(enthaeltZiffer2("Hallo ich bin ein Test!"));
    }
}
