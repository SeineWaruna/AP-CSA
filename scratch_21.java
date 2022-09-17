// Input : paper true soap floppy flower
// Output : floppy, flower, paper, soap, true

import java.util.*;
import java.io.*;

class Scratch {

    // Sorted an Array of String
    static void selectionSort(String arr[], int n) { // Sorting Method
        // สังเกตว่า ตย.นี้ใช้ static เข้ามาแปลว่าอะไร?
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array (original given array)
            int min_index = i;
            String minStr = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(minStr) < 0) { // if arr[j] is smaller than minStr
                    minStr = arr[j];
                    min_index = j;
                }
            }
            // Swapping the minimum element
            // Found with the first element
            if (min_index != i) {
                String temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i]= temp;
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = { "paper", "true", "soap", "floppy", "flower"}; // Dynamic Given Array
        int n = arr.length; // get array length
        System.out.println("The Given array is : ");
        for (int i = 0; i< n; i++) {
            System.out.println(i + ": " + arr[i]);
        }
        System.out.println();
        selectionSort(arr, n); // call selectionSort() method written outside main()
        System.out.println("The Sorted Array is: ");
        for (int i=0 ;i < n; i++) { // Printing Result - This example is written in main() instead of separated method
            System.out.println(i + " : " + arr[i]);
        }
    }
}