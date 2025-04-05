
import java.util.Scanner;

public class Tea {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
    
        int numberOfParticipants = 5;
        int[] participant = new int[numberOfParticipants];
        int soma = 0;

        int teaNumber;
        do {
            System.out.print("Tea number (1 to 4): ");
            teaNumber = s.nextInt();
        } while (teaNumber <= 1 || teaNumber >= 4);

        for (int i = 0; i < numberOfParticipants; i++) {
            System.out.printf("Participant %d: ", i + 1);
            participant[i] = s.nextInt();

            if (participant[i] == teaNumber) {
                soma++;
            }
        }

        System.out.println("Hit rate: " + soma);
        s.close();
    }
}
