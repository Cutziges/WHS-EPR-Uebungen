/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wdh;

/**
 *
 * @author sarantel
 */
public class Aufgabe32 {
    /*                                      Ergebnis        Typ
    1.25 + 2.75F                            4.0             double
    (double) (5 / 2)                        2.0             double (Argumente sind int)
    5 / 4 + 0.75                            1.75            double
    (10F >= 11) && (2.0 > (3 % 0))          false           boolean
    (10F >= 11) & (2.0 > (3 % 0))           Fehler wegen 3 % 0 (Division mit 0)
    (byte) 0x180                            -128            byte
    1 == true                               Fehler, da int =/= boolean
    (char) ('a' + 1)                        b               char
    0x80000000L > (int) (1.5 * 0x7FFFFFFF)  true            boolean
    2 > 1.5 ? 5 : 4 * 1.5                   5.0             double
    */
    
    public static double gibWert() {
        long a = 0x80000000L;
        double b = (int)(1.5 * 0x7FFFFFFF);
        
        double ergebnis = (2 > 1.5)
                ? 5
                :4 * 1.5;
        
        return ergebnis;
    }
    
    public static void main(String[] args) {
        //gibWert(5 / 4, 0.75);
        System.out.print((byte)0x30);
        
    }
    
}
