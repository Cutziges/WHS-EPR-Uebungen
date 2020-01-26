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
public class Aufgabe92 {
    
    // mit Abbruchvariable
    public static boolean istPrimzahl(int zahl) {
        int teiler = 2;
        boolean teilerGefunden = false;
        
        while (teiler < zahl && !teilerGefunden) {
            if (zahl % teiler == 0) {
                teilerGefunden = true;
            }
            
            teiler++;
        }
        
        return !teilerGefunden;
    }
    
    // ohne Abbruchvariable
    public static boolean istPrimzahl2(int zahl) {
        int teiler = 2;
        
        while (teiler < zahl && zahl % teiler != 0) {
            teiler++;
        }
        
        return teiler == zahl;
    }
    
    public static void main(String[] args) {
        System.out.println(istPrimzahl(11));
        System.out.println(istPrimzahl(10));
        System.out.println();
        System.out.println(istPrimzahl2(11));
        System.out.println(istPrimzahl2(12));
    }
}
