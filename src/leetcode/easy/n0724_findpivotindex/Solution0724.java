package leetcode.easy.n0724_findpivotindex;

public class Solution0724 {
	public int pivotIndex(int[] nums) {		
		int leftsum = 0;
                
        for(int i = 0; i < nums.length; i++) {
            int rightsum = 0;
            
            for(int j = i+1; j < nums.length; j++) {
                rightsum += nums[j];
            }
            
            if(leftsum == rightsum) {
                return i;
            } 
            
            leftsum += nums[i];
            
        }
        
        return -1;
    }
}
