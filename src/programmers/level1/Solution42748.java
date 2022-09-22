package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * [프로그래머스][42748]K번째수
 * - 2022.09.21
 *   
 * i부터 j까지 자른 배열을 정렬한 후의 k번째 숫자를 배열에 담아 return
 * 
 * array의 길이는 1 이상 100 이하, 각 원소는 1 이상 100 이하
 * commands의 길이는 1 이상 50 이하, 각 원소는 길이가 3
 */
public class Solution42748 {
	public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int index = commands[i][2];
            
            int[] arr = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(arr);            
            list.add(arr[index-1]);            
        }
        
        //list -> int형 array (toArray() 불가능)
        int[] answer = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
            answer[i] = list.get(i).intValue();
        }        
        return answer;
    }
}
