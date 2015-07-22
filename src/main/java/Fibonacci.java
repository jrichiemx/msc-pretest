/**
 * Created by jrichiemx on 7/21/15.
 */
public class Fibonacci {

    //TODO  1. Write a function that would print the Fibonacci sequence (0, 1, 1, 2, 3, 5, 8, 13, 21, 34,…) of a given length
    public static void printSequence(int given_lenght) throws Exception {

        //At least we need 2 as the given length to perform fibonacci
        if(given_lenght >= 2 ){

            int fibonacciSequence = 0;
            int [] sequence = new int[given_lenght];
            for(int i=0; i<given_lenght ; i++){

                // each number is the sum of the previous two numbers
                if(i < 2 ){
                    System.out.println("" + i);
                    sequence[i] = i;
                }
                else{
                    sequence[i] += sequence[i-1] + sequence[i-2];
                    System.out.println("" + sequence[i]);
                }
            }
        }else
            throw new Exception("at least three is need as the given lenght");


    }


    public static long printSequenceRecursively(long n){

        if ( n <=1  ){
            return n;
        }else{
            return  printSequenceRecursively(n-1) + printSequenceRecursively(n-2);

        }

    }

    public static void doPrintFibonacciRecursively(long given_lenght){
        for (long counter = 0; counter <= given_lenght; counter++){
            System.out.println(printSequenceRecursively(counter));
        }

    }


}
