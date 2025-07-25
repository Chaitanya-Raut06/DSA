import java.util.*;
public class Frequency
{
    public static int frequent(int [] nums)
    {
        HashMap<Integer,Integer> freqmap= new HashMap<>();
        int maxFreq=0;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        { 
            freqmap.put(nums[i],freqmap.getOrDefault(nums[i],  0) + 1);
        }

        for(Map.Entry<Integer,Integer> i: freqmap.entrySet())
        {
           int key = i.getKey();
           int freq =  i.getValue();
             if (freq > maxFreq)
              {
                maxFreq = freq;
                ans = key;
            } 
            else if (freq == maxFreq) 
            {
                ans = Math.min(ans, key);
            }
        }
        return ans;
    }
     public static void main(String[] args) 
     {
        int[] nums = {4, 4, 5, 5, 6};
        System.out.println(frequent(nums));  // Output: 4
    }
}
        

