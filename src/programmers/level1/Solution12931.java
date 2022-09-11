package programmers.level1;

/*
 * [프로그래머스][12931]자릿수 더하기
 * - 2022.09.10
 *   
 * 자연수 N의 각 자릿수의 합
 * N의 범위 : 100,000,000 이하의 자연수
 */
public class Solution12931 {
	public int solution(int n) {
        int answer = 0;
        
        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}