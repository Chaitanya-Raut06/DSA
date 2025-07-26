import java.util.*;
public class MergeSort1
{
    public static void main(String args[])
    {
        int arr[]={3,2,4,1,3};
        int low=0;
        
        int high=arr.length-1;
        
        

        System.out.println("array before sorting :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        mergesort(arr,low,high);
       

        System.out.println("\narray after sorting :");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }



    }

  public static void  mergesort(int arr[], int low, int high)
    {
        if(low >=high) return;
        
            int mid = (low + high) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        
    }
   public static void merge(int arr[],int low,int mid,int high)
    {
        int temp[]=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        while ((left<=mid )&&(right<=high))
         {
            if(arr[left]<=arr[right])
            {
                temp[k]=arr[left];
                left++;
                k++;
            }

            else
            {
                temp[k]=arr[right];
                right++;
                k++;
            }
            
            
        }
        while (left <= mid)
         {
                temp[k] = arr[left];
                left++;
            }
            while (right <= high) {
                temp[k] = arr[right];
                right++;
            }
            for(int i=0;i<temp.length;i++)
            {
                arr[ i+low]=temp[i];
            }

    }  
}