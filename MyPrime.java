//import static org.junit.Assert.fail;

//To test that all branches are being tested, call Assert.fail() before every intended
//return statement i.e. on EVERY BRANCH have a fail statement, and run the tests. Some branches should throw an assertion error.
//THis is good because it means the branch is being reached. So remove fail() call from
//these branches and reinstate them. Run again and repeat this process until no more
//Assertion Errors occur and any branches that still have fail() are therefore not being tested
//Write tests for those. => 100% branch coverage

public class MyPrime {
    public static boolean isPrime(long number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0) return false;
        if (number % 3 == 0) return false;
        int i = 4;
        for(long d = 5; d <= Math.sqrt(number); d += i) {
            if (number % d == 0) return false;
            i = 6 - i;
        }
        return true;
    }

    public static long[] primes(int primeCount) throws IllegalArgumentException {
        if (primeCount < 1) throw new IllegalArgumentException(
                "MyPrime.primes must be called with primeCount >= 1");
        return new long[1];
    }
}