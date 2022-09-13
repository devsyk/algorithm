package programmers.level1;

/*
 * [프로그래머스][12916]문자열 내 p와 y의 개수
 * - 2022.09.12
 *   
 * 문자열 s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 
 * 문자열 s의 길이 : 50 이하의 자연수
 * 문자열 s는 알파벳으로만 이루어져 있다
 */
public class Solution12916 {
	boolean solution(String s) {        
        int cntP = 0;
        int cntY = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                cntP++;
            } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                cntY++;
            }
        }
        return cntP == cntY;
    }
}
