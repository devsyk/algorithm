package programmers.level1;

/*
 * [프로그래머스][12937]짝수와 홀수
 * - 2022.09.10
 *   
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환
 * 0은 짝수
 */
public class Solution12937 {
	public String solution(int num) {
		return (num % 2 == 0) ? "Even" : "Odd";
	}
}