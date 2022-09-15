package programmers.level1;

/*
 * [프로그래머스][12922]수박수박수박수박수박수?
 * - 2022.09.14
 *   
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 return
 * n은 길이 10,000이하인 자연수
 */
public class Solution12922 {
	public String solution(int n) {
		// 자바11부터 추가된 String 메소드 : String.repeat()
        //return n%2==0 ? "수박".repeat(n/2) : "수박".repeat(n/2)+"수";
		
		String result = "";
	    for(int i = 0; i < n; i++) {
	    	result += (i % 2 == 0) ? "수" : "박";
	    }
	    return result;	    
    }
}
