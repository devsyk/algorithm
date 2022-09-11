package programmers.level1;

/*
 * [프로그래머스][12928]약수의 합
 * - 2022.09.10
 *   
 * 정수 n의 약수의 총합 리턴
 * n은 0 이상 3000이하인 정수
 */
public class Solution12928 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}
		return answer + n;
	}
}