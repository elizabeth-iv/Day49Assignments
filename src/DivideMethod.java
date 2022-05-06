import java.util.Scanner;

public class DivideMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num = scanner.nextDouble();

        System.out.println("Enter another number: ");
        double num2 = scanner.nextDouble();

        divide(num, num2);
    }
    public static void divide(double num, double num2) {
        System.out.println(num + " / " + num2 + " = " + (num / num2));
    }

}


