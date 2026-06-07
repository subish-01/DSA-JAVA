package Arrays.TwoPointers;
/* 
Problem: Two Sum II input array is sorted

Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

Approach: Two pointer approach

Time Complexity: O(n)
Space Complexity: O(1)

Key Idea: 
        1)keep left pointer at index - 0, and right pointer at last index
        2)add elements from array[left] and array[right]
        3)if sum > target decrease right pointer
        4)if sum < target increase left pointer
*/
public class TwoSumII 
{
    public static int[] twosum(int[] array,int target)
    {
        int left = 0;
        int right = array.length;
        while(left < right)
        {
            int sum = array[left] + array[right];
            if(sum == target)
            {
                return new int[]{left+1,right+1};
            }
            else if(sum > target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) 
    {
        int[] array = {2,7,11,15};
        int target = 18;
        int[] result = twosum(array,target);
    }
}
