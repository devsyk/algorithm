package programmers.level1;

/*
 * [프로그래머스][12935]제일 작은 수 제거하기
 * - 2022.09.14
 *   
 * 정수 배열 arr 에서 가장 작은 수를 제거한 배열을 return
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴
 * 
 * arr은 길이 1 이상인 배열
 * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j]
 */
public class Solution12935 {
	public int[] solution(int[] arr) {
		int[] answer = {};
		if (arr.length < 2) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[arr.length - 1];
			int min = Integer.MAX_VALUE;
			int minIndex = 0;
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
					minIndex = i;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if (i < minIndex) {
					answer[i] = arr[i];
				} else if (i > minIndex) {
					answer[i - 1] = arr[i];
				}
			}
		}
		return answer;
	}
}
