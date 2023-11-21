import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of flips");
        int numFlips = scanner.nextInt();

        int hCount = 0;
        int tCount = 0;

        Random random = new Random();

        for(int i=0; i<numFlips; i++){

            double newRandom = random.nextDouble();

            if(newRandom<0.5){
                tCount++;
            }else if(newRandom>0.5){
                hCount++;
            }
        }

        double hPer = (double) hCount / numFlips * 100;
        double tPer = (double) tCount / numFlips * 100;

        System.out.println("Tail Percentage is " + tPer);
        System.out.println("Head Percentage is "+ hPer);
    }
}
