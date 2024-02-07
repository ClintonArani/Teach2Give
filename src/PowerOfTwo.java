import java.util.Scanner;

public class PowerOfTwo {
    /*
     * write a program that takes an integer as input and 
     * returns true if the input is a power of two
     * Example:
     * 8=>returns true
     * 6=>returns false
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        boolean isPowerOfTwo = checkPowerOfTwo(number);
        System.out.println(number + " => " + isPowerOfTwo);
        scanner.close();
    }
    public static boolean checkPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // A number is a power of two if it has only one bit set in its binary representation
        // So, we use the bitwise AND operation to check if there is only one bit set
        return (n & (n - 1)) == 0;
    }
    /*
     * output
     * 32 =>true
     * 36 =>false
     */
}
