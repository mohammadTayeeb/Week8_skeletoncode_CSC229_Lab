/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - provide asymptotic analysis of the developed solution
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    /*As for the asymptotic analysis of the algorithm, the worst-case time complexity of linear search is O(n), where n is the size of the array.
    This is because in the worst case, we may have to traverse the entire array to find the element we are looking for.
    However, in the best-case scenario, where the element we are searching for is at the beginning of the array, the time complexity of the algorithm would be O(1).
    In general, the average case time complexity of linear search is O(n/2) or simply O(n),
    since we would need to traverse about half the array on average to find the element.*/

    
}
