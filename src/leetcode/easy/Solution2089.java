package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * [LeetCode][2089]Find Target Indices After Sorting Array
 * - 2022.09.18
 */
public class Solution2089 {
	public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();       
        Arrays.sort(nums);       
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                list.add(i);
            }
        }       
        return list;
    }
}
