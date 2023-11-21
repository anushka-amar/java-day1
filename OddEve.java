import java.util.Scanner;

public class OddEve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter number");
        int num = scanner.nextInt();

        if(num%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
    }
}
