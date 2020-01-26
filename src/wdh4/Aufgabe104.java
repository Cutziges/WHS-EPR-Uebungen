
package wdh4;

/**
 *
 * @author sarantel
 */
public class Aufgabe104 {
    public static boolean istGroesser(String s1, String s2) {
        int i = 0;
        
        while (i < s1.length() && (s1.charAt(i) > s2.charAt(i))) {
            i++;
        }
        
        return i == s1.length();
    }
    
    public static boolean istGroesser2(String s1, String s2) {
        int i = 0;
        boolean istGroesser = true;
        while (i < s1.length()) {
            if (s1.charAt(i) <= s2.charAt(i)) {
                istGroesser = false;
            }
            
            i++;
        }
        return istGroesser;
    }
    
    public static void main(String[] args) {
        System.out.println(istGroesser("234", "111"));
        System.out.println(istGroesser("234", "567"));
        System.out.println();
        System.out.println(istGroesser2("234", "111"));
        System.out.println(istGroesser2("234", "567"));
    }
}
