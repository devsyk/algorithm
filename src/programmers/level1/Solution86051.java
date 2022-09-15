package programmers.level1;

/*
 * [프로그래머스][86051]없는 숫자 더하기
 * - 2022.09.14
 *   
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return
 * 1 ≤ numbers의 길이 ≤ 9
 * 0 ≤ numbers의 모든 원소 ≤ 9
 * numbers의 모든 원소는 서로 다르다
 */
public class Solution86051 {
	public int solution(int[] numbers) {
        int answer = 0;       
        for(int num : numbers) {
            answer += num;
        }        
        return 45 - answer;
    }
}
