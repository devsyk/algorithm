package programmers.level1;

/*
 * [프로그래머스][12918]문자열 다루기 기본
 * - 2022.09.15
 *   
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인
 * s는 길이 1 이상, 길이 8 이하인 문자열
 * s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있다
 */
public class Solution12918 {
public boolean solution(String s) {        
        String regex = "[0-9]{4}|[0-9]{6}";
        return s.matches(regex);
    }
}
