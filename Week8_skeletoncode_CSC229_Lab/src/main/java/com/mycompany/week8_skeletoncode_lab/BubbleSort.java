/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if (a[inner] > a[inner + 1]) {
                    // swap a[inner] and a[inner + 1]
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                /*Time complexity of bubble sort algorithm, it is O(n^2), where n is the size of the array.
                This is because in the worst case, we need to iterate over the array n times, and for each iteration,
                we need to compare and swap adjacent elements, resulting in a total of n^2 comparisons and swaps.
                In the best case scenario where the array is already sorted, the time complexity of bubble sort
                algorithm would be O(n), as we would only need to iterate over the array once to detect that
                it's already sorted.*/
            }
        }
    }
    
    
}
