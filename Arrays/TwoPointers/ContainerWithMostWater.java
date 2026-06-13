package Arrays.TwoPointers;
/* 
Problem: Container with most water

Link: https://leetcode.com/problems/container-with-most-water/description/

Approach: Two pointer approach

Time Complexity: O(n)
Space Complexity: O(1)

Key Idea: 
        1)use two pointers to calculate the minimum height of the container
        2)calculate height of left or right position
        3)calculate width using right - left
        4)And area using height * width
*/
public class ContainerWithMostWater 
{
    public static int mostwater(int[] height)
    {
        int left = 0;
        int right = height.length -1;
        int h = 0;
        int w = 0;
        int maximum_area = 0;
        while(left < right)
        {
            if(height[left] < height[right])
            {
                h = Math.min(height[left],height[right]);
                w = right - left;
                maximum_area = Math.max(maximum_area,h*w);
                left++;
            }
            else
            {
                h = Math.min(height[left],height[right]);
                w = right - left;
                maximum_area = Math.max(maximum_area,h*w);
                right--;
            }
        }
        return maximum_area;
    }
    public static void main(String[] args) 
    {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostwater(height));
    }
}
