package programmers.level1;

/*
 * [프로그래머스][12947]하샤드 수
 * - 2022.09.12
 * 
 * 양의 정수 x의 자릿수의 합으로 x가 나누어지는 하샤드수인지 검사
 * x는 1 이상, 10000 이하인 정수
 */
public class Solution12947 {
	public boolean solution(int x) {		
		int sum = 0;
        
        for(int i = 0; i < 4; i++) {
            int a = (int)Math.pow(10, i+1);
			int b = (int)Math.pow(10, i);
			int val = x % a / b;
            
			sum += val;
        }
        
        return x % sum == 0 ? true : false;         
    }
}
