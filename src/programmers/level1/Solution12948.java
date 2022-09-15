package programmers.level1;

/*
 * [프로그래머스][12948]핸드폰 번호 가리기
 * - 2022.09.14
 *   
 * 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 return
 * phone_number는 길이 4 이상, 20이하인 문자열
 */
public class Solution12948 {
	public String solution(String phone_number) {
		String answer = "";
		int len = phone_number.length();		
		if (len >= 4 && len <= 20) {
			String str = phone_number.substring(0, len - 4);
			answer = str.replaceAll("[0-9]", "*") + phone_number.substring(len - 4, len);
		}		
		return answer;
	}
}
