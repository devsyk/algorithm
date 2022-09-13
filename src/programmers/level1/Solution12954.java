package programmers.level1;

/*
 * [프로그래머스][12954]x만큼 간격이 있는 n개의 숫자
 * - 2022.09.13
 * 
 * 정수 x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴
 * x는 -10000000 이상, 10000000 이하인 정수
 * n은 1000 이하인 자연수
 */
public class Solution12954 {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++) {
            answer[i] = (long)x * (i+1); // 정수 x 형변환 필요
        }           
        return answer;
    }
}
