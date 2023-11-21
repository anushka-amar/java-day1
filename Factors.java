import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for N");
        double N = scanner.nextDouble();

        double harmonic = 0;


        for(double i=1; i<=N; i++){

             harmonic = harmonic + 1/i;
        }

        System.out.println("Nth harmonic number is "+harmonic);
    }
}
