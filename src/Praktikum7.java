/**
 *
 * @author Sarah Grugiel
 */
public class Praktikum7 {
    
    public static long addiere(long x, long y, int z) {
        long a = x;
        long b = y;
        int basis = z;
        long carry = 0;
        long ergebnis = 0;
        
        
        if (basis == 2) {
            while ((a != 0) && (b != 0)) {
                if ((a % 2 == 1) && (b % 2 == 1) && (carry == 0)) {
                    long zwErgebnis = 0;
                    carry = 1;
                    a = a / 10;
                    b = b / 10;
                }
                if ((a % 2 == 1) && (b % 2 == 1) && (carry == 1)) {
                    long zwErgebnis = 1;
                    carry = 1;
                    a = a / 10;
                    b = b / 10;
                } 
                if ((a % 2 == 0) && (b % 2 == 0) && (carry == 0)) {
                    long zwErgebnis = 0;
                    a = a / 10;
                    b = b / 10;
                }
                if ((a % 2 == 0) && (b % 2 == 0) && (carry == 1)) {
                    long zwErgebnis = 1;
                    a = a / 10;
                    b = b / 10;
                }
                if ((a % 2 == 1) && (b % 2 == 0) && (carry == 0)
                        || (a % 2 == 0) && (b % 2 == 1) & (carry == 0)) {
                    long zwErgebnis = 1;
                    a = a / 10;
                    b = b / 10;
                }
                if ((a % 2 == 1) && (b % 2 == 0) && (carry == 1)
                        || (a % 2 == 0) && (b % 2 == 1) & (carry == 1)) {
                    long zwErgebnis = 0;
                    carry = 1;
                    a = a / 10;
                    b = b / 10;
                }
            }
        }
        
        return ergebnis;
    }
    
    public static void main(String[] args) {
        System.out.print(addiere(101, 100, 2));
    }
    
}
