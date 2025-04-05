import java.util.Scanner;

public class SelectionTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a, b, c, d;
        System.out.print("Enter a, b, c, d: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();

        int somaCD = c + d;
        int somaAB = a + b;

        if (b > c && d > a && somaCD > somaAB && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Accepted values.");
        } else {
            System.out.println("Values not accepted.");
        }

        s.close();
    }
}
