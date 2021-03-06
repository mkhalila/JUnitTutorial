import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by mkhal on 22/11/2016.
 */
public class MyPrimeTest {
    //Ideally put each assert statement in it's own method
    @Test
    public void isPrimeShouldReturnTrueForPrimes() {
        System.out.println("MyPrimeTest for primes");
        assertEquals("3 is prime", true, MyPrime.isPrime(3));
        assertEquals("2 is prime", true, MyPrime.isPrime(2));
        assertEquals("7 is prime", true, MyPrime.isPrime(7));
        assertEquals("11 is prime", true, MyPrime.isPrime(11));
    }

    @Test
    public void isPrimeShouldReturnFalseForNonPrimes() {
        System.out.println("MyPrimeTest for non-primes");
        assertEquals("0 is not prime", false, MyPrime.isPrime(0));
        assertEquals("8 is not prime", false, MyPrime.isPrime(8));
        assertEquals("4 is not prime", false, MyPrime.isPrime(4));
        assertEquals("25 is not prime", false, MyPrime.isPrime(25));
        assertEquals("27 is not prime", false, MyPrime.isPrime(27));
    }

    //Takes name of Exception Class,
    //test only passes if code causes Exception to be thrown
    @Test(expected = IllegalArgumentException.class)
    public void primesShouldThrowExceptionFor0() {
        MyPrime.primes(0);
    }
}
