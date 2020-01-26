/**
 *
 * @author Sarah Grugiel
 */
public class Uebung103 {

    public static boolean enthaeltZiffer(String s) {
        int i = 0;
        
        while (i < s.length()  && (s.charAt(i) > '9' || s.charAt(i) == ' ')) {
            i++;
        }
        return i < s.length();
    }

     /*
    public static boolean enthaeltZiffer(String s) {
        int i = 0;
        boolean enthaeltZiffer = false;
        
        while (i < s.length()) {
            if(s.charAt(i) <= '9' && s.charAt(i) != ' ') {
                enthaeltZiffer = true;
            }
            i++;
        }
        return enthaeltZiffer;
    }
*/
    
    public static void main(String[] args) {
        System.out.println(enthaeltZiffer("H al1o"));
        System.out.println(enthaeltZiffer("H allo"));
    }
}
