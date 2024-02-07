import java.util.Scanner;

public class CountVowel {
    /*
     * Write a program that  counts  the number of vowels
     * in a sentence
     * 
     * e.g "Hello World" => returns 2
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();//convert to lowercase to handle both  upper and lower case vowels
        scanner.close();

        int vowelCount = 0;
        for(int i = 0; i < sentence.length(); i++ )
        {
            char ch = sentence.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the sentence: "+vowelCount);
     }
     /*
      * output 
        Do you know that I want be supperstar developer like John Smith => 19
      */
}
