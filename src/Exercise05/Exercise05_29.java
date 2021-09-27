/*
 * (Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example,
 * 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin
 * primes. Write a program to find all twin primes less than 1,000. Display the output
 * as follows:
 * (3, 5)
 * (5, 7)
 * ...
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise05;
/**
 *
 * @author Name:Khushbu Oza
 *         Id: 20CS041
 *         Exercise05_29
 */
public class Exercise05_29 {
    public static void main(String[] args) {
    //Display prime number less then 1000 which has difference of 2.
    for(int i=2;i<1000;i++){
    //Prints the prime numbers of given condition
    if(primeNumber(i) && primeNumber(i+2)){
    System.out.printf("(%d, %d)\n", i, i + 2);
    }   
    }
    }
    public static boolean primeNumber(int n){
    //Test whether number is prime or not
    for(int i=2; i<=n/2; i++){
    //If false, number is prime
    if (n%i==0)
    return false;
    }
    return true;
    }
}
