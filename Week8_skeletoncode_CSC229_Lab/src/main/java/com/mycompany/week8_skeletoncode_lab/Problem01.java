/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time
        long sum = 0;
        boolean[] isComposite = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                sum += i;
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        return sum;
    
    }
    /*The time complexity of the getSumOfPrimes method is O(n log log n).
    This is because we need to iterate over all numbers from 2 to n, and
    for each prime number, we need to mark all its multiples as composite.
    The space complexity of the getSumOfPrimes method is O(n), as we need
    to create a boolean array isComposite of size n+1 to mark all composite numbers.*/
    
}
