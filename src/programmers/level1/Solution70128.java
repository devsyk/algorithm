package programmers.level1;

/*
 * [프로그래머스][70128]내적
 * - 2022.09.15
 *   
 * a와 b의 내적을 return
 * a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] (n은 a, b의 길이)
 * 
 * a, b의 길이는 1 이상 1,000 이하
 * a, b의 모든 수는 -1,000 이상 1,000 이하
 */
public class Solution70128 {
	public int solution(int[] a, int[] b) {
        int answer = 0;        
        for(int i=0; i<a.length; i++) {
            answer += a[i] * b[i];
        }        
        return answer;
    }
}
