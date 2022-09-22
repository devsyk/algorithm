package programmers.level1;

/*
 * [프로그래머스][81301]숫자 문자열과 영단어
 * - 2022.09.21
 *   
 * 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s
 * s가 의미하는 원래 숫자를 return 
 * 
 * 1 ≤ s의 길이 ≤ 50
 */
public class Solution81301 {
	public int solution(String s) {
        // 숫자 영단어를 배열에 인덱스 순으로 넣기
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"} ;
        // for문으로 문자열 일치 여부 확인
        for(int i=0; i<arr.length; i++) {            
            if(s.contains(arr[i])) {                
                s = s.replace(arr[i], String.valueOf(i));
            }
        }
        return Integer.parseInt(s);
    }
}
