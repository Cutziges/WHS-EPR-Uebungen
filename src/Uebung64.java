
import static java.util.Arrays.copyOfRange;

/**
 *
 * @author sarantel
 */
public class Uebung64 {
    
    /**
     * Diese Methode nimmt die Ziffernfolge an und übergibt sie an die
     * Halbierungsmethode als long-Array.
     * @param eingabe Ziffernfolge
     * @return Übergabe des Arrays an Halbierungsmethode
     */
    static long[] uebergebe(long eingabe) {
        long folge = eingabe;
        long folge2 = eingabe;
        int groesse = 0;
        long restwert = 0;
        
        // Ermittlung der Größe des Arrays
        while (folge2 != 0) {
            folge2 = folge2 / 10;
            groesse++;
        }
        
        // Array zur Speicherung der Eingabe
        long[] uebergabe = new long[groesse];
        
        // Ziffernfolge als einzelne Ziffern an Array übergeben
        while (folge != 0) {
            for (int i = 0; i < groesse; i++) {
                restwert = folge % 10;
                uebergabe[i] = restwert;
                folge = folge / 10;
            }
        }
        return halbiere(uebergabe);
    }
    
    /**
     * Methode zum Halbieren der Ziffernfolge.
     * @param array Übergebenes Array von Übergebe-Methode
     * @return Gibt Arrays zum Sortieren und Mischen zurück
     */
    public static long[] halbiere (long[] array) {
        // Länge für die beiden Teilfolgen
        int haelfte = (array.length / 2);
        int laenge = array.length;
        
        // Falls Ziffernfolge nur aus einer Ziffer bestehen sollte,
        // dann wird die Eingabe direkt zurück gegeben
        if (laenge == 0) {
            return array;
        }
        
        // Arrays für die beiden Teilfolgen
        long[] a = copyOfRange(array, 0, haelfte);
        long[] b = copyOfRange(array, haelfte, laenge);
        
        // Zurückgeben der beiden Teilfolgen, welche direkt im Anschluss
        // sortiert und gemischt werden
        return mische(sortiere(a), sortiere(b));
    }
    
    /**
     * Sortiert das übergebene Array.
     * @param sortArray Zu sortierendes Array
     * @return Gibt das sortierte Array zurück
     */
    public static long[] sortiere(long[] sortArray) {
        // Länge des Arrays
        int laenge = sortArray.length;
        
        // Sortiert die Ziffern des Arrays nach ihrer Größe
        for (int i = 0; i < laenge - 1; i++) {
            for (int j = laenge - 1; j > i; j--) {
                if (sortArray[j - 1] > sortArray[j]) {
                    long temp = sortArray[j - 1];
                    sortArray[j - 1] = sortArray[j];
                    sortArray[j] = temp;
                }
            }
        }
        return sortArray;
    }

    /**
     * Mischt die Arrays a und b und gibt das Ergebnis in c zurück.
     * @param a Teilfolge 1
     * @param b Teilfolge 2
     * @return Gibt die beiden Teilfolgen in c zurück
     */
    public static long[] mische(long[]a, long[]b) {
        // Laufindizes
        int i = 0;
        int j = 0;
        int k = 0;
        
        // Array c, welches a und b vereint
        long[] c = new long[a.length + b.length];
        
        // Mischen, bis ein Array leer ist
        while ((i < a.length) && (j < b.length)) {
            // das kleinere Element wird in c gespeichert
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // eventueller Rest von Folge a
        while (i < a.length) {
            c[k++] = a[i++];
        }
        
        // eventueller Rest von Folge b
        while (j < b.length) {
            c[k++] = b[j++];
        }
        
        // Ausgabe der ursprünglichen Ziffernfolge
        System.out.print("Eingegebene Ziffernfolge: ");
        for (int m = 0; m < a.length; m++) {
            System.out.print(a[m]);
        }
        for (int m = 0; m < b.length; m++) {
            System.out.print(b[m]);
        }
        System.out.println();
        
        // Ausgabe der sortierten Ziffernfolge
        System.out.print("Sortierte Reihenfolge: ");
        for (int m = 0; m < c.length; m++) {
            System.out.print(c[m]);
        }
        System.out.println();

        // Ergebnis zurückgeben
        return c;
    }
    
    /**
     * Gibt die sortierte Ziffernfolge wieder aus.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        uebergebe(12410032);
    }
}
