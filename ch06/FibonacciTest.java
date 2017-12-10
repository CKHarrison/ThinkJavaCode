import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class FibonacciTest extends TestCase {
    
    /**
     * A test method.
     * (Replace "X" with a name describing the test.  You may write as
     * many "testSomething" methods in this class as you wish, and each
     * one will be called when running JUnit over this class.)
     */
    public void testFibonacci() {
        assertEquals(1, Series.fibonacci(1));
        assertEquals(1, Series.fibonacci(2));
        assertEquals(2, Series.fibonacci(3));
    }
    
}
