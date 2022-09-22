package programmers.level1;

/*
 * [프로그래머스][12940]최대공약수와 최소공배수
 * - 2022.09.19
 *   
 * 두 수의 최대공약수와 최소공배수를 배열로 반환
 * 두 수는 1이상 1000000이하의 자연수
 */
public class Solution12940 {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];       
        //최소 공배수 * 최대 공약수 = n * m        
        //최대공약수 : n과 m 모두로 나누어떨어지는 수
        //최소공배수 : (n과 m의 곱) / 최대공약수
        int min = Math.min(n, m);
        for(int i=1; i<=min; i++) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = (n * m) / answer[0];
            }
        }             
        return answer;
    }
}
