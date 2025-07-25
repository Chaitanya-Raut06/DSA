import java.io.*;
import java.util.ArrayList;
public class mergeSort
{
    static void merge(int arr[],int low,int mid,int high)
    {
        ArrayList<Integer> temp= new ArrayList<>();
        int left=low;
        int right=mid+1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    static void mergesort(int arr[],int low,int high)
    {
        if(low>=high) return;
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void main(String args[]) 
    {
        //Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        mergesort(arr, 0, n - 1);

        System.out.println("After sorting array: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}