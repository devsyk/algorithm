package beakjoon;

/* 백준 문제풀이 - 여기부터 복사 / Main으로 클래스명 변경 */
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		/* Scanner, StringBuilder 사용 */
		Scanner in = new Scanner(System.in);
		// 값 입력 받음
		int N = in.nextInt();
		int X = in.nextInt();
		StringBuilder sb = new StringBuilder();
		
		// 입력받음과 동시에 StringBuilder에 저장
		for(int i = 0 ; i < N ; i++) { 
			// 값 입력받음
			int value = in.nextInt();
			// sb에 값 추가
			sb.append(value);
		}
		// 출력
		System.out.println(sb);	
	}
}
