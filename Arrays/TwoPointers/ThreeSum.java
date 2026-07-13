import java.util.ArrayList;
import java.util.Arrays;
import  java.util.List;
/* 
Problem: Three Sum

Link: https://leetcode.com/problems/3sum/description/

Approach: Two pointer approach - (Three pointers)

Time Complexity: O(n^3) --> O(n^2)
Space Complexity: O(1)

Key Idea: 
        1) Like the two pointer concept use another pointer
        2) if duplicates found skip till other value occurs
        3) compare all possible values with j and k and store it as list
        4) for every i check triplets are available
*/
public class ThreeSum
{
    public static List<List<Integer>> threesum(int[] arr)
    {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n - 2; i++)
        {
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int j = i + 1, k = n - 1;
            while(j < k)
            {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0)
                {
                    list.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    while(j < k && arr[j] == arr[j+1]) j++;
                    while(j < k && arr[k] == arr[k-1]) k--;
                    j++;
                    k--;
                }
                else if(sum > 0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return list;
    }
    public static void main(String[] args)
    {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.print(threesum(arr));
    }
}