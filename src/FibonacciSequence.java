public class FibonacciSequence {
    /*
     * Write a program to generate the fibonacci sequence up to 100
     */
    public static void main(String[] args) {
        int n = 100; // set the limit for the fibonacci sequence

        //initialize the first two fibonnaci numbers
        int previous = 0;
        int current = 1;

        //print the first fibonacci numbers (0 and 1)
        System.out.println(previous + " " +current);

        //generate fibonacci sequence up to n
        while (true)
        {
            int next = previous + current;
            if(next > n)
            {
                break;
            }
            System.out.println(" " + next);
            previous = current;
            current = next;
        }
    }
    /*
     * output
     * 0 1
        1
        2
        3
        5
        8
        13
        21
        34
        55
        89
     */
}
