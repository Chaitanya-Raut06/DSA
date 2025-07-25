import java.io.*;
public class LARGEST1       
{
public static void main( String args[])
{
    int array[]={8,9,4,10,1,90,120};
   int max=array[0];
for(int i=0;i<array.length;i++)
{
    if(array[i]>max)
    {
          max=array[i];
    }
}
System.out.println(max);
}
}