package com.mycompany.week8_skeletoncode_lab;

public class Main {

        public static void main(String[] args) {

            //ToDo 01: Test the linear search algorithm
            int arr[] = { 2, 3, 4, 10, 40 };
            int x = 10;
            int result = LinearSearch.search(arr, x);
            if (result == -1)
                System.out.println("Element is not present in array");
            else
                System.out.println("Element is present at index " + result);

            //ToDo 02: Test the binary search algorithm
            int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int key = 5;
            int low = 0;
            int high = sortedArray.length - 1;
            int index = BinarySearch.runBinarySearchIteratively(sortedArray, key, low, high);
            if (index == Integer.MAX_VALUE) {
                System.out.println("Key not found");
            } else {
                System.out.println("Key found at index: " + index);
            }

            //ToDo 03: Test the bubble sort algorithm
            int a[] = { 5, 4, 3, 2, 1 };
            int size = a.length;
            BubbleSort.bubbleSort(a, size);
            for (int i = 0; i < size; i++) {
                System.out.print(a[i] + " ");
            }

            //ToDo 04: Test the sum of primes algorithm
            int n = 10;
            System.out.println("Sum of primes: " + Problem01.getSumOfPrimes(n));
        }
}
