/* Problem: Maximum sum subarray of size k

Link: https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

Approach: Fixed-size sliding window

Time Complexity: O(n)
Space Complexity: O(1)

Key Idea: 
        1) compute the window sum less than k
        2) add the next element and remove the previous element 
        3) compare the calculate the maximum value

*/

public class MaxSumSubarrayofsizeK 
{
    public static int maxsubarray(int[] arr, int k)
    {
        int window_sum = 0;
        for(int i = 0; i < k ; i++)
        {
            window_sum = window_sum + arr[i];
        }
        int max = window_sum;
        for(int j = k; j < arr.length; j++)
        {
            window_sum = window_sum + arr[j];
            window_sum = window_sum - arr[j - k];
            max = Math.max(max,window_sum);
        }
        return  max;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        int result = maxsubarray(arr, k);
        System.out.println(result);
    }
}
