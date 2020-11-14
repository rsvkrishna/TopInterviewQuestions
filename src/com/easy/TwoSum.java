package com.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //starter main
    public static void main(String[] args) {

        TwoSum a=new TwoSum();
        int nums[]={2,7,11,15}; int target =9;
        int[] res=a.twoSum(nums,target);
        System.out.println(Arrays.toString(res));

    }

    public int[] twoSum(int [] nums,int target){
        Map<Integer,Integer> numMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];

            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement),i};
            }
            numMap.put(nums[i],i);
        }
        return new int[]{0,0};
    }


}
