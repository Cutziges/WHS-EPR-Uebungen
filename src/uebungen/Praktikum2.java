
package uebungen;

/**
 *
 * @author Sarah Grugiel
 */
public class Praktikum2 {
    /**
     * Methode zur Ausgabe der Werte.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        // Aufgabe 2.1: Umrechnung Fahrenheit in Celsius
        int f1 = 40;
        int c1 = ((f1 - 32) * 5) / 9;
        int f2 = 41;
        int c2 = ((f2 - 32) * 5) / 9;
        
        // Aufgabe 2.2: Umrechnung schweizer Franken in Euro
        int s1 = 100;
        int e1 = (int) (s1 / 1.1401);
        int s2 = 10000;
        int e2 = (int) (s2 / 1.1401);
        
        // Aufgabe 2.3: Ausgabe von vollen Stunden im Format hmm
        int m1 = 5;
        int h1 = ((m1 / 60) * 100) + (m1 % 60);
        int m2 = 59;
        int h2 = ((m2 / 60) * 100) + (m2 % 60);
        int m3 = 60;
        int h3 = ((m3 / 60) * 100) + (m3 % 60);
        int m4 = 61;
        int h4 = ((m4 / 60) * 100) + (m4 % 60);
        int m5 = 825;
        int h5 = ((m5 / 60) * 100) + (m5 % 60);
        // kleiner Test
        int minuten = h5 % 100;
        int stunden = h5 / 100;
        
        System.out.println(f1 + " Grad Fahrenheit sind " + c1 
                + " Grad Celsius.");
        System.out.println(f2 + " Grad Fahrenheit sind " + c2 
                + " Grad Celsius.");
        
        System.out.println(s1 + " schweizer Franken sind " + e1 
                + " Euro.");
        System.out.println(s2 + " schweizer Franken sind " + e2 
                + " Euro.");
        
        System.out.println(m1 + " Minuten sind " + h1 
                + " Stunden (Format hmm).");
        System.out.println(m2 + " Minuten sind " + h2 
                + " Stunden (Format hmm).");
        System.out.println(m3 + " Minuten sind " + h3 
                + " Stunden (Format hmm).");
        System.out.println(m4 + " Minuten sind " + h4 
                + " Stunden (Format hmm).");
        System.out.println(m5 + " Minuten sind " + h5 
                + " Stunden (Format hmm).");
        System.out.println(m5 + " Minuten sind " + stunden 
                + " Stunden und " + minuten + " Minuten.");
    }
    
}
