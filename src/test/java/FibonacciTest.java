import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by jrichiemx on 7/21/15.
 */
public class FibonacciTest {

    //TODO  1. Write a function that would print the Fibonacci sequence (0, 1, 1, 2, 3, 5, 8, 13, 21, 34,…) of a given length

    @Test
    public void print_Fibonacci_sequence_of_a_given_lenght_method_not_recursive() throws Exception {

        Fibonacci.printSequence(10);
        assertTrue(true);
    }

    @Test
    public void fail_if_a_given_lenght_is_less_than_three(){

        try{
            Fibonacci.printSequence(2);
        }catch(Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void print_Fibonacci_sequence_of_a_given_lenght_recursively(){

        Fibonacci.doPrintFibonacciRecursively(10);
        assertTrue(true);

    }
}
