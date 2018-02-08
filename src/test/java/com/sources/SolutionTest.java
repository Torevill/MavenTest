package com.sources;

import org.junit.*;

import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Before
    public void showStart(){
        System.out.println("Testing. Come here, you @%^$%!!!");
    }
    @After
    public void showEnd(){
        System.out.println("End testing. Hooray!");
    }
    @Test
    public void testZero(){
        assertTrue(Solution.Fibonacci(0) == 0);
    }

    //some new reaaaaaaaly good tests

    //and some more logic

    //oh how cool I am!

    //oooooh, how strong my paws are!!!
}
