package sources;

import org.junit.*;

import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Before
    public void showStart(){
        System.out.println("Testing");
    }
    @After
    public void showEnd(){
        System.out.println("End testing");
    }
    @Test
    public void testZero(){
        assertTrue(Solution.Fibonacci(0) == 0);
    }
}
