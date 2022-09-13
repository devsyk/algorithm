package programmers.level1;

/*
 * [프로그래머스][12933]자연수 뒤집어 배열로 만들기
 * - 2022.09.12
 *   
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 return
 * n은 10,000,000,000이하인 자연수
 */
public class Solution12932 {
	public int[] solution(long n) {
        String strNum = Long.toString(n);
		int[] answer = new int[strNum.length()];

		for (int i = 0; i < strNum.length(); i++) {
			answer[i] = strNum.charAt((strNum.length() - 1) - i) - '0';
		}
		return answer;
    }
}
