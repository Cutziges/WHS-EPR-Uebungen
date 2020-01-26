/**
 *
 * @author sarantel
 */
public class Reko {
    public static void main (String[] args) {
        /** System.out.println(0xCFFFFFFF
                + 007324237
                + 0b111011101
                + 14);
        System.out.println(0xCFFFFFFF);
        System.out.println(007324237);
        System.out.println(0b111011101);
        */
        
        double a = (1.25 + 2.75F);
        double b = (double) (5 / 2);
        double c = 5 / 4 + 0.75;
        boolean d = (10F >= 11) && (2.0 > (3 % 0));
        byte e = (byte) 0x180;
        // boolean f = (1 == true);
        String f = "t" + 4 + 5;
        boolean g = 0x7FFFFFFF < (int) (1.5 * 0x7FFFFFFF);
        
        System.out.println("Typ: double      Wert: " + a);
        System.out.println("Typ: double      Wert: " + b);
        System.out.println("Typ: double      Wert: " + c);
        System.out.println("Typ: boolean     Wert: " + d);
        System.out.println("Typ: byte        Wert: " + e);
        System.out.println("Typ: String      Wert: " + f);
        System.out.println("Typ: boolean     Wert: " + g);
    }
    
}
