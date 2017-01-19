import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Solution {

    public static void main(String[] args) {
        // take input t1, t2 and N
        Scanner sc = new Scanner(System.in);
        BigInteger t1 = sc.nextBigInteger();
        BigInteger t2 = sc.nextBigInteger();
        int N = sc. nextInt();
        
        //DP
        BigInteger fib =  BigInteger.ZERO;
        for(int i = 2; i<N; i++) {
             fib = (t2.multiply(t2)).add(t1);
             t1 = t2;
             t2 = fib;
        }
        
        //Print tn
        System.out.println(fib);       
    }
}