package Arrays.TwoPointers;

import java.util.Arrays;

/* 
Problem: Move zeros to the end of the array

Link: https://leetcode.com/problems/move-zeroes/description/

Approach: Two pointer approach

Time Complexity: O(n)
Space Complexity: O(1)

Key Idea: 
        1)Left pointer will take care of swapping elements
        2)Right pointer will take care of handling the non-zero elements
        3)If the right pointer has non-zero element swap it with the left pointer
        4)by repeating the process zeroes will move to the end of the array
*/
public class MoveZeros 
{
    public static int[] movezeroes(int[] nums)
    {
        int left = 0;
        for(int right = 0; right < nums.length; right++)
        {
            if(nums[right] != 0)
            {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        return nums;
    }
    public static void main(String[] args)
    {
        int[] nums = {0,1,0,3,12};
        int[] result = movezeroes(nums);
        System.out.println(Arrays.toString(result));
    }
}
