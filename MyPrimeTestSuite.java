//A Test Suite is a collection of tests, and can run a TestRunner on an entire TestSuite
//Rather than on individual Tests - Useful for SEG Walk and onwards...
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MyPrimeTest.class,
        IsPrimeTest.class,
})

public class MyPrimeTestSuite {
    // the class remains empty,
    // used only as a holder for the above annotations
}
