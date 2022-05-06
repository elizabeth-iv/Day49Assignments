import java.util.Scanner;

public class CountToEleven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number less than 11");
        int number = Integer.valueOf(scanner.nextLine());

        int i = number;
        while (i < 11) {

            if (number > 11) {
                break;
            }
            System.out.println(number++);
        }
    }
}

