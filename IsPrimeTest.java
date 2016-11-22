import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//Parameterised Test
@RunWith(Parameterized.class)
public class IsPrimeTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {-5, false}, {-2, false}, {0, false}, {1, false}, {2, true},
                {3, true}, {4, false}, {5, true}, {6, false}, {7, true},
                {8, false}, {9, false}, {10, false}, {13, true}, {25, false},
                {35, false}, {49, false}

        });
    }

    private long fInput;
    private boolean fExpected;

    public IsPrimeTest(long input, boolean expected) {
        fInput = input;
        fExpected = expected;
    }

    @Test
    public void test() {
        System.out.println("IsPrimeTest for " + fInput);
        assertEquals("isPrime(" + fInput + ")", fExpected, MyPrime.isPrime(fInput));
    }
}
