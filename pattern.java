class pattern{
   static void pattern2(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = N; i >=1; i--)
    {
         // This is the inner loop which loops for the columns
        // no. of columns = row number for each line here.
        for (int j = i; j >= 1; j--)
        {
            System.out.print( j + "  ");
        }

         // As soon as stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        System.out.println();
    }
}

    public static void main(String[] args) {
        
        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int N = 5;
        pattern2(N);
    }
}