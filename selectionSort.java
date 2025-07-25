import java.util.*;
public class selectionSort
{
    public static void main(String args[])
    {
        
        int arr[]={7,21,33,1,44,66};
        int n = arr.length;
        System.out.println("Array Before Sorting");
        for(int i=0;i<n;i++)
        {
        System.out.println(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Array After Sorting");
        selectionsort(arr,n);
    }
    static void selectionsort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}