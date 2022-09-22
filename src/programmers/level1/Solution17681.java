package programmers.level1;

/*
 * [프로그래머스][17681][1차]비밀지도
 * - 2022.09.21
 *   
 * n인 정사각형 배열 형태
 * 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽
 * 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백
 * "지도 1"과 "지도 2"는 각각 정수 배열로 암호화
 * 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열
 */
public class Solution17681 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        //2진법 배열로  
        String[] arrBi1 = new String[n];
        String[] arrBi2 = new String[n];
        for(int i=0; i<n; i++) {
            String str1 = Integer.toBinaryString(arr1[i]);
            int len1 = str1.length();		
            if (len1 < n) {
                for (int j = 0; j < n - len1; j++) {
                    str1 = "0" + str1;
                }
            }
            arrBi1[i] = str1;
            
            String str2 = Integer.toBinaryString(arr2[i]);
            int len2 = str2.length();		
            if (len2 < n) {
                for (int j = 0; j < n - len2; j++) {
                    str2 = "0" + str2;
                }
            }
            arrBi2[i] = str2;
        }      
        //두 배열 모두 0이면 0, 아니면 1
        for(int i=0; i<n; i++) {
            answer[i] = "";
            for(int j=0; j<n; j++) {              
                if(arrBi1[i].charAt(j) == '0' && arrBi2[i].charAt(j) == '0') {
                    answer[i] += " ";
                } else {
                    answer[i] += "#";
                }
            }            
        }        
        return answer;
    }
}
