package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int n = scanner.nextInt();
		if(n%2 == 1) {
			int a = 0;
			for(int i=0; i<=n; i++) {
				if(i%2 == 1) {
					a += i;
				}
			}
			System.out.println("결과값 : " + a);
		}
		else {
			int a = 0;
			for(int i=0; i<=n; i++) {
				if(i%2 == 0) {
					a += i;
				}
			}
			System.out.println("결과값 : " + a);
		}
		
		
		scanner.close();
	}
}
