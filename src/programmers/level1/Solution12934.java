package programmers.level1;

/*
 * [프로그래머스][12934]정수 제곱근 판별
 * - 2022.09.10
 *   
 * 양의 정수 n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 아니라면 -1을 리턴
 * n은 1이상, 50000000000000 이하인 양의 정수
 */
public class Solution12934 {
	public long solution(long n) {
		// 양의 정수 n의 제곱근을 구한다(Math.sqrt())
        double res = Math.sqrt(n);                
        if(res % 1 == 0) {  // 제곱근이 양의 정수일 경우
            return (long)((res+1)*(res+1)); // x+1의 제곱 리턴
        } else {
            return -1;
        }
    }
}