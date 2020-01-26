package uebungen;

public class Aufgabe81 {
    // Aufgabe 1: Liefert dann true, wenn die Zahl < 10 ist, oder die 
    // Ziffernfolge echt aufsteigende Ziffern hat (z.B. 123)
    /*
    public static boolean f(int zahl) {
        return (zahl < 10)
            ? true
            : (zahl / 10 % 10 < zahl % 10)
                ? f(zahl / 10)
                : false;
    }
    */
    
    // Aufgabe 2: Liefert dann true, wenn die Zahl < 10 ist, aber nur unter der
    // Bedingung, dass die Ziffern echt absteigend sind (z.B. 321)
    /*
    public static boolean f(int zahl) {
        return (zahl < 10)
            ? false
            : (zahl / 10 % 10 < zahl % 10)
                ? f(zahl / 10)
                : true;
    }
    */
    
    // Aufgabe 3: Liefert dann true, wenn die Zahl < 10 ist, oder wenn die
    // Ziffernfolge gleiche oder aufsteigende Ziffern hat (z.B. 1223)
    /*
    public static boolean f(int zahl) {
        return (zahl / 10 % 10 >= zahl % 10)
            ? false
            : (zahl < 10)
                ? true
                : f(zahl / 10);
    }
    */
    
    // Aufgabe 4: Liefert immer true
    /*
    public static boolean f(int zahl) {
        return (zahl < 10)
            ? true
            : (zahl / 10 % 10 < zahl % 10)
                ? f(zahl / 10)
                : true;
    }
    */
    
    public static boolean f(int zahl) {
        return (zahl < 10)
                || ((zahl / 10 % 10 < zahl % 10) && f(zahl / 10));
    }
    
    /*
    public static boolean f(int zahl) {
        int a = zahl;
        
        return (zahl < 7)
            ? true
            : (zahl / 7 % 7 < zahl % 7)
                ? f(zahl / 7)
                : false;
    }
*/
    
    public static void main(String[] args) {
        System.out.println("0: " + f(0));
        System.out.println("1: " + f(1));
        System.out.println("2: " + f(2));
        System.out.println("3: " + f(3));
        System.out.println("4: " + f(4));
        System.out.println("5: " + f(5));
        System.out.println("6: " + f(6));
        System.out.println("7: " + f(7));
        System.out.println("8: " + f(8));
        System.out.println("9: " + f(9));
        System.out.println("10: " + f(10));
        System.out.println("11: " + f(11));
        System.out.println("12: " + f(12));
        System.out.println("13: " + f(13));
        System.out.println("14: " + f(14));
        System.out.println("157: " + f(157));
        System.out.println("32: " + f(32));
        System.out.println("123: " + f(123));
        System.out.println("321: " + f(321));
    }
}
