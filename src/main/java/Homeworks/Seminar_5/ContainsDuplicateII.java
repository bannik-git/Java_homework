package Homeworks.Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;

        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(numsMap.containsKey(nums[i]) && Math.abs(numsMap.get(nums[i]) - i) <= k) {
                return true;
            }
            numsMap.put(nums[i], i);
        }
        return false;
    }
}
