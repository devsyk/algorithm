package programmers.level1;

/*
 * [프로그래머스][76501]음양 더하기
 * - 2022.09.14
 *  
 * 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
 * 이 정수들의 부호를 차례대로 담은 불리언 배열 signs
 * 실제 정수들의 합을 구하여 return
 */
public class Solution76501 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;        
        for(int i=0; i<absolutes.length; i++) {
            if(signs[i] == false) {
                answer += absolutes[i] * (-1);
            } else {
                answer += absolutes[i];
            }
        }        
        return answer;
    }
}
