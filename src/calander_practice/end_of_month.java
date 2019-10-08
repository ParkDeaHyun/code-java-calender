package calander_practice;

import java.util.Scanner;

public class end_of_month {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("반복 할 횟수를 입력하세요.");
		int repeat = sc.nextInt();
	
		int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
      
		int i;
		
		
		for (i = 0; i < repeat; i++ ) {
			System.out.println("달을 입력하세요.");
			int month = sc.nextInt();
			System.out.printf("%d 월은, %d 일까지 있습니다." , month, maxDays[month -1]);
		}

		sc.close();
	}

}