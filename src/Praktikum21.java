/**
 *
 * @author Sarah Grugiel
 */
public class Praktikum21 {
    
    public static void rechneFinC(int fahrenheit) {
        int f = fahrenheit;
        int c = 0;
        
        c = ((f - 32) * 5) / 9;
        System.out.println(f + " Fahrenheit sind " + c + "°C");
    }
    
    public static void main(String args[]) {
        rechneFinC(40);
        rechneFinC(41);
    }
    
}
