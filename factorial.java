import java.util.*;
public class factorial
{
public static int FC(int n)
{
    if(n==0)
    return 1;

    return n*FC(n-1);
}
public static void main(String args[])
{
   System.out.println( FC(4));
}
}