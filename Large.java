class Large
 {
    public static int largestElement(int[] nums) 
    {
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]>max)
           {
             
             max=nums[i];
           }


        }
        return max;
    
    }
    public static void main(String []args)
    {
        int nums[]={1,3,4,5,9,1};
        
        int max=largestElement(nums);
        System.out.println("ANS:"+max);

    }
    
}