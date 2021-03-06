import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);
        if(result.wasSuccessful()){
            System.out.println("All tests were successful");
        }
        else {
            System.out.println(result.getFailureCount() + " tests failed");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }
}