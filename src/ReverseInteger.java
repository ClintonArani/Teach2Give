import java.util.Scanner;

public class ReverseInteger {
    /*
     * Write a program that takes integer as input
     * and returns an integer with reversed digit
     * ordering
     * Example: 
     * For input 500, the program should return 5,
     * For input -56, the program should return -65,
     * For input -90, the program should return -9,
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();

        int reversedNum = ReverseInteger(num);

        System.out.println("Reversed integer: "+ reversedNum);
     }

     public static int ReverseInteger(int num)
     {
        int reversedNum = 0;
        while (num != 0)
        {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
     }

     /*
      * output
        for input of 23 => 32
        for input of -45 => -54
      */

}
