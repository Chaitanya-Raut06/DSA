import java.util.*;
public class recursion
{
    public static int numbers(int num)
    {
        System.out.println(num);
        if(num==4) 
        return 0;


        return numbers(num+1);
        
    }
    public static void main(String args[])
    {
        numbers(0);

    }
}
