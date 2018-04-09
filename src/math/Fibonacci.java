package math;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
    int prev = 0;
    int next = 1;
    for (int i=0;i<4;i++) {
        prev = prev + next;
        next = prev - next;
    System.out.println(next);
    }
    }
}
