import java.util.Scanner;

public class RunTime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int laps = s.nextInt();
        int signs = s.nextInt();

        int total = laps * signs;

        for (int i = 10; i <= 90; i += 10) {
            int placas = (int) Math.ceil(total * (i / 100.0));
            System.out.print(placas);
            if (i < 90) System.out.print(" ");
        }

        s.close();
    }
}
