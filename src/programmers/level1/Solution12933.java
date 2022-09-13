package programmers.level1;

import java.util.Arrays;

/*
 * [프로그래머스][12933]정수 내림차순으로 배치하기
 * - 2022.09.12
 *   
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 return
 * n은 1이상 8000000000 이하인 자연수
 */
public class Solution12933 {
	public long solution(long n) {
        String answer = "";
        String strNum = Long.toString(n);
        
        char[] arr = new char[strNum.length()];
        
        for(int i=0; i<strNum.length(); i++) {
            arr[i] = strNum.charAt(i);
        }
        
        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0; i--) {
            answer += arr[i];
        }

        return Long.parseLong(answer);
    }
}
