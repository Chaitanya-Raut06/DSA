import java.io.*;
public class LARGEST
{
public static void main( String args[])
{
    int array[]={8,9,4,10,1,90,120};
   int max=Integer.MIN_VALUE;
for(int i=0;i<array.length;i++)
{
    if(array[i]>Integer.MIN_VALUE)
    {
          max=array[i];
    }
}
System.out.println(max);
}
}