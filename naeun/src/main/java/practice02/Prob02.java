package practice02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[ 5 ];
		double sum = 0;

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		System.out.println("5개의 숫자를 입력하세요.");
		
		/* 배열에 저장된 정수 값 더하기 */
		int all = 0;
		for(int i=0;i<intArray.length;i++) {
			intArray[i] = scanner.nextInt();
			 all += intArray[i];	
		}
		/* 출력 */
		sum = all/intArray.length;
		System.out.println("평균은 " + sum + " 입니다.");
		/* 자원정리 */
		scanner.close();
	}
}