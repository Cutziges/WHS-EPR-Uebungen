package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Arrays {
    /**
     * Arrayspielerei.
     */
    public static void ausgabe() {
        
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8};
        
        a = b;
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
    
    public static void rotiere(int[] array, int verschiebung) {
        int laenge = array.length;
        int[] neuesArray = new int[laenge];
        
        for (int i = 0; i < laenge; i++){
            int hilfs = (i + verschiebung) % laenge;
            
            neuesArray[hilfs] = array[i];
        }
        
        for (int j = 0; j < laenge; j++) {
            System.out.printf(neuesArray[j] + " ");
        }
    }
    
    
     /**
     * Methode zur Ausgabe des Ergebnisses.
     * @param args wird nicht genutzt
     */
    
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        
        //ausgabe();
        rotiere(test, 8);
    }
    
}
