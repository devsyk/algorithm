package programmers.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * [프로그래머스][12910]나누어 떨어지는 숫자 배열
 * - 2022.09.14
 *   
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환
 * 
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 
 * array는 길이 1 이상인 배열
 */
public class Solution12910 {
	public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();     
        for(int num : arr) {
            if(num % divisor == 0) {
                list.add(num);
            }
        }       
        list.sort(Comparator.naturalOrder());
        int[] answer = {};
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()]; 
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}
