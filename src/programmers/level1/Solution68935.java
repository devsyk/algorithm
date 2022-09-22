package programmers.level1;

import java.util.ArrayList;
import java.util.List;

/*
 * [프로그래머스][68935]3진법 뒤집기
 * - 2022.09.20
 *   
 * n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return
 * n은 1 이상 100,000,000 이하인 자연수
 */
public class Solution68935 {
	public int solution(int n) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();

		// 10진법 -> 3진법
		int quo = 0; //몫
		int rem = 0; //나머지
		while (n > 0) {
			quo = n / 3;
			rem = n % 3;
			// 리스트에 넣기
			list.add(rem);
			// 초기화
			rem = 0;
			n = quo;
		}

		// 3진법 -> 10진법
		// 0*3^3 + 0*3^2 + 2*3^1 + 1*3^0 << 뒤에서부터 계산
		for (int i = 0; i < list.size(); i++) {
			answer += list.get(list.size() - 1 - i) * Math.pow(3, i); // i번째 원소 * 3의 i제곱
		}
		return answer;
	}
}
