package math;

public class FindMissingNumber {
    static int getMissingNum (int a[], int n)
    {
        int i, total;
        total  = (n+1)*(n+2)/2;
        for ( i = 0; i< n; i++)
            total -= a[i];
        return total;
    }

    /* program to test above function */
    public static void main(String args[])
    {
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int miss = getMissingNum(array,9);
        System.out.println(miss);
    }
}







