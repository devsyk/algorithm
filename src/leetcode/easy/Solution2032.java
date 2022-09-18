package leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * [LeetCode][2032]Two Out of Three
 * - 2022.09.18
 */
public class Solution2032 {
	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();      
        for(int num : nums1) {
            set1.add(num);
        }
        for(int num : nums2) {
            set2.add(num);
        }
        for(int num : nums3) {
            set3.add(num);
        }
               
        Set<Integer> all = new HashSet<>();
        Set<Integer> res = new HashSet<>();        
        for(int num : set1) {
            all.add(num);
        }
        for(int num : set2) {
            if(!all.add(num)){
                res.add(num);
            }
        }
        for(int num : set3) {
            if(!all.add(num)){
                res.add(num);
            }
        }
        
        List<Integer> list = new ArrayList<>(res);
        return list;
    }
}
