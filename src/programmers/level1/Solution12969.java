package programmers.level1;

import java.util.Scanner;

/*
 * [프로그래머스][12969]직사각형 별찍기
 * - 2022.09.15
 *   
 * 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력
 * n과 m은 각각 1000 이하인 자연수
 */
public class Solution12969 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();        
        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
