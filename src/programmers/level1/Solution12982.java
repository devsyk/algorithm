package programmers.level1;

/*
 * [프로그래머스][12982]예산
 * - 2022.09.20
 *   
 * 전체 예산이 정해져 있어 모든 부서가 아닌 최대한 많은 부서의 물품을 구매
 * 물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해야 함
 * 최대 몇 개의 부서에 물품을 지원할 수 있는지 return
 * 
 * d는 부서별로 신청한 금액이 들어있는 배열 (길이: 1 이상 100 이하)
 * d의 각 원소는 1 이상 100,000 이하
 * 1 ≤ budget ≤ 10,000,000
 */
public class Solution12982 {
	public int solution(int[] d, int budget) {
        int answer = 0;
        //차례로 누적 합해서 budget과 비교
        int sum = 0;
        for(int i=0; i<d.length; i++) {
            sum += d[i];
            if(sum > budget) break;        
            //원소 개수 구하기
            answer++;
        }
        return answer;
    }
}
