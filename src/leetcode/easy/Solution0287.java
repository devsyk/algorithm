package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/*
 * [LeetCode][287]Find the Duplicate Number
 * - 2022.09.18
 */
public class Solution0287 {
	public int findDuplicate(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();       
        for(int num : nums) {
            if(set.add(num) == false) {
                answer = num;
            }
        }
        return answer;
    }
}
