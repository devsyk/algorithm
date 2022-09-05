package leetcode.easy.n1480_runningsum;

public class Solution1480 {
	public int[] runningSum(int[] nums) {
        int res[] = new int[nums.length];
        int sum =0;
        
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res[i] = sum;        
            //res[i] = res[i-1] + nums[i];
        }
        
        return res;
    }
}
