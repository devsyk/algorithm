package programmers.level1;

import java.util.ArrayList;
import java.util.List;

/*
 * [프로그래머스][12906]같은 숫자는 싫어
 * - 2022.09.19
 *   
 * 숫자 0부터 9까지로 이루어진 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return
 * 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지
 * 
 * 배열 arr의 크기 : 1,000,000 이하의 자연수
 */
public class Solution12906 {
	public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();            
        // int beforeNum = 0;    // 0으로 중복되어 시작되면 0은 추가 안됨
        int beforeNum = -1;
        for(int num : arr) {     
            if(num != beforeNum) {
                list.add(num);
            } 
            beforeNum = num;
        }                
        // 리스트 -> 배열
        int[] answer = new int[list.size()];       
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }       
        return answer;
    }
}
