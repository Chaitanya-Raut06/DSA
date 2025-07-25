import java.util.*;
public class insertionSort
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
        mergesort(arr,n);
    }

}