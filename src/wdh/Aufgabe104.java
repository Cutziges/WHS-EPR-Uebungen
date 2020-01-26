
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe104 {
    public static boolean istGroesser(String s1, String s2) {
        int i = 0;
        
        while (i < s1.length() && s1.charAt(i) > s2.charAt(i)) {
            i++;
        }
        
        return i == s1.length();
    }
    
    
    public static boolean istGroesser2(String s1, String s2) {
        int i = 0;
        boolean istGroesser = true;
        
        while (i < s1.length()) {
            if (s1.charAt(i) < s2.charAt(i)) {
                istGroesser = false;
            }
            
            i++;
        }
        
        return istGroesser;
    }
    
    public static void main(String[] args) {
        String test1 = "5678";
        String test2 = "1234";
        String test3 = "4789";
        String test4 = "9999";
        
        System.out.println(istGroesser(test1, test2));
        System.out.println(istGroesser(test3, test4));
        System.out.println();
        System.out.println(istGroesser2(test1, test2));
        System.out.println(istGroesser2(test3, test4));
    }
}
