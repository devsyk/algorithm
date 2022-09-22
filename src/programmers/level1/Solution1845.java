package programmers.level1;

import java.util.HashSet;
import java.util.Set;

/*
 * [프로그래머스][1845]폰켓몬
 * - 2022.09.22
 *   
 * N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아,
 * 그때의 폰켓몬 종류 번호의 개수를 return
 * 
 * nums는 폰켓몬의 종류 번호가 담긴 1차원 배열
 * nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수
 * 폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수
 */
public class Solution1845 {
public int solution(int[] nums) {       
        //중복 없애기 위해 set으로 변환
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }               
        return (set.size() > nums.length/2) ? nums.length/2 : set.size();
    }
}
