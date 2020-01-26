
package wdh;

/**
 *
 * @author sarantel
 */
public class Aufgabe108 {
    
    public static String gibLaengstesKonstantesStueck(String s) {
        int laenge = s.length();
        String stueck = "";
        char[] array = new char[laenge];
        
        for (int i = 0; i < laenge - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                for (int j = 0; j < laenge; j++) {
                    int schleife = 0;
                    
                    array[schleife] = s.charAt(i);
                    array[schleife + 1] = s.charAt(i + 1);
                    schleife++;
                }
                
            }
        }
        
        for(int i = 0; i < array.length; i++) {
            stueck = "" + array[i];
        }
        
        return stueck;
    }
    
    
    public static void main(String[] args) {
        String test1 = "Essskaliert";
        String test2 = "Esssskaliert wieder hart";
        
        System.out.println(gibLaengstesKonstantesStueck(test1));
        System.out.println(gibLaengstesKonstantesStueck(test2));
    }
}
