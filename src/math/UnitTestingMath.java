package math;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
    //Unit testing for factorial
        Factorial factorial = new Factorial();
        Assert.assertEquals(factorial.fact(4),24);
        System.out.println("Unit testing for factorial is passed");
        PrimeNumber pm = new PrimeNumber();

    }
}
