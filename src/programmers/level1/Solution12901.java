package programmers.level1;

/*
 * [프로그래머스][12901]2016년
 * - 2022.09.22
 *   
 * 2016년 1월 1일은 금요일
 * 2016년 a월 b일이 무슨 요일인지 리턴
 * 
 * 2016년은 윤년
 * 2016년 a월 b일은 실제로 있는 날
 */
public class Solution12901 {
	public String solution(int a, int b) {        
        int[] dateArr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayArr = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        int dayCnt = 0; // a월 b일의 총 일수
        for(int i=0; i<a-1; i++) {
            dayCnt += dateArr[i];            
        }       
        int day = (dayCnt+b) % 7; // 요일 (0:목 1:금 2:토 ~ 6:수)        
        return dayArr[day];
    }
}
