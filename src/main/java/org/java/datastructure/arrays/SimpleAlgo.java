package org.java.datastructure.arrays;

import java.util.HashMap;

public class SimpleAlgo {
    public static int[] returnSum(int[] nums, int target) //[5,2,4]
    {
        HashMap<Integer, Integer> storeTheValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if(storeTheValues.containsKey(nums[i]))
            {
                return new int[]{storeTheValues.get(nums[i]), i};
            }
            else
                storeTheValues.put(num, i);
        }

        return nums;
    }

    public static void main(String[] args) {

        String abc, xyz = null;



        int[] res = returnSum(new int[]{5,2,4}, 6);
        for (int a: res ) {
            System.out.println(a);
        }
        int res1 = removeDuplicates(new int[]{1,1,2});
        System.out.println(res1);
    }

    public static int removeDuplicates(int[] nums) {


        int i = 0;

        for (int j = nums.length-2; j >= 0; j++) {

        }

        return i;
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
        }
    }
}
