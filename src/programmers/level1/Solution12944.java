package programmers.level1;

/*
 * [프로그래머스][12944]평균 구하기
 * - 2022.09.10
 *   
 * 정수를 담고 있는 배열 arr의 평균값을 return
 * arr은 길이 1 이상, 100 이하
 * arr의 원소는 -10,000 이상 10,000 이하인 정
 */
public class Solution12944 {
	public double solution(int[] arr) {        
        double sum = 0;
        
        for(int num : arr) {
            sum += num;
        }
        return sum / arr.length;    
    }
}
