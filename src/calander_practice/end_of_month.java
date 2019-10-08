package calander_practice;

import java.util.Scanner;

public class end_of_month {
	public static void main(String[]args) {
Scanner sc = new Scanner(System.in);

	System.out.println("입력한 월의 마지막 일자를 확인합니다.");
		int month = sc.nextInt();
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d 월은 %d 일까지 있습니다. /n", month, maxDays[month-1]);
		
		
//		if (month == 1){
//			System.out.println(maxDays[month-1]);
//		}
//		else if (month == 2){
//			System.out.println(maxDays[month-1]);
//		}
//		else if (month == 3){
//			System.out.println(maxDays[month-1]);
//		}
//		else if (month == 4){
//			System.out.println(maxDays[month-1]);
//		}
//		else if (month == 5){
//			System.out.println(maxDays[month-1]);
//		}
//		else if (month == 6){
//			System.out.println(maxDays[month-1]);
//		}
//		else if (month == 7){
//			System.out.println(maxDays[month-1]);
//		}
//		else if (month == 8){
//			System.out.println(maxDays[month-1]);
//		}
//		else if (month == 9){
//			System.out.println(maxDays[month-1]);
//		}
//		else if (month == 10){
//			System.out.println(maxDays[month-1]);
//		}
//		else if (month == 11){
//			System.out.println(maxDays[month-1]);
//		}
//		else if (month == 12){
//			System.out.println(maxDays[month-1]);
//		}
		sc.close();
}
	
}