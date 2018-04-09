package problems;

public class DuplicateWord {
    static final int totalChar = 256;
    static void fillCharCounts(String str, int[] count)
    {
        for (int i = 0; i < str.length();  i++)
            count[str.charAt(i)]++;
    }
    static void printDups(String str)
    {
        // Create an array of size 256 and fill count of every character in it
        int count[] = new int[totalChar];
        fillCharCounts(str, count);
        for (int i = 0; i < totalChar; i++)
            if(count[i] > 1)
                System.out.printf("%c,  %d times \n", i,  count[i]);

    }
    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        printDups(st);
    }

}
