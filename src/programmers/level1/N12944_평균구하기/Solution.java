package programmers.level1.N12944_평균구하기;

public class Solution {
	public double solution(int[] arr) {        
        double sum = 0;
        double avg = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;                        
        }
        return avg;
    }
}
