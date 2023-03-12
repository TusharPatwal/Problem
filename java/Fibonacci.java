
// Fibonacci series in Java
import java.util.*;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        int n = 0, m = 1, o;
        System.out.print(n + " " + m);

        for (int i = 2; i <= x; i++) {
            o = n + m;
            System.out.print(" " + o);
            n = m;
            m = o;
        }
        sc.close();
    }
}
