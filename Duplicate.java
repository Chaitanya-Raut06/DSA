import java.util.*;
public class Duplicate
{
    public static void main(String []args)
    {
        
        int i;
        int[] a ={0,0,0,0,1,1,1,1,2,2,22,3,3,3,444,4,4,4};
        int n= a.length;
        List<Integer>list = new ArrayList<>();
        list.add(a[0]);

        for ( i=1;i<n;i++){
            if(a[i]!=a[i-1]){
                list.add(a[i]);
            }
        }
        
            for( i=0;i<list.size();i++)
        {
            System.out.println(" "+list.get(i));
        }
    }
}