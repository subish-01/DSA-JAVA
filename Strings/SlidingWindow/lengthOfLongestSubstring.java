package Strings.SlidingWindow;
/* 
Problem: Longest substring without repeating characters

Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

Approach: variable - sized sliding window + hashmap

Time Complexity: O(n)
Space Complexity: O(n)

Key Idea: 
        1) Right pointer will help us to expand until the condition is false
        2) left pointer will help us to shrink until the condition is true
        3) key idea is to add the index of the character which is already found 
        4) while expanding if the character is found again we will move the left pointer to index + 1
*/
import java.util.HashMap;

public class lengthOfLongestSubstring 
{
    public static int longestsubstring(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxlength = -1;
        for(int right = 0; right < s.length(); right++)
        {
            char ch = s.charAt(right);
            if(map.containsKey(ch))
            {
                left = Math.max(left,map.get(ch)+1);
            }
            map.put(ch,right);
            maxlength = Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
    public static void main(String[] args) 
    {
        String s = "abcabcbb";
        System.out.println(longestsubstring(s));
    }
}
