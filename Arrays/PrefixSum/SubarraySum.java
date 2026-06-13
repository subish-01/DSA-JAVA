package Arrays.PrefixSum;
/* 
Problem: Subarray Sum Equals K

Link: https://leetcode.com/problems/subarray-sum-equals-k/description/

Approach: prefixSum + HashMap

Time Complexity: O(n)
Space Complexity: O(n)

Key Idea: 
        1)use hashmap to calculate the frequency of prefixsum
        2)check whether prefixsum - k is present as a key in hashmap if so add the frequency to count
        3)The frequency count will be equal to the valid subarray sum equals to k
*/
import java.util.HashMap;

public class SubarraySum 
{
    public static int subsum(int[] nums,int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixsum = 0;
        int count = 0;
        int target = 0;
        for(int i = 0; i < nums.length; i++)
        {
            prefixsum = prefixsum + nums[i];
            target = prefixsum - k;
            if(map.containsKey(target))
            {
                count = count + map.get(target);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] nums = {1,-1,0,1,2,-1,3};
        int k = 3;
        System.out.println(subsum(nums,k));
    }
}
