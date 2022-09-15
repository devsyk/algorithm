package programmers.level1;

/*
 * [프로그래머스][12903]가운데 글자 가져오기
 * - 2022.09.14
 *   
 * 단어 s의 가운데 글자를 반환
 * s는 길이가 1 이상, 100이하인 문자열
 */
public class Solution12903 {
	public String solution(String s) {
        String answer = "";        
        int len = s.length();
        if(len%2==0){
            answer = String.valueOf(s.charAt(len/2-1));
        }
        answer += String.valueOf(s.charAt(len/2));
        return answer;
    }
}
