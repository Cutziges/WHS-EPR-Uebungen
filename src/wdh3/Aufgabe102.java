/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wdh3;

/**
 *
 * @author sarantel
 */
public class Aufgabe102 {
    public static boolean enthaeltZiffernpaar(long zahl) {
        while (zahl > 0 && (zahl / 10 % 10 != zahl % 10)) {
            zahl = zahl / 10;
        }
        
        return zahl != 0;
    }
    
    public static boolean enthaeltZiffernpaar2(long zahl) {
        boolean enthaeltPaar = false;
        
        while (zahl > 0) {
            if (zahl / 10 % 10 == zahl % 10) {
                enthaeltPaar = true;
            }
            
            zahl = zahl / 10;
        }
        
        return enthaeltPaar;
    }
    
    public static void main(String[] args) {
        System.out.println(enthaeltZiffernpaar(1337));
        System.out.println(enthaeltZiffernpaar(1234));
        System.out.println();
        System.out.println(enthaeltZiffernpaar2(1337));
        System.out.println(enthaeltZiffernpaar2(1234));
    }
    
}
