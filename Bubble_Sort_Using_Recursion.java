import java.io.*;

public class Bubble_Sort_Using_Recursion {
    // Recursive Bubble Sort function
    public static void sort(int arr[], int n) {
        // Base case: If array size is 1, return (already sorted)
        if (n == 1) 
            return;

        // One pass of Bubble Sort (pushing the largest element to the end)
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call for the remaining elements
        sort(arr, n - 1);
    }

    public static void main(String args[]) {
        // Correct array initialization
        int arr[] = {34, 23, 34, 56, 1, 3};
        int n = arr.length;

        System.out.println("Array Before Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sorting the array using recursion
        sort(arr, n);

        System.out.println("Array After Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 