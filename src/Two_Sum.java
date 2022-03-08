import java.util.HashMap;
import java.util.Map;

public class Two_Sum
{
    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.*/

    public static void main(String[] args)
    {


        int target = 9;
        int[] arr = {2,7,11,15};
        int[] copy = twosum(arr,target);

        for (int i = 0; i < copy.length;i++)
        {
            System.out.println(copy[i] + "");
        }



    }

    public static int[] twosum(int[] nums, int target)
    {
        Map<Integer,Integer> nums_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];

            if(nums_map.containsKey(complement)) {
                return new int[]{nums_map.get(complement),i};
            }
            nums_map.put(nums[i], i);
        }
        return new int[]{0};

    }
}
