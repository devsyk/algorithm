package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * [프로그래머스][68644]두 개 뽑아서 더하기
 * - 2022.09.22
 *   
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 
 * 배열에 오름차순으로 담아 return
 * 
 * numbers의 길이는 2 이상 100 이하
 * numbers의 모든 수는 0 이상 100 이하
 */
public class Solution68644 {
	public int[] solution(int[] numbers) {        
        // set(중복제거)
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        // set -> int배열
        // int[] answer = set.stream()
        //     .mapToInt(Integer::intValue)
        //     .toArray();
        int size = 0;
        int[] answer = new int[set.size()];
        for(int num : set){
            answer[size++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}
