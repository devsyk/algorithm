package programmers.level1;

/*
 * [프로그래머스][12912]두 정수 사이의 합
 * - 2022.09.13
 *   
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴
 * a와 b는 -10,000,000 이상 10,000,000 이하인 정수
 */
public class Solution12912 {
	public long solution(int a, int b) {
		long answer = 0;
		int start = (a < b) ? a : b;
		int end = (a < b) ? b : a;

		for(int i = start; i <= end; i++) {
			answer += i;
		}

		return answer;
	}
}
