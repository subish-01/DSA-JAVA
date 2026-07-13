/* 
Problem: Minimum Size Subarray Sum

Link: https://leetcode.com/problems/minimum-size-subarray-sum/

Approach: variable-size sliding window

Time Complexity: O(n)
Space Complexity: O(1)

Key Idea: 
        1)growing phase until the condition to be met using right pointer
        2)Shrinking phase if the condition is met and next subarray is required using left pointer
*/

public class MinimumSizeSubarraySum 
{
    public static int minSubarray(int[] array,int target)
    {
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int right = 0; right < array.length; right++)
        {
            sum = sum + array[right];
            while(sum >= target)
            {
                ans = Math.min(ans,right - left + 1);
                sum = sum - array[left];
                left++;
            }
        }
        return ans == Integer.MAX_VALUE? 0 : ans;
    }
    public static void main(String[] args)
    {
        int[] array = {2,3,1,2,4,3};
        int target = 7;
        int res = minSubarray(array,target);
        System.out.println(res);
    }
}
