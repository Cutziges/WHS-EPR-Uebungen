
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class UhrzeitTest {   
    public static void main(String[] args) {
        Uhrzeit erste = new Uhrzeit(13, 37);
        Uhrzeit zweite = new Uhrzeit(15, 34);
        
        System.out.println(erste.vorUhrzeit(zweite));
        System.out.println(zweite.vorUhrzeit(erste));
        System.out.println(erste.vorUhrzeit(erste));
        erste.berechneDifferenz(zweite);
        zweite.berechneDifferenz(erste);
        erste.berechneDifferenz(erste);
    }
}
