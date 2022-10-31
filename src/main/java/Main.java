import java.util.Scanner;

import static org.junit.Assert.*;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    static int n = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter max number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sumOfNumbers(n);
        gaussianSumOfNumbers(n);

    }
    static int sumOfNumbers(int n) {
        long startTime = 0;
        int m = 0;
        for(int i = 0; i <= n; i++) {
            startTime = System.nanoTime();
            m+=i;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(m);
        System.out.println("Sum of Numbers is " + duration + " nanoseconds");
        return n;
    }
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        long startTime = 0;
        int m = 0;
        for(int i = 0; i <= n; i++) {
            startTime = System.nanoTime();
            m+=i;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(m);
        System.out.println("Gaussian is " + duration + " nanoseconds");
        return n;
    }
    // for Extra extra credit - compare the methods and show which one is faster
    // if n < 250000, result unclear
    // if n > 250000, the names of the methods are irrelevant. The last one to be called wins.
}
