import java.util.Scanner;

public class TakeABreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to take a break? (if yes, enter 'yes')");
            String userInput = scanner.nextLine();
            if (userInput.equals("yes")) {
                System.out.println("Go on");
                break;
            }
        }
    }
}



