package com.idark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by guoyakui on 2017/7/14.
 */
public class ThreeSum {



    public static List<List<Integer>> threeSum(int[] nums) {
        List result = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                continue;
            }
            for (int j = i + 1; j < nums.length; j++){
                for(int m = j+1; m < nums.length; m++){
                    if(-nums[i] == (nums[j] + nums[m])){
                        int[] a = {nums[i], nums[j], nums[m]};
                        Arrays.sort(a);
                        ArrayList<Integer> list = new ArrayList<>();
                        for (int n : a){
                            list.add(n);
                        }
                        if(!result.contains(list)){
                            result.add(list);
                        }
                    }
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        int[] b = {1, 0, -1};
        List<List<Integer>> lists = threeSum(b);
        System.out.println(lists);
    }


}
