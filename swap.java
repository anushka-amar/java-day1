import java.util.Scanner;

public class swap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter num1");
        int num1 = scanner.nextInt();

        System.out.println("Enter num2");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping: "+ "num1 is " + num1 + " and num2 is " + num2);

        int temp = num2;
        num2 = num1;
        num1 = temp;

        System.out.println("Before swapping: "+ "num1 is " + num1 + " and num2 is " + num2);

    }
}
