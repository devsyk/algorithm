package programmers.level1;

/*
 * [프로그래머스][12926]시저 암호
 * - 2022.09.20
 *   
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수
 * 예를 들어 "AB"는 1만큼 밀면 "BC", 3만큼 밀면 "DE"
 * 
 * 공백은 아무리 밀어도 공백
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있다
 * s의 길이는 8000이하
 * n은 1 이상, 25이하인 자연수
 */
public class Solution12926 {
	public String solution(String s, int n) {
        String answer = "";        
        //A~Z 65~90, a~z 97~122, 공백 32
        char[] arr = s.toCharArray();          
        for(char ch : arr) {    
            int charNum = (int)ch;
            int charNumR = (int)ch +n;                
            if(charNum == 32) { //공백
                answer += " ";
            } else if(charNum >= 65 && charNum <= 90) { //대문자                
                if(charNumR > 90) { //Z
                    answer += (char)(charNumR - 26);
                } else {
                    answer += (char)charNumR;
                }         
            } else if(charNum >= 97 && charNum <= 122) { //소문자
                if(charNumR > 122) { //z
                    answer += (char)(charNumR - 26);
                } else {
                    answer += (char)charNumR;
                }                 
            }  
        }
        return answer;
    }
}
