import java.util.Scanner;

public class CapitalizeWords {
    /*
     * Write a program that accepts a string as input,
     * capitalizes the first letter of each word in the 
     * string, and then returns the resulting string
     * 
     * Example:
     * 'hi' => returns "Hi"
     * 'i love programming' => returns "I Love Programming"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        String capitalizedString = capitalizeWords(inputString);
        System.out.println("Capitalized string: " +capitalizedString);
        scanner.close();
    }

    public static String capitalizeWords(String sentence)
    {
        //split the sentence into words
        String[] words = sentence.split("\\s+");
        StringBuilder capitalizedSentence = new StringBuilder();

        //capitalze the first letter of each word
        for(String word : words)
        {
            if(word.length() > 0)
            {
                String firstLetterCapitalized = word.substring(0,1 ).toUpperCase() + word.substring(1);
                capitalizedSentence.append(firstLetterCapitalized).append(" ");
            }
        }

        //remove trailing space
        if(capitalizedSentence.length() > 0)
        {
            capitalizedSentence.setLength(capitalizedSentence.length() - 1);
        }

        return capitalizedSentence.toString();
    }

    /*
     * output: for 
     * redundance is a virtual crime it the world of programming => Redundance Is A Virtual Crime In The World Of Programming
     */
}
