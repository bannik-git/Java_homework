package Homeworks.Seminar_5;


import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1};
       int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            numsMap.putIfAbsent(nums1[i], 0);
            numsMap.put(nums1[i], numsMap.get(nums1[i]) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (numsMap.get(nums2[i]) != null &&
                    numsMap.get(nums2[i]) != 0) {

                res.add(nums2[i]);
                numsMap.put(nums2[i], numsMap.get(nums2[i]) - 1);
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
