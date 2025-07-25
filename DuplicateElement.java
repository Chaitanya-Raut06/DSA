import java.util.*;
public class DuplicateElement
{
public static void main(String args[])
{
    int arr[] = {1,1,1,33,44,44,33}; // Direct initialization

    System.out.println("is there same element exist:"+element(arr));
}
 public static boolean element(int arr[])
 {
    for(int i=0;i<arr.length;i++)
    {
        int search=arr[i];
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            return true;
            
           
        }
    }
     return false;
 }
}