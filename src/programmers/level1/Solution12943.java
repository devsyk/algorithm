package programmers.level1;

/*
 * [프로그래머스][12943]콜라츠 추측
 * - 2022.09.13
 * 
 * 1-1. 입력된 수가 짝수라면 2로 나눕니다. 
 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
 * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다. 
 * 주어진 수가 1이 될 때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측
 * 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환
 * 
 * num은 1 이상 8,000,000 미만인 정수
 */
public class Solution12943 {
	public int solution(long num) {
		int r = 0;
		while (num != 1) {
			num = num % 2 == 0 ? num / 2 : (num * 3) + 1;
			r++;
		}
		return r > 500 ? -1 : r;
	}
}
