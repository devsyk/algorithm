package programmers.level1;

/*
 * [프로그래머스][12919]서울에서 김서방 찾기
 * - 2022.09.13
 * 
 * String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환
 * 
 * seoul은 길이 1 이상, 1000 이하인 배열
 * seoul의 원소는 길이 1 이상, 20 이하인 문자열
 * "Kim"은 반드시 seoul 안에 포함
 */
public class Solution12919 {
	public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break; //불필요한 반복 줄임
            }
        }       
        return answer;
    }
}
