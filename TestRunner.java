/*
 *  TestRunner.java
 *  Example JUnit test runner
 *  Sample code taken from http://www.tutorialspoint.com/junit/junit_environment_setup.htm
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        // Replace MyTestClass by your JUnit tests class
        Result result = JUnitCore.runClasses(MyPrimeTestSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
