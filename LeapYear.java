import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year between 1000 and 9999: ");
        int year = scanner.nextInt();

        if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            System.out.print("It is a leap year");
        }else {
            System.out.print("It is not a leap year");
        }
    }
}
