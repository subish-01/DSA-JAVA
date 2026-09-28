package Searching;
public class Linear
{
    public static int linearsearch(int[] arr,int target)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {8,9,4,1,6,3,10,5,14,2};
        int target = 2;
        int result = linearsearch(arr,target);
        System.out.print(result);
    }
}
