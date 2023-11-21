public class PowerOf2 {
    public static void main(String[] args) {
        // Check if the correct number of command-line arguments is provided
        if (args.length != 1) {
            System.out.println("Usage: java PowerOf2 <N>");
            return;
        }

        // Parse the command-line argument
        int N = Integer.parseInt(args[0]);

        // Check if N is within the valid range
        if (N < 0 || N >= 31) {
            System.out.println("N should be in the range 0 <= N < 31");
            return;
        }

        // Print the table of powers of 2
        System.out.println("Powers of 2 up to 2^" + N + ":");
        for (int i = 0; i <= N; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}
