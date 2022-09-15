package programmers.level1;

/*
 * [프로그래머스][77884]약수의 개수와 덧셈
 * - 2022.09.15
 *   
 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return
 * 1 ≤ left ≤ right ≤ 1,000
 */
public class Solution77884 {
	public int solution(int left, int right) {
        int answer = 0;      
        for(int i = left; i <= right; i++) {
            int cnt = 0;       
            for(int j = 1; j <= i; j++) {
               if(i % j == 0) { cnt++; } 
            }           
            if(cnt%2==0) {
                answer += i;
            } else {
                answer += i * (-1);
            }
        }
        return answer;
    }
}
