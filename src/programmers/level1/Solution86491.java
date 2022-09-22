package programmers.level1;

/*
 * [프로그래머스][86491]최소직사각형
 * - 2022.09.21
 *   
 * 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes
 * 가로로 눕혀 수납가능
 * 모든 명함을 수납할 수 있는 가장 작은 지갑의 크기 return
 * 
 * sizes의 길이는 1 이상 10,000 이하
 * [w, h] 형식
 * w와 h는 1 이상 1,000 이하인 자연수
 */
public class Solution86491 {
	public int solution(int[][] sizes) {   
        // 가로 세로 구분 없으므로 큰값을 가로, 작은 값을 세로로 보고 비교
        int maxW = 0; //가로
        int maxH = 0; //세로
        for(int i=0; i<sizes.length; i++) {
            // 각 명함의 가로와 세로 지정
            int w = Math.max(sizes[i][0], sizes[i][1]); //가로: 큰값
            int h = Math.min(sizes[i][0], sizes[i][1]); //세로: 작은값            
            // 명함들 중 가장 큰 가로와 세로 구하기
            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }        
        // 가장 큰 가로와 세로의 곱
        return maxW * maxH;
    }
}
