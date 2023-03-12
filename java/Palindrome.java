
// Palindrome Program in Java
import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0, temp;
        temp = n;

        while (n > 0) {
            int r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
        sc.close();
    }
}
