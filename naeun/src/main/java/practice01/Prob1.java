package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		/* 코드 작성 */
		System.out.print("수를 입력하시오 : ");
		
		int a = scanner.nextInt();
		
		if((a % 3)==0) System.out.println("3의 배수입니다."); 
		
		//3의 배수가 아니다. 라고 else 처리 하는것이 좋을듯
		scanner.close();
	}
}
