import java.util.Scanner;

public class QuoAndRem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the divisor: ");
        int divisor = scanner.nextInt();

        System.out.println("Enter the dividend: ");
        int dividend = scanner.nextInt();

        int quo = dividend/divisor;
        int rem = dividend%divisor;

        System.out.println("The quotient is `"+quo+"` while the remainder is `"+rem+"` ");



    }
}
