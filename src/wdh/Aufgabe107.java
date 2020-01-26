
package wdh;

/**
 *
 * @author Sarah Grugiel
 */
public class Aufgabe107 {
    public static long fib(int n) {
        return n <= 2
                ? 1
                : fib(n - 1) + fib(n - 2);
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(8));
    }
}
