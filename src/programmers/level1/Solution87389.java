package programmers.level1;

/*
 * [프로그래머스][87389]나머지가 1이 되는 수 찾기
 * - 2022.09.10
 *   
 * n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return
 * 3 ≤ n ≤ 1,000,000
 */
public class Solution87389 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			// 나머지가 1이되는 수 찾기
			if (n % i == 1) {
				answer = i;
				break; // 나머지가 1인 가장 작은 자연수 나올 경우 for문 종료
			}
		}
		return answer;
	}
}