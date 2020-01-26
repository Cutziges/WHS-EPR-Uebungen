
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe106 {
    public static boolean istSpiegelung(String s1, String s2) {
        int i = 0;
        
        while (i < s1.length() 
                && s1.charAt(i) == s2.charAt(s2.length() - i - 1)) {
            i++;
        }
        
        return i == s1.length();
    }
    
    public static boolean istSpiegelung2(String s1, String s2) {
        int i = 0;
        boolean istGespiegelt = true;

        while (i < s1.length()) {
            if (s1.charAt(i) != s2.charAt(s2.length() - i - 1)) {
                istGespiegelt = false;
            }

            i++;
        }

        return istGespiegelt;
    }
    
    public static void main(String[] args) {
        String a = "Hallo";
        String b = "ollaH";
        String c = "ollah";
        String d = "Anna";
        String e = "annA";
        
        
        System.out.println(istSpiegelung(a, b));
        System.out.println(istSpiegelung(a, c));
        System.out.println(istSpiegelung(d, e));
        System.out.println();
        System.out.println(istSpiegelung2(a, b));
        System.out.println(istSpiegelung2(a, c));
        System.out.println(istSpiegelung2(d, e));
    }
}
