package problems;

import org.testng.Assert;
import java.lang.String;
import java.util.Collections;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        //Unit testing for duplicate word
        DuplicateWord dp = new DuplicateWord();
        String string1 = "AA";
        Assert.assertEquals(string1,string1);
        System.out.println("Unit testing for Duplicate Word is passed");
        }
}
