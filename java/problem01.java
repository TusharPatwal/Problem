
// Prime Number Program in Java
import java.util.*;

class problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        boolean flag = true;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(n + " is a prime number");
            }
        }
        sc.close();
    }
}