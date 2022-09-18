package leetcode.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * [LeetCode][1046]Last Stone Weight
 * - 2022.09.18
 */
public class Solution1046 {
	public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for(int stone : stones) {
            list.add(stone);
        }
        
        while(list.size()>1){
            list.sort(Comparator.reverseOrder());
            int x = list.get(0)-list.get(1);
            list.remove(0);
            list.remove(0);
            list.add(x);
        }
        return list.get(0);
        
    }
}
