package programmers.level1;

/*
 * [프로그래머스][82612]부족한 금액 계산하기
 * - 2022.09.19
 *   
 * 놀이기구의 원래 이용료는 price원, 놀이기구 N번째 이용하면 price의 N배
 * 놀이기구를 count번 타게 되면 현재금액 money에서 얼마가 모자라는지를 return
 * 
 * price : 1 ≤ price ≤ 2,500
 * money : 1 ≤ money ≤ 1,000,000,000
 * count : 1 ≤ count ≤ 2,500
 */
public class Solution82612 {
	public long solution(int price, int money, int count) {
        int num = 0;
        long sum = 0; //long으로 변수설정..       
        for(int i = 1; i <= count; i++) {
            num = i * price;
            sum += num;          
        }                
        return (money < sum) ? sum - money : 0;
    }
}
