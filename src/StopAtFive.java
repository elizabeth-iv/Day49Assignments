import java.util.Scanner;

public class StopAtFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give me a number:");
            int number = scanner.nextInt();
            if (number == 5) {
                break;
            }
        }
    }
}
