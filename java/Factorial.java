// Factorial Program in Java
import java.util.*;
class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to take factorial: ");
        int n = sc.nextInt();
        int fac = 1;

        for(int i = 1; i<=n; i++){
            fac *= i;
        }
        System.out.println("The factorial is " + fac);
        sc.close();
    }    
}
