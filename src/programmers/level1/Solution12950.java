package programmers.level1;

/*
 * [프로그래머스][12950]행렬의 덧셈
 * - 2022.09.15
 *   
 * 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과를 반환
 * 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않는다.
 */
public class Solution12950 {
	public int[][] solution(int[][] arr1, int[][] arr2) {        
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++) {   
            for(int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];      
            }
        }
        return answer;
    }
}
